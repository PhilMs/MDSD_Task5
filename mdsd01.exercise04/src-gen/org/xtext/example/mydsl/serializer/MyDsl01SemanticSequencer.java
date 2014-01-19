package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl01.Attribute;
import org.xtext.example.mydsl.myDsl01.Bounds;
import org.xtext.example.mydsl.myDsl01.Button;
import org.xtext.example.mydsl.myDsl01.Entity;
import org.xtext.example.mydsl.myDsl01.EntryWindow;
import org.xtext.example.mydsl.myDsl01.Field;
import org.xtext.example.mydsl.myDsl01.Label;
import org.xtext.example.mydsl.myDsl01.ListWindow;
import org.xtext.example.mydsl.myDsl01.Model;
import org.xtext.example.mydsl.myDsl01.MyDsl01Package;
import org.xtext.example.mydsl.myDsl01.Reference;
import org.xtext.example.mydsl.myDsl01.Size;
import org.xtext.example.mydsl.services.MyDsl01GrammarAccess;

@SuppressWarnings("all")
public class MyDsl01SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDsl01GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDsl01Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDsl01Package.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.BOUNDS:
				if(context == grammarAccess.getBoundsRule()) {
					sequence_Bounds(context, (Bounds) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.BUTTON:
				if(context == grammarAccess.getButtonRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUIElementRule()) {
					sequence_Button_UIElement(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.ENTRY_WINDOW:
				if(context == grammarAccess.getEntryWindowRule() ||
				   context == grammarAccess.getWindowRule()) {
					sequence_EntryWindow(context, (EntryWindow) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUIElementRule()) {
					sequence_Field_UIElement(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUIElementRule()) {
					sequence_Label_UIElement(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.LIST_WINDOW:
				if(context == grammarAccess.getListWindowRule() ||
				   context == grammarAccess.getWindowRule()) {
					sequence_ListWindow(context, (ListWindow) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.REFERENCE:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case MyDsl01Package.SIZE:
				if(context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=AttributeType optional?='optional'?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=INT y=INT width=INT height=INT)
	 */
	protected void sequence_Bounds(EObject context, Bounds semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.BOUNDS__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.BOUNDS__X));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.BOUNDS__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.BOUNDS__Y));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.BOUNDS__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.BOUNDS__WIDTH));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.BOUNDS__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.BOUNDS__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_5_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getBoundsAccess().getWidthINTTerminalRuleCall_7_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getBoundsAccess().getHeightINTTerminalRuleCall_9_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID kind=ButtonKind? text=STRING?)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID kind=ButtonKind? text=STRING? bounds=Bounds)
	 */
	protected void sequence_Button_UIElement(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (abstract?='abstract'? name=ID superType=[Entity|ID]? properties+=Property*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entity=[Entity|ID] title=STRING? size=Size elements+=UIElement*)
	 */
	protected void sequence_EntryWindow(EObject context, EntryWindow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID property=[Property|ID])
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID property=[Property|ID] bounds=Bounds)
	 */
	protected void sequence_Field_UIElement(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.UI_ELEMENT__BOUNDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.UI_ELEMENT__BOUNDS));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.UI_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.UI_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.FIELD__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.FIELD__PROPERTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldAccess().getPropertyPropertyIDTerminalRuleCall_3_0_1(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getUIElementAccess().getBoundsBoundsParserRuleCall_1_0(), semanticObject.getBounds());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING?)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING? bounds=Bounds)
	 */
	protected void sequence_Label_UIElement(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entity=[Entity|ID] title=STRING? size=Size)
	 */
	protected void sequence_ListWindow(EObject context, ListWindow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entities+=Entity* windows+=Window*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[Entity|ID] multiplicity=MultiplicityKind? opposite=[Reference|ID])
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.SIZE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, MyDsl01Package.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDsl01Package.Literals.SIZE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_2_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_4_0(), semanticObject.getHeight());
		feeder.finish();
	}
}
