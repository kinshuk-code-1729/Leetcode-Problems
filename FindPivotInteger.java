class Solution {
    public int pivotInteger(int n) {
        int start = 1, end = n;
        int sum1 = start, sum2 = end;

        if(n == 1) return n;
        while(start < end){
            if(sum1 < sum2){
                start++;
                sum1 += start;
            }
            else{
                end--;
                sum2 += end;
            }
            if(sum1 == sum2 && start + 1 == end - 1){
                return start + 1;
            }
        }
        return -1;
    }
}
