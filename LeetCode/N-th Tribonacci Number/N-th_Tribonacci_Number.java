class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        int first=0, second=1, third=1;
        for(int i=1; i<=n; i++){
            int ans = first+second+third;
            first = second;
            second = third;
            third = ans;
        }
        return first;
    }
}