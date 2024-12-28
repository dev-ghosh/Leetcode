package LEETCODE;

public class Q374GuessNoHigherLower {
    public int guessnumber(int n){
        int start=1;
        int end =n;
        while(start<=end){
            int mid=start+(end-start)/2;  // if start+end/2 then it would show time limit exceeded
            int g=guessnumber(mid); // mid becomes the no we are guessing // it is guess in leetcode coz its a API
            if(g==0){
                return mid;
            }
            else if(g==1){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
