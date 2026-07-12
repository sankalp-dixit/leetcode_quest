class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] r = new int[arr.length];
        int[] c = arr.clone();
        Arrays.sort(c);
        int j = 1;
    HashMap<Integer,Integer> h = new HashMap<>();
    for(int i = 0 ; i < c.length; i++){
        if(h.containsKey(c[i]))
        continue;
        else{
        h.put(c[i],j);
        j++;
        }
    }
    for(int i = 0; i < arr.length; i++){
        r[i] = h.get(arr[i]);
    }
    return r;


    }
}