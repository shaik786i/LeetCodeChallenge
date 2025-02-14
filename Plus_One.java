class Solution {
    public int[] plusOne(int[] digits) {
        

        int n= digits.length;
        for(int i=n-1;i>=0;i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] res = new int[n+1];
        res[0]=1;
        return res;

        // boolean carry = true;
        // int n= digits.length;
        // for(int i=n-1;i>=0;i-- ) {
        //     digits[i]++;
        //     if(digits[i]==10) {
        //         digits[i]=0;

        //     }
        //     else {
        //         carry = false;
        //         return digits;
        //     }

        // }
        // int[] res = new int[n+1];
        // res[0]=1;
        // return res;
        // boolean carry = false;
        // int n= digits.length;
        // for(int i=n-1;i>=0;i--) {
        //     int temp=0;
        //     int temp2=0;
        //     if(carry) {
        //         temp = digits[i] + 1;
        //         if(temp ==10) {
        //             digits[i]=0;
        //             carry = true;
        //         }
        //         else {
        //             carry = false;
        //             digits[i]= temp;
        //             return digits;
        //         }
        //     }
        //     else {
        //         temp2 = digits[i] +1;
        //         if(temp2==10) {
        //             digits[i]=0;
        //             carry = true;
        //         }
        //         else {
        //             carry = false;
        //             digits[i] = temp2;
        //             return digits;
        //         }
        //     }
        // }
        // if(carry) {
        //     int[] res = new int[n+1];
        //     res[0] = 1;
        //     return res;
        // }
        // return digits;
    }
}
