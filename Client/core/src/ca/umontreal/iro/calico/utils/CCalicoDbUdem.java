package ca.umontreal.iro.calico.utils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import com.sun.org.apache.xerces.internal.dom.NodeImpl;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Database.CalicoLogicalModel;
import Database.Canvas;
import Database.DatabaseFactory;
import Database.Edge;
import Database.Node;
import calico.Calico;
import calico.CalicoOptions.pen.debug;
import calico.components.CCanvas;
import calico.components.CConnector;
import calico.components.CGroup;
import calico.controllers.CCanvasController;
import calico.controllers.CConnectorController;
import calico.controllers.CGroupController;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Attr;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import edu.mit.csail.sdg.alloy4compiler.ast.ExprHasName;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.PrimSig;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import kodkod.ast.Decl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class CCalicoDbUdem  {
	
	public static Logger logger = Logger.getLogger(CCalicoDbUdem.class.getName());
	
	public static Long2ReferenceOpenHashMap<CGroup> nodes = new Long2ReferenceOpenHashMap<CGroup>();

	public static Long2ReferenceAVLTreeMap<CConnector> edges = new Long2ReferenceAVLTreeMap<CConnector>();

	public static Long2ReferenceOpenHashMap<CCanvas> graphs = new Long2ReferenceOpenHashMap<CCanvas>();
	
	public static CalicoLogicalModel clm = DatabaseFactory.eINSTANCE.createCalicoLogicalModel();
	
	//public static Edge selectedEdge = DatabaseFactory.eINSTANCE.createEdge();
	
	public static Long headNodeUUID = 0L;
	public static Long trailNodeUUID = 0L;
	
	
	private static final String FILENAME = "spl.csv";

	private static final String LINE_DELIMITER = "\n";
	private static final String CSV_DELIMITER = ",";

	private static final String VAR_DECL_KEYWORD = "var";
	private static final String FEATURE_MODEL_DECL_KEYWORD = "featureModel";
	private static final String FEATURE_VAR_DELIMITER = ";";
	
	

	
	
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
		try {
			Acyclic(null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Err e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void Acyclic(CConnector connector) throws Err, FileNotFoundException 
	{
	
		
		// Chooses the Alloy4 options
        A4Options opt = new A4Options();
        opt.solver = A4Options.SatSolver.SAT4J;

        
        PrimSig node = new PrimSig("Node", Attr.ABSTRACT);
        
        PrimSig edge = new PrimSig("Edges", Attr.ABSTRACT);
       
        // abstract sig Canvas {}
        PrimSig canvas = new PrimSig("Canvas", Attr.ABSTRACT);
       
        // Canvas { nodes: Node }
        Expr nodes = canvas.addField("nodes", node.setOf());
        
        Expr edges = canvas.addField("edges", edge.setOf());
        
        Expr src = edge.addField("src", node.setOf());
        
        Expr trgt = edge.addField("trgt", node.setOf());
        
        Canvas curCanvas = clm.getCanvas().get(clm.getCanvas().size()-1);
        
        java.util.List<PrimSig> listSigNode = new ArrayList<PrimSig>();
        
        for (Node n : curCanvas.getNode())
        {
        	PrimSig nodeTemp = new PrimSig("Node_"+n.getNode().getUUID(), node, Attr.ONE);
        	listSigNode.add(nodeTemp);
        }
        
        PrimSig canvas1 = new PrimSig("Canvas1", canvas, Attr.ONE);
        
        
        
        //Expr x = listSigNode.get(0);
        
        for (int i=0; i<listSigNode.size(); i++)
        {
        	Expr x1 = listSigNode.get(i);
        	System.out.print(listSigNode.get(i));
        	//x.plus(x1);
        	canvas1.addFact(canvas1.join(nodes).equal(x1));
        }
        //System.out.print(x);
        //canvas1.addFact(canvas1.join(nodes).equal(x));
        
        
       /* Node src1 = curCanvas.getEdge().get(0).getSrc();
        Node trg1 = curCanvas.getEdge().get(0).getTarget();
        String labelSrc = ("Node_"+src1.getNode().getUUID()).toString();
		String labeltrg = ("Node_"+trg1.getNode().getUUID()).toString();
        int is=0,it=0;
        
		for (int i=0; i<listSigNode.size(); i++)
        {
			String LabelPointer = (listSigNode.get(i).label).toString();
        	if(labelSrc.equals(LabelPointer))
        		is=i;
        	if(labeltrg.equals(LabelPointer))
        		it=i;
        }
        
        
        Expr s = listSigNode.get(is);
        Expr t = listSigNode.get(it);
        edge1.addFact(edge1.join(src).equal(s));
        edge1.addFact(edge1.join(trgt).equal(t));
        canvas1.addFact(canvas1.join(edges).equal(edge1));*/
        
        
       
        
        for (int i=0; i<curCanvas.getEdge().size(); i++)
        {
        	PrimSig edge1 = new PrimSig("Edge_"+curCanvas.getEdge().get(i).getUUID(), edge, Attr.ONE);
        	Node srctmp = curCanvas.getEdge().get(i).getSrc();
            Node trgtmp = curCanvas.getEdge().get(i).getTarget();
            String labelSrcTmp = ("Node_"+srctmp.getNode().getUUID()).toString();
    		String labelTrgTmp = ("Node_"+trgtmp.getNode().getUUID()).toString();
            int istmp=0,ittmp=0,itest=0;
    		for (int j=0; j<listSigNode.size(); j++)
            {
    			
    			String LabelPointerTmp = (listSigNode.get(j).label).toString();
            	if(labelSrcTmp.equals(LabelPointerTmp))
            		{
            			itest=itest+1;
            			istmp=j;
            			//s.plus(listSigNode.get(istmp));
            			edge1.addFact(edge1.join(src).equal(listSigNode.get(istmp)));
            		}
            	if(labelTrgTmp.equals(LabelPointerTmp))
            		{
            			itest=itest+1;
            			ittmp=j;
            			//t.plus(listSigNode.get(ittmp));
            			edge1.addFact(edge1.join(trgt).equal(listSigNode.get(ittmp)));
            		}
            	
            	if(itest==2)
            	{
            		itest=0;
                	canvas1.addFact(canvas1.join(edges).equal(edge1));
	
            	}
                
                //edge1.addFact(edge1.join(src).equal(s));
                //edge1.addFact(edge1.join(trgt).equal(t));
                
                            	
            }
    		
    		
    		
        	
        	
        	
        }
        
        //canvas1.addFact(canvas1.join(edges).equal(edge1));
        
        Expr r = edges;
        
        //Acyclic
        edu.mit.csail.sdg.alloy4compiler.ast.Decl d = r.join(Sig.UNIV).oneOf("x");     // x is a variable over the domain of r
        ExprHasName z = d.get();
        System.out.println(z.in(z.join(r.closure())).not().forAll(d)); // (x !in x.^r) for all x
        System.out.println("test");

        
       	
        
       

	}

	private static Canvas findCanvas(String name, CalicoLogicalModel clm) {
		EList<Canvas> knownBoxes =  clm.getCanvas();
		for (Canvas c : knownBoxes)
			if (c.toString().trim().equals(name))
				return c;
		return null;
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
