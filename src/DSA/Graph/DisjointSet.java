package DSA.Graph;

import java.util.*;

//Disjoint Set by Rank and Size

//TC:- O(4 * ALPHA)(const)
class DisjointSet {

    int[] rank;
    int[] size;
    int[] parent;

    DisjointSet(int n) {
        rank = new int[n + 1];
        size = new int[n + 1];
        parent = new int[n+1];
        for (int i = 0; i <= n; i++) {
            size[i] = 1;
            parent[i] = i;
        }
    }
    // backtracking
    public int findp(int node) {
        if (parent[node] == node)
            return node;

        parent[node] = findp(parent[node]);

        return parent[node];
    }
    //Union By Rank
    public void unionByRank(int u, int v) {
        int ulp_u = findp(u);
        int ulp_v = findp(v);

        if(ulp_u == ulp_v) return;

        if (rank[ulp_v] < rank[ulp_u]) {
            parent[ulp_v] = ulp_u;
        }else if (rank[ulp_u] < rank[ulp_v]) {
            parent[ulp_u] = ulp_v;
        }else { // if both ranks are same
            parent[ulp_u] = ulp_v;
            rank[ulp_v]++;
        }
    }
    //Union By Size
    public void unionBySize(int u, int v) {
        int ulp_u = findp(u);
        int ulp_v = findp(v);

        if(ulp_u == ulp_v) return;

        if (size[ulp_v] < size[ulp_u]) {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }else { // if both have same size
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        }
    }

    public static void main(String[] args){
        DisjointSet ds = new DisjointSet(7);
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        // if 3 and 7 same or not
        if (ds.findp(3) == ds.findp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionBySize(3, 7);
        if (ds.findp(3) == ds.findp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

    }


}
