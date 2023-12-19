package Asignment1;

import java.util.Random;
public class Matrix {
    public void newMatrix(int n,int a) {
        int[][] arr = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] sumArr = new int[n][n];
        int[][] MulByNumber = new int[n][n];
        Random rand = new Random();

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = rand.nextInt(9);
                arr2[i][j] = rand.nextInt(9);
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("addition with another matrix");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                sumArr[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication by a number");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                MulByNumber[i][j]=arr[i][j]*a;
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(MulByNumber[i][j] + " ");
            }
            System.out.println();
        }
    }
}

