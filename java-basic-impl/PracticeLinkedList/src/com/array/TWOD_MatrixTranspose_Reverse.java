package com.array;

public class TWOD_MatrixTranspose_Reverse {

	public static void rotate(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j = i; j< matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                // matrix[i][j] = matrix[i][j] ^ matrix[j][i];
                // matrix[j][i] = matrix[i][j] ^ matrix[j][i];
                // matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            }
        }
        int l = matrix[0].length - 1;
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j< matrix[0].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][l -j];
                matrix[i][l - j] = temp;
                // matrix[i][j] = matrix[i][j] ^ matrix[i][l];
                // matrix[i][l] = matrix[i][j] ^ matrix[i][l];
                // matrix[i][j] = matrix[i][j] ^ matrix[i][l];
             // l-- not work here
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
