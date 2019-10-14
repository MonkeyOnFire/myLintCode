public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }

//    public long trailingZeros(long n) {
//        // write your code here, try to do it without arithmetic operators.
//        long jg = jc(n);
//        return numberZero(jg);
//
//    }
//
//    public static long jc(long a) {
//        long jg = 1;
//        for(;a>=1;a--) {
//            jg*=a;
//        }
//        return jg;
//    }
//    public  static int numberZero(long n) {
//        String s = "" + n;
//        char[] ss = s.toCharArray();
//        int num = 0;
//        int len = ss.length;
//        for(int i=1;i<=len;i++){
//            if(ss[len-i]==48){
//                num++;
//            }else{
//                break;
//            }
//
//        }
//        return num;
//    }
}