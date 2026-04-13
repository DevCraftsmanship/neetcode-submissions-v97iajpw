class Solution {
    public int maxArea(int[] heights) {
        List<Integer> arr = new ArrayList<>();
     int start = 0, end = heights.length-1;
     while(end > start){
        if(heights[start]==heights[end]){
            arr.add(heights[start] * (end-start));
            start++;
        }else if(heights[start]<heights[end]){
            arr.add(heights[start] * (end-start));
            start++;
        }else{
            arr.add(heights[end] * (end-start));
            end--;
        }
        
     }
     System.out.println(arr);
     return arr.stream().max(Integer::compareTo).orElse(0);

    }
}
