class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n=people.length;
        int m=people[0].length;

        Arrays.sort(people, (a, b) -> {
    if (a[0] != b[0]) {
        return b[0] - a[0]; // taller first
    }
    return a[1] - b[1];     // smaller k first
});
        List<int[]> list = new ArrayList<>();
   for(int[] person:people){
    list.add(person[1],person);
   }
           return list.toArray(new int[people.length][2]);


  

        
    }
}