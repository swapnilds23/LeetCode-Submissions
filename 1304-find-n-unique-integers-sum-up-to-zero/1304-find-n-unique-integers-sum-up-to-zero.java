class Solution {
    public int[] sumZero(int n) {
        int[] output = new int[n];
        if(n == 1){
            output[0]=0;
        }
        int counter = n/2;
        for(int i=0; i<n/2;i++){
            output[i] = -1 * counter;
            output [n-1-i] = counter;
            counter--;
        }
        if(n%2 != 0){
            output[n/2]=0;
        }
        return output;
    }
}