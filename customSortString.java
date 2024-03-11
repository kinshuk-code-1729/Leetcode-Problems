class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char k = s.charAt(i);
            freqMap.put(k, freqMap.getOrDefault(k, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            if(freqMap.containsKey(c)){
                int freq = freqMap.get(c);
                while(freq > 0){
                    res.append(c);
                    freq -= 1;
                }
                freqMap.remove(c);
            }
        }
        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            int freq1 = entry.getValue();
            char ch = entry.getKey();
            while(freq1 > 0){
                    res.append(ch);
                    freq1 -= 1;
            }
        }
        return res.toString();
    }
}
