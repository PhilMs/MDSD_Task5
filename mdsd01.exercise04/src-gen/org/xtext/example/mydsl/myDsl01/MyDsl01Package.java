/**
 */
package org.xtext.example.mydsl.myDsl01;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl01.MyDsl01Factory
 * @model kind="package"
 * @generated
 */
public interface MyDsl01Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl01";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl01";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl01";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDsl01Package eINSTANCE = org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Windows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__WINDOWS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.EntityImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.PropertyImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.AttributeImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTIONAL = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.ReferenceImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__MULTIPLICITY = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.WindowImpl <em>Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.WindowImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getWindow()
   * @generated
   */
  int WINDOW = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__NAME = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__ENTITY = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__TITLE = 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__SIZE = 3;

  /**
   * The number of structural features of the '<em>Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.ListWindowImpl <em>List Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.ListWindowImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getListWindow()
   * @generated
   */
  int LIST_WINDOW = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_WINDOW__NAME = WINDOW__NAME;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_WINDOW__ENTITY = WINDOW__ENTITY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_WINDOW__TITLE = WINDOW__TITLE;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_WINDOW__SIZE = WINDOW__SIZE;

  /**
   * The number of structural features of the '<em>List Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_WINDOW_FEATURE_COUNT = WINDOW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.EntryWindowImpl <em>Entry Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.EntryWindowImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getEntryWindow()
   * @generated
   */
  int ENTRY_WINDOW = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW__NAME = WINDOW__NAME;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW__ENTITY = WINDOW__ENTITY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW__TITLE = WINDOW__TITLE;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW__SIZE = WINDOW__SIZE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW__ELEMENTS = WINDOW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entry Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_WINDOW_FEATURE_COUNT = WINDOW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.SizeImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getSize()
   * @generated
   */
  int SIZE = 8;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.BoundsImpl <em>Bounds</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.BoundsImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getBounds()
   * @generated
   */
  int BOUNDS = 9;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDS__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDS__Y = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDS__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDS__HEIGHT = 3;

  /**
   * The number of structural features of the '<em>Bounds</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.UIElementImpl <em>UI Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.UIElementImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getUIElement()
   * @generated
   */
  int UI_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT__BOUNDS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>UI Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.LabelImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getLabel()
   * @generated
   */
  int LABEL = 11;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__BOUNDS = UI_ELEMENT__BOUNDS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = UI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__TEXT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.FieldImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getField()
   * @generated
   */
  int FIELD = 12;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__BOUNDS = UI_ELEMENT__BOUNDS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = UI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__PROPERTY = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.impl.ButtonImpl
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getButton()
   * @generated
   */
  int BUTTON = 13;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BOUNDS = UI_ELEMENT__BOUNDS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = UI_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__KIND = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.AttributeType
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 14;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.MultiplicityKind
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getMultiplicityKind()
   * @generated
   */
  int MULTIPLICITY_KIND = 15;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl01.ButtonKind <em>Button Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl01.ButtonKind
   * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getButtonKind()
   * @generated
   */
  int BUTTON_KIND = 16;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl01.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl01.Model#getWindows <em>Windows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Windows</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Model#getWindows()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Windows();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Entity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Entity#isAbstract()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl01.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl01.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Attribute#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Attribute#isOptional()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Optional();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl01.Reference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Reference#getType()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Reference#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Reference#getMultiplicity()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Multiplicity();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl01.Reference#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Reference#getOpposite()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Opposite();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Window</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Window
   * @generated
   */
  EClass getWindow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Window#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Window#getName()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl01.Window#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Window#getEntity()
   * @see #getWindow()
   * @generated
   */
  EReference getWindow_Entity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Window#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Window#getTitle()
   * @see #getWindow()
   * @generated
   */
  EAttribute getWindow_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl01.Window#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Window#getSize()
   * @see #getWindow()
   * @generated
   */
  EReference getWindow_Size();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.ListWindow <em>List Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Window</em>'.
   * @see org.xtext.example.mydsl.myDsl01.ListWindow
   * @generated
   */
  EClass getListWindow();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.EntryWindow <em>Entry Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Window</em>'.
   * @see org.xtext.example.mydsl.myDsl01.EntryWindow
   * @generated
   */
  EClass getEntryWindow();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl01.EntryWindow#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl01.EntryWindow#getElements()
   * @see #getEntryWindow()
   * @generated
   */
  EReference getEntryWindow_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Bounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounds</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Bounds
   * @generated
   */
  EClass getBounds();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Bounds#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Bounds#getX()
   * @see #getBounds()
   * @generated
   */
  EAttribute getBounds_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Bounds#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Bounds#getY()
   * @see #getBounds()
   * @generated
   */
  EAttribute getBounds_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Bounds#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Bounds#getWidth()
   * @see #getBounds()
   * @generated
   */
  EAttribute getBounds_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Bounds#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Bounds#getHeight()
   * @see #getBounds()
   * @generated
   */
  EAttribute getBounds_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.UIElement <em>UI Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Element</em>'.
   * @see org.xtext.example.mydsl.myDsl01.UIElement
   * @generated
   */
  EClass getUIElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl01.UIElement#getBounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounds</em>'.
   * @see org.xtext.example.mydsl.myDsl01.UIElement#getBounds()
   * @see #getUIElement()
   * @generated
   */
  EReference getUIElement_Bounds();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.UIElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl01.UIElement#getName()
   * @see #getUIElement()
   * @generated
   */
  EAttribute getUIElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Label#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Label#getText()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl01.Field#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Field#getProperty()
   * @see #getField()
   * @generated
   */
  EReference getField_Property();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl01.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Button#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Button#getKind()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Kind();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl01.Button#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.myDsl01.Button#getText()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Text();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl01.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see org.xtext.example.mydsl.myDsl01.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl01.MultiplicityKind <em>Multiplicity Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicity Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl01.MultiplicityKind
   * @generated
   */
  EEnum getMultiplicityKind();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl01.ButtonKind <em>Button Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Button Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl01.ButtonKind
   * @generated
   */
  EEnum getButtonKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDsl01Factory getMyDsl01Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__WINDOWS = eINSTANCE.getModel_Windows();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.EntityImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__ABSTRACT = eINSTANCE.getEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.PropertyImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.AttributeImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPTIONAL = eINSTANCE.getAttribute_Optional();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.ReferenceImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__MULTIPLICITY = eINSTANCE.getReference_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.WindowImpl <em>Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.WindowImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getWindow()
     * @generated
     */
    EClass WINDOW = eINSTANCE.getWindow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__NAME = eINSTANCE.getWindow_Name();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOW__ENTITY = eINSTANCE.getWindow_Entity();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW__TITLE = eINSTANCE.getWindow_Title();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOW__SIZE = eINSTANCE.getWindow_Size();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.ListWindowImpl <em>List Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.ListWindowImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getListWindow()
     * @generated
     */
    EClass LIST_WINDOW = eINSTANCE.getListWindow();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.EntryWindowImpl <em>Entry Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.EntryWindowImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getEntryWindow()
     * @generated
     */
    EClass ENTRY_WINDOW = eINSTANCE.getEntryWindow();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY_WINDOW__ELEMENTS = eINSTANCE.getEntryWindow_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.SizeImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.BoundsImpl <em>Bounds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.BoundsImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getBounds()
     * @generated
     */
    EClass BOUNDS = eINSTANCE.getBounds();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.UIElementImpl <em>UI Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.UIElementImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getUIElement()
     * @generated
     */
    EClass UI_ELEMENT = eINSTANCE.getUIElement();

    /**
     * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_ELEMENT__BOUNDS = eINSTANCE.getUIElement_Bounds();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_ELEMENT__NAME = eINSTANCE.getUIElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.LabelImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.FieldImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__PROPERTY = eINSTANCE.getField_Property();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.impl.ButtonImpl
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__KIND = eINSTANCE.getButton_Kind();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.AttributeType
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.MultiplicityKind
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getMultiplicityKind()
     * @generated
     */
    EEnum MULTIPLICITY_KIND = eINSTANCE.getMultiplicityKind();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl01.ButtonKind <em>Button Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl01.ButtonKind
     * @see org.xtext.example.mydsl.myDsl01.impl.MyDsl01PackageImpl#getButtonKind()
     * @generated
     */
    EEnum BUTTON_KIND = eINSTANCE.getButtonKind();

  }

} //MyDsl01Package
