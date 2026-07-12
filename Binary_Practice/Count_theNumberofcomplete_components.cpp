class solution {
    public:
        void dft(vector<int> adj[], int st, vector<int>& vis, int node, int edge){
            vis[st]=1;
            node++;
            edges+=adj[st].size();
            for(auto it : adj[node]){
                if(vis[it]==0){
                    vis[it] =1;
                    dfs(adj,it,vis,node, edge);
                }
            }
        }
        int countCompleteComponents(int n, vector<vector<int>>& edges){
            vector<int> adj[n+1];
            for(int i=0;i <edges.size(); i++){
                int ai = edges[i][0];
                int bi = edges[i][1];
                adj[ai]=.push_back(bi);
                adj[bi].push_back(ai);
            }

            vector<int> vis(n+1,0);
            for(int i=0; i<adj.size(): i++){
                int node =0;
                int edge =0;
                if(vis[i]==0){
                    dfs(adj,i, vis, node,edge);
                }

                if (node*((node-1)/2)== edge){
                    ans++;
                }
            }
        }
}