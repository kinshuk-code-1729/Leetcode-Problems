class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String d = "123456789";
        List<Integer> res = new ArrayList<>();
        int low_dc = String.valueOf(low).length();
        int high_dc = String.valueOf(high).length();
        for(int i=low_dc;i<=high_dc;i++){
            for(int j=0;j<=d.length()-i;j++){
                String ascDgt = d.substring(j,j+i);
                int ascNum = Integer.parseInt(ascDgt);
                if(ascNum >= low && ascNum <= high){
                    res.add(ascNum);
                }
                if(ascNum > high){
                    break;
                }
            }
        }
        return res;
    }
}
