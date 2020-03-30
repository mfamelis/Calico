/**
 */
package Database;

import calico.components.CConnector;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Database.Edge#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see Database.DatabasePackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' attribute.
	 * @see #setConnector(CConnector)
	 * @see Database.DatabasePackage#getEdge_Connector()
	 * @model dataType="Database.CConnector"
	 * @generated
	 */
	CConnector getConnector();

	/**
	 * Sets the value of the '{@link Database.Edge#getConnector <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' attribute.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(CConnector value);

} // Edge
