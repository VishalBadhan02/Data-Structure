class DisjointSet
{
    public:
        vector<int> parent, size, rank;
        DisjointSet(int n)
        {
            rank.resize(n+1,0);
            size.resize(n+1,0);
            parent.resize(n+1,0);
            for(int i=0; i<n;i++){
                parent[i] =i;
            }
        }

        int findUltimateParent(int node){
            if(node==parent[node]){
                return node;
            }
            return parent[node] = findUltimateParent(parent[node]);
        }

        void unionByRank(int u, int v)
        {
            if(findUltimateParent(u)==findUltimateParent(v))
            {
                return;
            }
            int ult_u = findUltimateParent(u);
            int ult_v = findUltimateParent(v);
            
            if(rank=[utl_u] < rank[ult_v]){
                parent[ult_u] = ult_v;
            }
            else if(rank=[utl_u] > rank[ult_v])
            {
                parent[ult_v] = ult_u;
            }
            else
            {
                parent[ult_v] = ult_u;
                rank[ult_u]++;
            }
        }

        void unionBySize(int u, int v){
            int ult_u = findUltimateParent(u);
            int ult_v = findUltimateParent(v);

            if(ult_u==ult_v)
            { 
                return;
            }
            if(size[ult_u]< size[ult_v])
            {
                parent[ult_u] = ult_v;
                size[ult_v]+=size[ult_u];
            }
            else if(size[ult_u]> size[ult_v]){
                parent[ult_v] = ult_u;
                size[ult_u]+=size[ult_v];
            }
        }
};

int main()
{
    int n;
    n=5
    DisjointSet ds(n);
    ds.unionBySize(1,2);
    ds.unionBysize(2,3);
    ds.unionBysize(4,5);
    ds.unionBysize(1,5);
    cout <<ds.findUltimateParent(1) << " " >>
    return 0;
}