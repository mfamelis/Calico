/**
 */
package ca.umontreal.iro.calico.Database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.umontreal.iro.calico.Database.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://exemple.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.umontreal.iro.calico.Database.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.iro.calico.Database.impl.NamedElementImpl
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.iro.calico.Database.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.iro.calico.Database.impl.NodeImpl
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To Alloy Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___TO_ALLOY_SPEC = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.umontreal.iro.calico.Database.impl.CalicoLogicalModelImpl <em>Calico Logical Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.iro.calico.Database.impl.CalicoLogicalModelImpl
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCalicoLogicalModel()
	 * @generated
	 */
	int CALICO_LOGICAL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALICO_LOGICAL_MODEL__CANVAS = 0;

	/**
	 * The number of structural features of the '<em>Calico Logical Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALICO_LOGICAL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>To Alloy Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALICO_LOGICAL_MODEL___TO_ALLOY_MODEL = 0;

	/**
	 * The operation id for the '<em>Get Current Canvas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALICO_LOGICAL_MODEL___GET_CURRENT_CANVAS = 1;

	/**
	 * The number of operations of the '<em>Calico Logical Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALICO_LOGICAL_MODEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.umontreal.iro.calico.Database.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.iro.calico.Database.impl.EdgeImpl
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SRC = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To Alloy Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___TO_ALLOY_SPEC = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_UUID = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.umontreal.iro.calico.Database.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.iro.calico.Database.impl.CanvasImpl
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>CCanvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__CCANVAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NODE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__EDGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To Alloy Spec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS___TO_ALLOY_SPEC = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>CGroup</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calico.components.CGroup
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCGroup()
	 * @generated
	 */
	int CGROUP = 5;

	/**
	 * The meta object id for the '<em>CConnector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calico.components.CConnector
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCConnector()
	 * @generated
	 */
	int CCONNECTOR = 6;

	/**
	 * The meta object id for the '<em>CCanvas</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calico.components.CCanvas
	 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCCanvas()
	 * @generated
	 */
	int CCANVAS = 7;


	/**
	 * Returns the meta object for class '{@link ca.umontreal.iro.calico.Database.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ca.umontreal.iro.calico.Database.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.iro.calico.Database.Node#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see ca.umontreal.iro.calico.Database.Node#getNode()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Node();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.Node#toAlloySpec() <em>To Alloy Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Alloy Spec</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.Node#toAlloySpec()
	 * @generated
	 */
	EOperation getNode__ToAlloySpec();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.iro.calico.Database.CalicoLogicalModel <em>Calico Logical Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calico Logical Model</em>'.
	 * @see ca.umontreal.iro.calico.Database.CalicoLogicalModel
	 * @generated
	 */
	EClass getCalicoLogicalModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.iro.calico.Database.CalicoLogicalModel#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Canvas</em>'.
	 * @see ca.umontreal.iro.calico.Database.CalicoLogicalModel#getCanvas()
	 * @see #getCalicoLogicalModel()
	 * @generated
	 */
	EReference getCalicoLogicalModel_Canvas();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.CalicoLogicalModel#toAlloyModel() <em>To Alloy Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Alloy Model</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.CalicoLogicalModel#toAlloyModel()
	 * @generated
	 */
	EOperation getCalicoLogicalModel__ToAlloyModel();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.CalicoLogicalModel#getCurrentCanvas() <em>Get Current Canvas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Canvas</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.CalicoLogicalModel#getCurrentCanvas()
	 * @generated
	 */
	EOperation getCalicoLogicalModel__GetCurrentCanvas();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.iro.calico.Database.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see ca.umontreal.iro.calico.Database.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.iro.calico.Database.Edge#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see ca.umontreal.iro.calico.Database.Edge#getEdge()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Edge();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.iro.calico.Database.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ca.umontreal.iro.calico.Database.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.iro.calico.Database.Edge#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see ca.umontreal.iro.calico.Database.Edge#getSrc()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Src();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.Edge#toAlloySpec() <em>To Alloy Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Alloy Spec</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.Edge#toAlloySpec()
	 * @generated
	 */
	EOperation getEdge__ToAlloySpec();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.Edge#getUUID() <em>Get UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get UUID</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.Edge#getUUID()
	 * @generated
	 */
	EOperation getEdge__GetUUID();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.iro.calico.Database.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see ca.umontreal.iro.calico.Database.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.iro.calico.Database.Canvas#getCCanvas <em>CCanvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCanvas</em>'.
	 * @see ca.umontreal.iro.calico.Database.Canvas#getCCanvas()
	 * @see #getCanvas()
	 * @generated
	 */
	EAttribute getCanvas_CCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.iro.calico.Database.Canvas#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see ca.umontreal.iro.calico.Database.Canvas#getNode()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.iro.calico.Database.Canvas#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see ca.umontreal.iro.calico.Database.Canvas#getEdge()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Edge();

	/**
	 * Returns the meta object for the '{@link ca.umontreal.iro.calico.Database.Canvas#toAlloySpec() <em>To Alloy Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Alloy Spec</em>' operation.
	 * @see ca.umontreal.iro.calico.Database.Canvas#toAlloySpec()
	 * @generated
	 */
	EOperation getCanvas__ToAlloySpec();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.iro.calico.Database.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ca.umontreal.iro.calico.Database.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.iro.calico.Database.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.umontreal.iro.calico.Database.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for data type '{@link calico.components.CGroup <em>CGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CGroup</em>'.
	 * @see calico.components.CGroup
	 * @model instanceClass="calico.components.CGroup"
	 * @generated
	 */
	EDataType getCGroup();

	/**
	 * Returns the meta object for data type '{@link calico.components.CConnector <em>CConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CConnector</em>'.
	 * @see calico.components.CConnector
	 * @model instanceClass="calico.components.CConnector"
	 * @generated
	 */
	EDataType getCConnector();

	/**
	 * Returns the meta object for data type '{@link calico.components.CCanvas <em>CCanvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CCanvas</em>'.
	 * @see calico.components.CCanvas
	 * @model instanceClass="calico.components.CCanvas"
	 * @generated
	 */
	EDataType getCCanvas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.umontreal.iro.calico.Database.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.iro.calico.Database.impl.NodeImpl
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE = eINSTANCE.getNode_Node();

		/**
		 * The meta object literal for the '<em><b>To Alloy Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___TO_ALLOY_SPEC = eINSTANCE.getNode__ToAlloySpec();

		/**
		 * The meta object literal for the '{@link ca.umontreal.iro.calico.Database.impl.CalicoLogicalModelImpl <em>Calico Logical Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.iro.calico.Database.impl.CalicoLogicalModelImpl
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCalicoLogicalModel()
		 * @generated
		 */
		EClass CALICO_LOGICAL_MODEL = eINSTANCE.getCalicoLogicalModel();

		/**
		 * The meta object literal for the '<em><b>Canvas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALICO_LOGICAL_MODEL__CANVAS = eINSTANCE.getCalicoLogicalModel_Canvas();

		/**
		 * The meta object literal for the '<em><b>To Alloy Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALICO_LOGICAL_MODEL___TO_ALLOY_MODEL = eINSTANCE.getCalicoLogicalModel__ToAlloyModel();

		/**
		 * The meta object literal for the '<em><b>Get Current Canvas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALICO_LOGICAL_MODEL___GET_CURRENT_CANVAS = eINSTANCE.getCalicoLogicalModel__GetCurrentCanvas();

		/**
		 * The meta object literal for the '{@link ca.umontreal.iro.calico.Database.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.iro.calico.Database.impl.EdgeImpl
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__EDGE = eINSTANCE.getEdge_Edge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SRC = eINSTANCE.getEdge_Src();

		/**
		 * The meta object literal for the '<em><b>To Alloy Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___TO_ALLOY_SPEC = eINSTANCE.getEdge__ToAlloySpec();

		/**
		 * The meta object literal for the '<em><b>Get UUID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___GET_UUID = eINSTANCE.getEdge__GetUUID();

		/**
		 * The meta object literal for the '{@link ca.umontreal.iro.calico.Database.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.iro.calico.Database.impl.CanvasImpl
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>CCanvas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANVAS__CCANVAS = eINSTANCE.getCanvas_CCanvas();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__NODE = eINSTANCE.getCanvas_Node();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__EDGE = eINSTANCE.getCanvas_Edge();

		/**
		 * The meta object literal for the '<em><b>To Alloy Spec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CANVAS___TO_ALLOY_SPEC = eINSTANCE.getCanvas__ToAlloySpec();

		/**
		 * The meta object literal for the '{@link ca.umontreal.iro.calico.Database.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.iro.calico.Database.impl.NamedElementImpl
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em>CGroup</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calico.components.CGroup
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCGroup()
		 * @generated
		 */
		EDataType CGROUP = eINSTANCE.getCGroup();

		/**
		 * The meta object literal for the '<em>CConnector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calico.components.CConnector
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCConnector()
		 * @generated
		 */
		EDataType CCONNECTOR = eINSTANCE.getCConnector();

		/**
		 * The meta object literal for the '<em>CCanvas</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calico.components.CCanvas
		 * @see ca.umontreal.iro.calico.Database.impl.DatabasePackageImpl#getCCanvas()
		 * @generated
		 */
		EDataType CCANVAS = eINSTANCE.getCCanvas();

	}

} //DatabasePackage
