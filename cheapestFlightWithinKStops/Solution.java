class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prev= new int[n];
        Arrays.fill(prev,(int)1e8);
        prev[src]=0;
        for(int i = 0;i<=k;i++){
            int[] curr = new int[n];
            for(int j = 0;j<n;j++){
                curr[j] = prev[j];
            }
            for(int[] flight:flights){
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                if(curr[v]>prev[u]+w){
                    curr[v] = prev[u]+w;
                }
            }
            prev = curr;
        }
        return prev[dst]==(int)1e8 ? -1:prev[dst];
    }
}