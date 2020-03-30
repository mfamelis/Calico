/**
 */
package Database;

import calico.components.CGroup;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Database.Node#getGroupe <em>Groupe</em>}</li>
 * </ul>
 *
 * @see Database.DatabasePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Groupe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe</em>' attribute.
	 * @see #setGroupe(CGroup)
	 * @see Database.DatabasePackage#getNode_Groupe()
	 * @model dataType="Database.CGroup"
	 * @generated
	 */
	CGroup getGroupe();

	/**
	 * Sets the value of the '{@link Database.Node#getGroupe <em>Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe</em>' attribute.
	 * @see #getGroupe()
	 * @generated
	 */
	void setGroupe(CGroup value);

} // Node
