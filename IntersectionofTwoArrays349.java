class Solution {
    public int[] intersection(int[] a, int[] b) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x:a){
            set1.add(x);
        }
        for(int y:b){
            set2.add(y);
        }
        set1.retainAll(set2);
        int[] a1 = new int[set1.size()];

        int i=0;
        for(int n:set1){
            a1[i++] = n;
        }
        return a1;
        
    }
}
