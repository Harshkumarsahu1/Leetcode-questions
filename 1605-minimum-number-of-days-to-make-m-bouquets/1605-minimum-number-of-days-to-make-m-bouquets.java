class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = bloomDay[0];
        int min = bloomDay[0];
        for(int i = 0;i<bloomDay.length;i++)
        {
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int ans = -1;
        while(min<=max)
        {
            int mid = min + (max-min)/2;
            boolean can = calc(bloomDay,mid,m,k);
            if(can == true)
            {
                ans = mid;
                max = mid - 1;
            }
            else
            min = mid + 1;
        }
        return ans;
    }
    public boolean calc(int[] a , int days, int m ,int k)
    {
        int no=0;
        int c = 0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]<=days)
            c++;
            else
            {
                no = no + (c/k);
                c=0;
            }
        }
        no = no + (c/k);
        if(no>=m)
        return true;
        else
        return false;
    }
}