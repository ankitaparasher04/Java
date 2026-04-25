package GGRevision;
import java.util.*;
public class Graph_2{
    HashMap<Integer,HashMap<Integer,Integer>> map ;
    public Graph_2(int v ){
        this.map = new HashMap<>();
        for(int i = 1 ; i <= v ; i++ ){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean BFS(int src , int dis){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while(!qq.isEmpty()){
            int rv = q.poll();
            if(visited.contains(rv)) continue;
            visited.add(rv);
            if(r==dis) return true;
            for(int nbrs: map.get(rv).keySet()){
                if(!visited.contains(nbrs)) q.offer(nbrs);
            } 
        }
        return false;
    }
    public boolean DFS(int src , int dis ){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stk = new Stack<>();
        stk.push(src);
        while(!q.isEmpty()){
            int rv = q.pop();
            if(visited.contains(rv)) continue;
            visited.add(rv);
            if(rv == dis) return true;
            for(int nbrs: map.get(rv).keySet()){
                if(!visited.contains(nbrs)) q.push(nbrs);
            }
        }
        return false;
    }
    public void BFT(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src : map.keySet()){
            if(visited.contains(src)) continue;
            else{
                q.offer(src);
                while(!q.isEmpty()){
                    int rv = q.poll();
                    if(visited.contains(rv)) continue;
                    visited.add(rv);
                    System.out.print(rv + "  ");
                    for(int nbrs : map.get(rv).keySet()){
                        if(!visited.contains(nbrs)) q.offer(nbrs);
                    }
                }
            }
        }
    }
    public void DFT(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stk = new Stack<>();
        for( int src : map.keySet()){
            if(visited.contains(src)) continue;
            stk.push(src);
            while(!stk.isEmpty()){
                int rv = stk.pop();
                if(visited.contains(rv)) continue;
                visited.add(rv);
                System.out.print(rv + "  ");
                for(int nbrs : map.get(rv).keySet()){
                    if(!visited.contains(nbrs)) stk.push();
                }
            }
        }
    }
    public boolean isCycle(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int src : map.keySet()){
            if(visited.contains(src)) continue;
            q.offer(src);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(visited.contains(rv)) return true;
                visited.add(rv);
                for(int nbrs : map.keySet()){
                    if(!visited.contains(nbrs)) q.offer(nbrs);
                }
            }
        }
        return false;
    }
    public boolean isConnected(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0 ;
        for(int src : map.keySet()){
            if(visited.contains(src)) continue;
            count++;
            q.offer(src);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(visited.contains(rv)) continue;
                visited.add(rv);
                for(int nbrs : map.get(rv).keySet()){
                    if(visited.coontains(nbrs)) q.offer(nbrs);
                }
            }
        }
        return count==1;
    }
}
