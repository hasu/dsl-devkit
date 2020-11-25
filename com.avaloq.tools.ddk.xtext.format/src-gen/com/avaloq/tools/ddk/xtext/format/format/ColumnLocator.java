/**
 */
package com.avaloq.tools.ddk.xtext.format.format;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isFixed <em>Fixed</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getValue <em>Value</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isRelative <em>Relative</em>}</li>
 *   <li>{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isNobreak <em>Nobreak</em>}</li>
 * </ul>
 *
 * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator()
 * @model
 * @generated
 */
public interface ColumnLocator extends Locator
{
  /**
   * Returns the value of the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' attribute.
   * @see #setFixed(boolean)
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator_Fixed()
   * @model
   * @generated
   */
  boolean isFixed();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isFixed <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' attribute.
   * @see #isFixed()
   * @generated
   */
  void setFixed(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(IntValue)
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator_Value()
   * @model containment="true"
   * @generated
   */
  IntValue getValue();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(IntValue value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(XExpression)
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator_Parameter()
   * @model containment="true"
   * @generated
   */
  XExpression getParameter();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(XExpression value);

  /**
   * Returns the value of the '<em><b>Relative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relative</em>' attribute.
   * @see #setRelative(boolean)
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator_Relative()
   * @model
   * @generated
   */
  boolean isRelative();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isRelative <em>Relative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relative</em>' attribute.
   * @see #isRelative()
   * @generated
   */
  void setRelative(boolean value);

  /**
   * Returns the value of the '<em><b>Nobreak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nobreak</em>' attribute.
   * @see #setNobreak(boolean)
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage#getColumnLocator_Nobreak()
   * @model
   * @generated
   */
  boolean isNobreak();

  /**
   * Sets the value of the '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isNobreak <em>Nobreak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nobreak</em>' attribute.
   * @see #isNobreak()
   * @generated
   */
  void setNobreak(boolean value);

} // ColumnLocator
