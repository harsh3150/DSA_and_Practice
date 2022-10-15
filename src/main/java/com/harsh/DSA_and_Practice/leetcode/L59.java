package com.harsh.DSA_and_Practice.leetcode;

public class L59 {
    public int[][] generateMatrix(int n) {

        int [][]spiral = new int[n][n];

        int i=0, j=0;
        int num =1;
        while(num<=n*n){
            for(;j<n;j++){
                if(spiral[i][j]==0){
                    spiral[i][j]=num;
                    num++;
                }else{
                    break;
                }
            }
            j--; i++;
            for(;i<n;i++){

                if(spiral[i][j]==0){
                    spiral[i][j]=num;
                    num++;
                }else{
                    break;
                }
            }
            i--; j--;
            for(;j>=0;j--){

                if(spiral[i][j]==0){
                    spiral[i][j]=num;
                    num++;
                }else{
                    break;
                }
            }
            j++; i--;
            for(;i>=0;i--){

                if(spiral[i][j]==0){
                    spiral[i][j]=num;
                    num++;
                }else{
                    break;
                }
            }
            i++;j++;
        }
        return spiral;
    }
}
