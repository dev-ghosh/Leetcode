package LEETCODE;

import java.util.Arrays;

public class Q48RotateImage {
    public void rotate(int[][] matrix) {

        // ROTATE IMAGE IS ROTATE MATRIX BY 90 DEGREE

        //transpose
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int [][]matrix= {{1,2,3},{2,3,4},{4,5,6}};

        System.out.println();
    }
}
