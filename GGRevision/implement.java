package GGRevision;
import java.util.HashSet;
public class implement{
    public static void main (String[] arg){
        Graph g = new Graph(7);
        g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
        g.Display();
		System.out.println(g.noOfEdge());
		g.removeEdge(4, 5);
		g.removeVertex(4);
		g.Display();
		System.out.println(g.hashpath(1, 6, new HashSet<>()));
		g.printAllPath(1,  6, new HashSet<>(), "");
    }
}