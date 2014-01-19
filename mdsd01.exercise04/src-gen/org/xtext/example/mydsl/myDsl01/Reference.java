/**
 */
package org.xtext.example.mydsl.myDsl01;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Reference#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Reference#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Reference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getReference()
 * @model
 * @generated
 */
public interface Reference extends Property
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getReference_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl01.Reference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl01.MultiplicityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl01.MultiplicityKind
   * @see #setMultiplicity(MultiplicityKind)
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getReference_Multiplicity()
   * @model
   * @generated
   */
  MultiplicityKind getMultiplicity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl01.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl01.MultiplicityKind
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(MultiplicityKind value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Reference)
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getReference_Opposite()
   * @model
   * @generated
   */
  Reference getOpposite();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl01.Reference#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Reference value);

} // Reference
