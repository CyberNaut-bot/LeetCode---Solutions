class Solution {
public:
    class tris{
      public:
      int a,b,c;
      tris(){
          a=0,b=0,c=0;
      }
    };
    
    bool static camp(tris &a,tris &b){
        return a.a > b.a;
    }
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        int n = profit.size();
        vector<tris> g(n);
        for(int i = 0;i < n;i++){
            g[i].a=startTime[i];
            g[i].b=endTime[i];
            g[i].c=profit[i];
        }
        sort(g.begin(),g.end(),camp);
        // for(auto &val : g){
        //     cout<<val.a<<" "<<val.b<<" "<<val.c<<endl;
        // }
        map<int,int>mp;
        int i = 0;
        while(i < n){
            int st = g[i].a,et=g[i].b,profit =g[i].c;
            i++;
            int ans = profit;
            // cout<<st<<"  "<<et<<" : "<<endl;
            // for(auto &lt : mp)cout<<lt.first<<"  "<<lt.second<<endl;
            
            auto it = mp.lower_bound(et);
            if(it != mp.end()){
                // cout<<et<<" found"<<endl;
                ans += it->second;
            }


            it = mp.lower_bound(st);
            if(it != mp.end()){
                // cout<<st<<"found"<<endl;
                ans = max(ans , it->second);
            }
            mp[st] = ans;
        //   cout<<"---------------------------------"<<endl;
        }
        
       
        return (mp.upper_bound(0))->second;
    }
};