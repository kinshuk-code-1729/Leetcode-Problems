class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        HashMap<String,List<String>> m = new HashMap<>();

        for(String cur: strs){
            char[] chars = cur.toCharArray();
            Arrays.sort(chars);
            String charSorted = new String(chars);
            if(!m.containsKey(charSorted)){
                m.put(charSorted, new ArrayList<>());
            }
            m.get(charSorted).add(cur);
        }

        groups.addAll(m.values());
        return groups;
    }
}
