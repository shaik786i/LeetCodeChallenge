class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        for(int i=0;i<numbers.length; i++) {
            if(map.containsKey(numbers[i])) {
                output[0] = map.get(numbers[i])+1;
                output[1] = i+1;
            }
            map.put(target - numbers[i], i);
        }
        return output;
    }
}

//---------------------//

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] output = new int[2];
        while(start < end) {
            if(numbers[end] + numbers[start] == target) {
                output[0] = start+1;
                output[1] = end+1;
            }
            if(numbers[end] + numbers[start] > target) end--;
            else start++;
        }
        return output;
    }
}
