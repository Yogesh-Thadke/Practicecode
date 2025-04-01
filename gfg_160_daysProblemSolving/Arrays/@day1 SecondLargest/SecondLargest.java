class Solution {
    public int getSecondLargest(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max1 = max;
                max = arr[i];
            }
            
            else if(arr[i]>max1 && arr[i]<max){
                max1 = arr[i];
            }
        }
        
        if(max1 == Integer.MIN_VALUE){
            return -1;
        }
        return max1;
    }
}