/**
 */
package org.xtext.example.mydsl.myDsl01;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Button#getKind <em>Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl01.Button#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getButton()
 * @model
 * @generated
 */
public interface Button extends UIElement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl01.ButtonKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl01.ButtonKind
   * @see #setKind(ButtonKind)
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getButton_Kind()
   * @model
   * @generated
   */
  ButtonKind getKind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl01.Button#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl01.ButtonKind
   * @see #getKind()
   * @generated
   */
  void setKind(ButtonKind value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.xtext.example.mydsl.myDsl01.MyDsl01Package#getButton_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl01.Button#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Button
