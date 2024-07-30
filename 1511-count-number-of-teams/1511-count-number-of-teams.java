class Solution {
    int dp[][][];
    int ip[][][];
    public int numTeams(int[] rating) {
        dp=new int[rating.length+1][rating.length+1][3];
        ip=new int[rating.length+1][rating.length+1][3];
        for(int row[][]:dp){
            for(int col[]:row){
              Arrays.fill(col,-1);
            }
        }
        for(int row[][]:ip){
            for(int col[]:row){
              Arrays.fill(col,-1);
            }
        }
        int inc=increase(rating,0,-1,0);
        int dec=decrease(rating,0,-1,0);
        return inc+dec;
    }
    public int increase(int arr[],int curr,int prev,int count){
        if(count==3){
            return 1;
        }
        if(curr==arr.length){
            return 0;
        }
        if(ip[curr][prev+1][count]!=-1){
            return ip[curr][prev+1][count];
        }
        int c=increase(arr,curr+1,prev,count);
        if(prev==-1 || arr[curr]>arr[prev] ){
            c+=increase(arr,curr+1,curr,count+1);
        }
        return ip[curr][prev+1][count]=c;
    }
    public int decrease(int arr[],int curr,int prev,int count){
        if(count==3){
            return 1;
        }
        if(curr==arr.length){
            return 0;
        }
        if(dp[curr][prev+1][count]!=-1){
            return dp[curr][prev+1][count];
        }
        int c=decrease(arr,curr+1,prev,count);
        if(prev==-1 || arr[curr]<arr[prev] ){
            c+=decrease(arr,curr+1,curr,count+1);
        }
        return dp[curr][prev+1][count]=c;
    }
}