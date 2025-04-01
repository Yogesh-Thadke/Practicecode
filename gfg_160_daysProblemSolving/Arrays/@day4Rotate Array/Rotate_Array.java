class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        
        rotate(arr, 0, d-1);
        rotate(arr,d, n-1);
        rotate(arr, 0, n-1);
        
    }
    
    static void rotate(int arr1[], int start, int end){
        while(start<end){
            int temp = arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }    
    }
}