package ca.umontreal.iro.calico.utils;

import org.apache.log4j.Logger;

import com.sun.org.apache.xerces.internal.dom.NodeImpl;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Database.CalicoLogicalModel;
import Database.Canvas;
import Database.DatabaseFactory;
import Database.Edge;
import Database.Node;
import calico.Calico;
import calico.components.CCanvas;
import calico.components.CConnector;
import calico.components.CGroup;
import calico.controllers.CCanvasController;
import calico.controllers.CConnectorController;
import calico.controllers.CGroupController;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import javax.swing.JOptionPane;

public class CCalicoDbUdem {
	
	public static Logger logger = Logger.getLogger(CCalicoDbUdem.class.getName());
	
	public static Long2ReferenceOpenHashMap<CGroup> nodes = new Long2ReferenceOpenHashMap<CGroup>();

	public static Long2ReferenceAVLTreeMap<CConnector> edges = new Long2ReferenceAVLTreeMap<CConnector>();

	public static Long2ReferenceOpenHashMap<CCanvas> graphs = new Long2ReferenceOpenHashMap<CCanvas>();
	
	public static CalicoLogicalModel clm = DatabaseFactory.eINSTANCE.createCalicoLogicalModel();
	
	//public static Edge selectedEdge = DatabaseFactory.eINSTANCE.createEdge();
	
	public static Long headNodeUUID = 0L;
	public static Long trailNodeUUID = 0L;
	
	

	
	
	public static void setup()
	{
		clm.getCanvas().clear();
		//////////////////////////////////////////////////
		
		for(CCanvas ca: CCanvasController.canvasdb.values())
		{
			
			Canvas canvas = DatabaseFactory.eINSTANCE.createCanvas();
			canvas.setCCanvas(ca);
			
			/*for(Edge edge: clm.getEdge())
			{
				
				if(edge.getEdge().getCanvasUUID() == canvas.getCCanvas().getUUID())
					canvas.getEdge().add(edge);
					System.out.print("hhhhhhh");
			}*/
			for(CGroup g: CGroupController.groupdb.values())
			{
				
				Node node = DatabaseFactory.eINSTANCE.createNode();
				node.setNode(g); 
				
					
					if(node.getNode().getCanvasUID() == canvas.getCCanvas().getUUID())
						{
							canvas.getNode().add(node);
							System.out.println(canvas.getNode()+"node added");
						}
				
			}
			for(CConnector c: CConnectorController.connectors.values())
			{
				
				Edge edge = DatabaseFactory.eINSTANCE.createEdge();
				edge.setEdge(c);
				for(Node node: canvas.getNode())
				{
					
					if(node.getNode().getUUID() == edge.getEdge().getAnchorUUID(1))
						edge.setTarget(node);
					else if (node.getNode().getUUID() == edge.getEdge().getAnchorUUID(2))
						edge.setSrc(node);	
				}
				
				if(edge.getEdge().getCanvasUUID() == canvas.getCCanvas().getUUID())
					{
						canvas.getEdge().add(edge);
						System.out.print(canvas.getEdge());
						System.out.print("edge added");
					}
				
			
			}
			clm.getCanvas().add(canvas);
		}
		
		System.out.println(clm);
		
	}
	
	public static void getNodesForEdge(long EdgeUUID) {
		return;
	}
	
	public static long[] getGraphNodes(long graphUuid)
	{
		return graphs.get(graphUuid).getChildGroups();
	}
	
	public static void getNodeEdges(long groupUuid) 
	{
		System.out.println(nodes.get(groupUuid).getChildConnectors());
		System.out.println(nodes.get(groupUuid).getChildConnectors().length);
		System.out.println(edges.get(nodes.get(groupUuid).getChildConnectors()[0]));
		JOptionPane.showMessageDialog(null, "Child Connectors: "+nodes.get(groupUuid).getChildConnectors()+" Length: " +nodes.get(groupUuid).getChildConnectors().length," Node "+nodes.get(groupUuid).getUUID()+": Child Connectors", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void getEdgeHeadTrail(long EdgeUUID)
	{
		
		JOptionPane.showMessageDialog(null, edges.get(EdgeUUID).get_headAndTrail()," Edge "+edges.get(EdgeUUID).getUUID()+": Head and Trail", JOptionPane.INFORMATION_MESSAGE);

		System.out.println(edges.get(EdgeUUID));
		//System.out.println(edges.get(EdgeUUID).get_headAndTrail());
		System.out.println(nodes.keySet());
	}
	
}
