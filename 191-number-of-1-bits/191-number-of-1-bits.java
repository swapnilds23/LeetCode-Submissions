public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int numberOfOnes = 0;
        while(n !=0){
            numberOfOnes = numberOfOnes + (n & 1);
            n = n>>>1;
        }
        return numberOfOnes;
    }
}