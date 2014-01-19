/**
 */
package org.xtext.example.mydsl.myDsl01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Model#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl01.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl01.Window}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Windows</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getModel_Windows()
   * @model containment="true"
   * @generated
   */
  EList<Window> getWindows();

} // Model
