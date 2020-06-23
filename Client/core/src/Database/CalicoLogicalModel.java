/**
 */
package Database;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calico Logical Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Database.CalicoLogicalModel#getCanvas <em>Canvas</em>}</li>
 * </ul>
 *
 * @see Database.DatabasePackage#getCalicoLogicalModel()
 * @model
 * @generated
 */
public interface CalicoLogicalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' containment reference list.
	 * The list contents are of type {@link Database.Canvas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' containment reference list.
	 * @see Database.DatabasePackage#getCalicoLogicalModel_Canvas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Canvas> getCanvas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String toAlloyModel();

} // CalicoLogicalModel
