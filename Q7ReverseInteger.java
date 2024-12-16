package LEETCODE;

public class Q7ReverseInteger {
    static int reverse(int x){
        int rev=0;
        while(x!=0){
            int digit =x%10;
            rev =(rev*10)+digit;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            x=x/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(345));
    }
}