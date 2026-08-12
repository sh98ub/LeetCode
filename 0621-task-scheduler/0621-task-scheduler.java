class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            char ch=tasks[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Count how many characters have max frequency
        int maxCount = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                maxCount++;
            }
        }

        int result = (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, result);
        
    }
}