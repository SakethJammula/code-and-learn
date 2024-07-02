// Question: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
// Tutorial: https://youtu.be/KtpqeN0Goro?si=ROiymu_uLi_qbDR8

class MaxSumSubArraySW{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i = 0, j = 0;
        long sum = 0;
        long maxSum = 0;
        
        while(j < N){
            sum = sum + Arr.get(j);
            if(j - i + 1 < K){
                j++;
            }
            else if(j - i + 1 == K){
                if(maxSum < sum){
                    maxSum = sum;
                }
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
     return maxSum;   
    }
}
