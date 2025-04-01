class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            int elements=nums[i];
            
            if(map.containsKey(elements)){
                map.put(elements,map.get(elements)+1);
            }
            else{
                map.put(elements,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}