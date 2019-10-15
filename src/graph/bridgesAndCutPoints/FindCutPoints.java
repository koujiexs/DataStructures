package graph.bridgesAndCutPoints;

import graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCutPoints {
    private Graph G;
    private boolean[] visited;
    private int[] ord;
    private int[] low;
    private int cnt;

    private HashSet<Integer> res;
    public FindCutPoints(Graph G){
        this.G=G;
        visited=new boolean[G.V()];
        res=new HashSet<>();
        ord=new int[G.V()];
        low=new int[G.V()];
        cnt=0;
        for (int v = 0; v < G.V(); v++) {
            if (!visited[v])
                dfs(v,v);
        }
    }
    private void dfs(int v,int parent){
        visited[v]=true;
        ord[v]=cnt;
        low[v]=ord[v];
        cnt++;
        int child=0;
        for (int w:G.adj(v))
            if (!visited[w]){
                dfs(w,v);
                low[v]=Math.min(low[v],low[w]);
                if (v!=parent&&low[w]>=ord[v]){
                    //v-w是桥
                    res.add(v);
                }
                child++;
                //V是根节点
                if (v==parent&&child>1){
                    res.add(v);
                }
            }else {
                if (w!=parent)
                    low[v]=Math.min(low[v],low[w]);
            }

    }
    public HashSet<Integer> result(){
        return res;
    }

    public static void main(String[] args) {
        Graph g=new Graph("findBridges.txt");
        FindCutPoints fb = new FindCutPoints(g);
        System.out.println(fb.result());
    }
}
