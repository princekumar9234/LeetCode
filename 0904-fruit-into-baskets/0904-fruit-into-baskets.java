class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0, high = 0, result = 0;
        int n = fruits.length;
        Map <Integer , Integer> freq = new HashMap<>();

        for(high = 0; high <n; high++){
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) +1);

            while(freq.size() > 2){
                int leftFruit = fruits[low];
                freq.put(leftFruit, freq.get(leftFruit) -1);

                if(freq.get(leftFruit) == 0){
                    freq.remove(leftFruit);
                }
                low++;
            }
                int len = high - low +1;
                result = Math.max(result, len);
        }
        return result;
    }
}