package com.bridgelabz.functionPrograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                printWriter.print(array[i][j] + " ");
            }
            printWriter.println();
        }

    }
}
