class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans1 = mergeArray(nums1,nums2);
        double val=0;
        if(ans1.length%2==0){
            val = (double)(ans1[(ans1.length/2)]+ans1[(ans1.length-1)/2])/2;
            return val;
        }
        else{
            val = (double)ans1[ans1.length/2];
            return val;
        }
    }

    public int[] mergeArray(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int p1=0, p2=0, p3=0;
        int val1=0, val2=0;
        while(p1<arr1.length || p2<arr2.length){
            if(p1<arr1.length){
                val1=arr1[p1];
            }
            else{
                val1=Integer.MAX_VALUE;
            }
            if(p2<arr2.length){
                val2=arr2[p2];
            }
            else{
                val2=Integer.MAX_VALUE;
            }

            if(val1<val2){
                ans[p3]=val1;
                p1++;
            }
            else{
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}