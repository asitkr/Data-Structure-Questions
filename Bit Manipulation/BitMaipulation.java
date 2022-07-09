public class BitMaipulation {
    public static void main (String[] args) {
        int[] arr = {5,10};
          int ans  = sumBitDiff(arr);
        System.out.println(ans);
    }

    static int sumBitDiff(int[] arr){
        int diff = 0;                                //hold the ans
           
          for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
               
                 int xor = arr[i]^arr[j];
                  int count = countSetBits(xor);
                  diff += 2*count;
            }
        }
       
          return diff;
    }
    
      static int countSetBits(int n){
        int count = 0;            // `count` stores the total bits set in `n`
  
        while (n != 0) {
            n = n & (n - 1);    // clear the least significant bit set
            count++;
        }
  
        return count;
    }
}
