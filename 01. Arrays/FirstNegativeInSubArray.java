// Problem: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
// Tutorial: https://youtu.be/uUXXEgK2Jh8?si=ckWULoFEG_BsD3d1

class FirstNegativeInSubArray {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i = 0, j = 0; // start and end pointers
        List<Long> arr = new ArrayList<>();
        
        long[] res = new long[N - K + 1];
        int r = 0;

        while( j < N){
            if(A[j] < 0){
                arr.add(A[j]);
            }
            if(j - i + 1 < K){
                j++;
            }
            else if(j - i + 1 == K){
                if(arr.size() == 0){
                    res[r] = 0;
                } else {
                    res[r] = arr.get(0);
                }
                r++;
                if(!arr.isEmpty() && arr.get(0) == A[i]){
                    arr.remove(0);
                }
                i++;
                j++;
            }
        }
        return res;
    }
}
