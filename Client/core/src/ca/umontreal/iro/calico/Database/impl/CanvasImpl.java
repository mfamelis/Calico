/**
 */
package ca.umontreal.iro.calico.Database.impl;

import ca.umontreal.iro.calico.Database.Canvas;
import ca.umontreal.iro.calico.Database.DatabasePackage;
import ca.umontreal.iro.calico.Database.Edge;
import ca.umontreal.iro.calico.Database.Node;

import calico.components.CCanvas;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.iro.calico.Database.impl.CanvasImpl#getCCanvas <em>CCanvas</em>}</li>
 *   <li>{@link ca.umontreal.iro.calico.Database.impl.CanvasImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.umontreal.iro.calico.Database.impl.CanvasImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanvasImpl extends NamedElementImpl implements Canvas {
	/**
	 * The default value of the '{@link #getCCanvas() <em>CCanvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCanvas()
	 * @generated
	 * @ordered
	 */
	protected static final CCanvas CCANVAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCanvas() <em>CCanvas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCanvas()
	 * @generated
	 * @ordered
	 */
	protected CCanvas cCanvas = CCANVAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CCanvas getCCanvas() {
		return cCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCanvas(CCanvas newCCanvas) {
		CCanvas oldCCanvas = cCanvas;
		cCanvas = newCCanvas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.CANVAS__CCANVAS, oldCCanvas, cCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, DatabasePackage.CANVAS__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<Edge>(Edge.class, this, DatabasePackage.CANVAS__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toAlloySpec() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.CANVAS__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case DatabasePackage.CANVAS__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.CANVAS__CCANVAS:
				return getCCanvas();
			case DatabasePackage.CANVAS__NODE:
				return getNode();
			case DatabasePackage.CANVAS__EDGE:
				return getEdge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.CANVAS__CCANVAS:
				setCCanvas((CCanvas)newValue);
				return;
			case DatabasePackage.CANVAS__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case DatabasePackage.CANVAS__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends Edge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabasePackage.CANVAS__CCANVAS:
				setCCanvas(CCANVAS_EDEFAULT);
				return;
			case DatabasePackage.CANVAS__NODE:
				getNode().clear();
				return;
			case DatabasePackage.CANVAS__EDGE:
				getEdge().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabasePackage.CANVAS__CCANVAS:
				return CCANVAS_EDEFAULT == null ? cCanvas != null : !CCANVAS_EDEFAULT.equals(cCanvas);
			case DatabasePackage.CANVAS__NODE:
				return node != null && !node.isEmpty();
			case DatabasePackage.CANVAS__EDGE:
				return edge != null && !edge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatabasePackage.CANVAS___TO_ALLOY_SPEC:
				return toAlloySpec();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cCanvas: ");
		result.append(cCanvas);
		result.append(')');
		return result.toString();
	}

} //CanvasImpl
