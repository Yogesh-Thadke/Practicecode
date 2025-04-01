class Solution {
    
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int[] arr,int first, int last){
        while(first<last){
            swap(arr, first++, last--);
        }    
    }
    
    void nextPermutation(int[] arr) {
        // code here
        int pivot=-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        
        if(pivot == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }
        
        //int num =0;
        for(int i=arr.length-1; i>pivot; i--){
            if(arr[i]>arr[pivot]){
                //num=i;
                swap(arr, pivot, i);
                break;
            }
        }
        
        reverse(arr, pivot+1, arr.length-1 );
        
    }
}