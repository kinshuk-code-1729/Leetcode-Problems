class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i = 0;i < s.length();i++){
           char cur = s.charAt(i);
           if(!map.containsKey(cur)){
               map.put(cur,i);
           }
           else{
               map.put(cur,-1);
           }
       }
       int low = Integer.MAX_VALUE;
       for(char k: map.keySet()){
           if(map.get(k) > -1 && map.get(k) < low){
               low = map.get(k);
           }
       }
       if(low == Integer.MAX_VALUE) return -1;
       return low;
    }
}
