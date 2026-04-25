package GGRevision;

import java.util.HashMap;
import java.util.HashSet;
public class Graph{
    HashMap<Integer , HashMap<Integer,Integer> > map ;
    public Graph(int v){
        map = new HashMap<>();
        for(int i = 1 ; i <= v ; i++ ){
            map.put(i , new HashMap<>());
        }
    }
    public void AddEdge (int v1 , int v2 , int cost){
        if (map.containsKey(v1) && map.containsKey(v2)) {
            map.get(v1).put(v2,cost);
            map.get(v2).put(v1,cost);
        }
    }
    public boolean ContainsEdge(int v1 , int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noOfEdge(){
        int count = 0 ;
        for(int key : map.keySet()){
            count += map.get(key).size();
        }
        return count/2;
    }
    public void removeEdge(int v1 ,int v2){
        if(ContainsEdge(v1,v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v1){
        if (!map.containsKey(v1)) return;
        for(int key : map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void Display(){
        for( int key : map.keySet()){
            System.out.print(key + "---->>>"+ map.get(key));
        }
    }
    public boolean hashpath(int src , int dis , HashSet<Integer> visited ){
        if(src == dis) return true;
        visited.add(src);
        for(int nbrs : map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans  = hashpath(nbrs , dis , visited);
                if(ans) return ans;
            }
        }
        visited.remove(src);
        return false;
    }
    public void printAllPath(int src , int dis , HashSet<Integer> visited , String ans){
        if(src == dis){
            System.out.print(ans + src);
            return ;
        }
        visited.add(src);
        for(int nbrs : map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                printAllPath(nbrs,dis,visited,ans + src+ " -->> " );
            }
        }   
        visited.remove(src);     
    }
}
