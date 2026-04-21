import java.util.*;

//check if the has reached to each node of the graph or not

class Graph1{


	public static Boolean isTravToEachNode(int[][] adj , int n){
		//use BFS
		//HashSet<Integer> visited = new HashSet<>(); // we can also use array of n size for each node of Boolean type
		//so use array to get more obtimised ans
		boolean[] visited = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		//visited[0] = true;
 		int visitCount = 0 ;
		while(!q.isEmpty()){
			int rv = q.poll();
			if(visited[rv])  continue;
			visited[rv] = true;
			visitCount++;
			for(int neighbour = 0 ; neighbour < n ; neighbour++){

				if(adj[rv][neighbour]==1 && !visited[neighbour]){
					q.offer(neighbour);
				}
			}
		}
		
		return visitCount==n;		
	
	}	


	//create graph
	public static void main(String [] arg){
	
		//adj matrix
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//number of vertex in graph
		int[][] adj = new int[n][n] ;//0 id matrix
		

		for(int i = 0 ; i < n ; i++ ){
			for(int j = 0 ; j < n ; j++ ){
				adj[i][j] = sc.nextInt();
				
			}
		}
	
		//now create a function that checks if have more then one component or just 
		Boolean isTrue = isTravToEachNode(adj,n);
		System.out.print("is each node in graph rach to each onter in the graph: " + isTrue );
		

}

	
}