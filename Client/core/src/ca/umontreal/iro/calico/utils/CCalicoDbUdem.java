package calico.controllers;

import org.apache.log4j.Logger;

import calico.components.CCanvas;
import calico.components.CConnector;
import calico.components.CGroup;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import javax.swing.JOptionPane;

public class CCalicoDbUdem {
	
	public static Logger logger = Logger.getLogger(CCalicoDbUdem.class.getName());
	
	public static Long2ReferenceOpenHashMap<CGroup> nodes = new Long2ReferenceOpenHashMap<CGroup>();

	public static Long2ReferenceAVLTreeMap<CConnector> edges = new Long2ReferenceAVLTreeMap<CConnector>();

	public static Long2ReferenceOpenHashMap<CCanvas> graphs = new Long2ReferenceOpenHashMap<CCanvas>();
	
	
	public static void setup()
	{
		
		nodes = CGroupController.groupdb;
		edges = CConnectorController.connectors;
		graphs = CCanvasController.canvasdb;
		
		
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
