class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num :nums){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        PriorityQueue<Map.Entry<Integer,Integer>>max=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        max.addAll(freq.entrySet());
        
        
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(max.poll().getKey());

        }
        int[] resa=new int[res.size()];
        for(int i=0;i<res.size();i++){
            resa[i]=res.get(i);
        }
        return resa;
    }
}
