/**
 */
package ca.umontreal.iro.calico.Database;

import calico.components.CCanvas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.calico.Database.Canvas#getCCanvas <em>CCanvas</em>}</li>
 *   <li>{@link ca.umontreal.iro.calico.Database.Canvas#getNode <em>Node</em>}</li>
 *   <li>{@link ca.umontreal.iro.calico.Database.Canvas#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends NamedElement {
	/**
	 * Returns the value of the '<em><b>CCanvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCanvas</em>' attribute.
	 * @see #setCCanvas(CCanvas)
	 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getCanvas_CCanvas()
	 * @model dataType="ca.umontreal.iro.calico.Database.CCanvas"
	 * @generated
	 */
	CCanvas getCCanvas();

	/**
	 * Sets the value of the '{@link ca.umontreal.iro.calico.Database.Canvas#getCCanvas <em>CCanvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCanvas</em>' attribute.
	 * @see #getCCanvas()
	 * @generated
	 */
	void setCCanvas(CCanvas value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link ca.umontreal.iro.calico.Database.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getCanvas_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link ca.umontreal.iro.calico.Database.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see ca.umontreal.iro.calico.Database.DatabasePackage#getCanvas_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String toAlloySpec();

} // Canvas
