class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            if(map.containsKey(target-num)){
                int index1 = i;
                int index2 = map.get(target-num);
                int ans[] = new int[2];
                ans[0] = index1+1;
                ans[1] = index2+1;
                Arrays.sort(ans);
                return ans; 
            }else{
            map.put(num,i);
            }
        }
return null;

    }
}
