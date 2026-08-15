
class Solution {
    public String reorganizeString(String s) {

        // 1. Count frequency
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // 2. Check if possible
        int max = 0;

        for (int count : freq) {
            max = Math.max(max, count);
        }

        if (max > (s.length() + 1) / 2) {
            return "";
        }

        // 3. Max Heap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new int[]{i, freq[i]});
            }
        }

        StringBuilder ans = new StringBuilder();

        // 4. Pick two most frequent characters
        while (pq.size() >= 2) {

            int[] first = pq.poll();
            int[] second = pq.poll();

            char ch1 = (char) (first[0] + 'a');
            char ch2 = (char) (second[0] + 'a');

            ans.append(ch1);
            ans.append(ch2);

            first[1]--;
            second[1]--;

            if (first[1] > 0) {
                pq.offer(first);
            }

            if (second[1] > 0) {
                pq.offer(second);
            }
        }

        // 5. One character may remain
        if (!pq.isEmpty()) {
            ans.append((char) (pq.peek()[0] + 'a'));
        }

        return ans.toString();
    }
}