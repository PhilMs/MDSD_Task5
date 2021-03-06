/*
* generated by Xtext
*/
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl01.*;


/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class MyDsl01JavaValidator extends org.xtext.example.mydsl.validation.AbstractMyDsl01JavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	
	
	@Check
	public void abstractEntityHasSubEntity(Entity entity) {
		
		Model m = (Model)entity.eContainer();
		
		if(entity.isAbstract() == true)
		{
			for(Entity e : m.getEntities())
			{
				if(e.getSuperType() == entity)
					return;
			}
			
			error("Abstract entity has no sub entity", entity, null, MyDsl01Package.ENTITY);
		}		
	}
	
	@Check
	public void entityHasCycle(Entity entity) {
		
		Entity e = entity;
		
		while(e.getSuperType() != null)
		{
			e = e.getSuperType();
			
			if(e == entity)
			{
				error("Cycle detected for entity", entity, null, MyDsl01Package.ENTITY);
				return;
			}
		}
	}
	
	@Check
	public void correctReferenceMultiplicity(Reference reference)
	{
		Entity owner = (Entity)reference.eContainer();
		Entity e = reference.getType();
		
		for(Property p : e.getProperties())
		{
			if(p instanceof Reference)
			{
				Reference r = (Reference)p;
				
				if(r.getType() == owner)
				{
					String c1 = reference.getMultiplicity().equals("*") ? "*" : "1";
					String c2 = r.getMultiplicity().equals("*") ? "*" : "1";
					
					if(c1.equals(c2))
					{
						error("The cardinalities must not be equal!", reference, null, MyDsl01Package.REFERENCE);
						return;
					}
				}
			}
		}
	}
	
	
	@Check
	public void checkOverlap(UIElement element)
	{
		EntryWindow ew = (EntryWindow)element.eContainer();
		
		for(UIElement e : ew.getElements())
		{
			if(element == e)
				continue;
			
			if(element.getBounds().getX() < e.getBounds().getX() + e.getBounds().getWidth() && element.getBounds().getX() >= e.getBounds().getX())
			{
				if(element.getBounds().getY() < e.getBounds().getY() + e.getBounds().getHeight() && element.getBounds().getY() >= e.getBounds().getY())
				{
					warning("Overlapping elements", e, null, MyDsl01Package.UI_ELEMENT);
					return;
				}
			}
				
		}
	}
	
	public Field fieldOfProperty(EntryWindow entrywindow, Property property)
	{
		for(UIElement el : entrywindow.getElements())
		{
			if(el instanceof Field)
			{
				Field f = (Field)el;
				
				if(f.getProperty() == property)
				{
					return f;
				}
			}
		}
		
		return null;
	}
	
	@Check
	public void checkRequiredProperties(EntryWindow entrywindow)
	{
		Entity e = entrywindow.getEntity();
		
		for(Property p : e.getProperties())
		{
			if(p instanceof Attribute)
			{
				Attribute a = (Attribute)p;
				if(fieldOfProperty(entrywindow, a) == null)
				{
					if(a.isOptional() == true)
						warning("Field for optional property not found!", p, null, MyDsl01Package.ENTRY_WINDOW__ELEMENTS);
					else
						error("Field for non-optional property not found!", p, null, MyDsl01Package.ENTRY_WINDOW__ELEMENTS);
				}
			}
			if(p instanceof Reference)
			{
				Reference r = (Reference)p;
				if(fieldOfProperty(entrywindow, r) == null)
				{
					if(r.getMultiplicity().equals("*"))
						warning("Field for optional property not found!", p, null, MyDsl01Package.ENTRY_WINDOW__ELEMENTS);
					else
						error("Field for non-optional property not found!", p, null, MyDsl01Package.ENTRY_WINDOW__ELEMENTS);
				}
			}
		}
	}
	
	@Check
	public void checkNumberOfFieldsForProperty(Field field)
	{
		EntryWindow ew = (EntryWindow)field.eContainer();
		
		for(UIElement el : ew.getElements())
		{
			if(el instanceof Field)
			{
				if(el != field)
				{
					Property p1 = ((Field)el).getProperty();
					Property p2 = ((Field)field).getProperty();
					
					if(p1 == p2)
					{
						warning("Multiple fields for one property!", field, null, MyDsl01Package.FIELD__PROPERTY);
						return;
					}
				}
			}
		}
	}
	
	@Check
	public void checkForCreateEditButton(EntryWindow entrywindow)
	{
		boolean found = false;
		for(UIElement el : entrywindow.getElements())
		{
			if(el instanceof Button)
			{
				if(((Button) el).getKind() == ButtonKind.CREATE_EDIT)
				{
					found = true;
					break;
				}
			}
		}
		
		if(!found)
		{
			error("Create/Edit button not found!", entrywindow, null, MyDsl01Package.ENTRY_WINDOW);
		}
	}
	
	@Check
	public void checkForMultipleWindowsForOneEntity(Entity entity)
	{
		boolean list = false;
		boolean entry = false;
		
		for(Window w : ((Model)entity.eContainer()).getWindows())
		{
			if(w instanceof EntryWindow)
			{
				EntryWindow ew = (EntryWindow)w;
				
				if(ew.getEntity() == entity && !entry)
					entry = true;
				else if(ew.getEntity() == entity && entry)
					error("Multiple entry windows for one entity", w, null, MyDsl01Package.ENTRY_WINDOW);
			}
			if(w instanceof ListWindow)
			{
				ListWindow lw = (ListWindow)w;
				
				if(lw.getEntity() == entity && !list)
					entry = true;
				else if(lw.getEntity() == entity && list)
					error("Multiple list windows for one entity", w, null, MyDsl01Package.LIST_WINDOW);
			}
		}
	}
}
