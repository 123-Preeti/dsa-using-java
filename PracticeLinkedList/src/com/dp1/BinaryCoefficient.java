package com.dp1;

import java.util.*;

class BinaryCoeffient {

	static int binomialCoeff(int n, int k)
	{
		int C[] = new int[k + 1];
		C[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = Math.min(i, k); j > 0; j--)
				C[j] = C[j] + C[j - 1];
		}
		return C[k];
	}

	public static void main(String[] args)
	{
		int n = 5, k = 2;
		System.out.printf("Value of C(%d, %d) is %d ", n, k,
						binomialCoeff(n, k));
	}
}


//								OR





//A Dynamic Programming based
//solution that uses table C[][] to
//calculate the Binomial Coefficient

class BinomialCoefficient {
	static int binomialCoeff(int n, int k)
	{
		int C[][] = new int[n + 1][k + 1];
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= min(i, k); j++) {
				if (j == 0 || j == i)
					C[i][j] = 1;
				else
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
			}
		}

		return C[n][k];
	}
	static int min(int a, int b) { return (a < b) ? a : b; }
	public static void main(String args[])
	{
		int n = 5, k = 2;
		System.out.println("Value of C(" + n + "," + k
						+ ") is " + binomialCoeff(n, k));
	}
}
