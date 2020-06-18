/**
 */
package ca.umontreal.iro.calico.Database;

import calico.components.CGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.calico.Database.Node#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(CGroup)
	 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getNode_Node()
	 * @model dataType="ca.umontreal.iro.calico.Database.CGroup"
	 * @generated
	 */
	CGroup getNode();

	/**
	 * Sets the value of the '{@link ca.umontreal.iro.calico.Database.Node#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(CGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String toAlloySpec();

} // Node
