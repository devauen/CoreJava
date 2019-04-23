package com.proartz.Ch01E14;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    private final static int SQUARE_WIDTH = 4;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] columns = readSquare(SQUARE_WIDTH);
        printSquare(columns);

        if(isSquareMagic(columns)) {
            System.out.println("Magic Square!");
        }

    }

    public static int[][] readSquare(int squareWidth) {

        int[][] columns = new int[squareWidth][squareWidth];

        System.out.println("Enter numbers:");

        for (int i = 0; i < columns.length; i++) {
            columns[i] = readSquareRow(columns[i].length);
        }
        return columns;
    }

    public static int[] readSquareRow(int rowWidth) {

        String line = scanner.nextLine();

        int[] row = parseInts(line);

        return row;
    }

    public static int[] parseInts(String string) {

        String[] stringRow = string.split(" ");

        int[] ints = new int[stringRow.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(stringRow[i]);
        }

        return ints;
    }

    public static void printSquare(int[][] square) {
        for(int[] row : square) {

            System.out.print("( ");

            for(int number : row) {
                System.out.printf("%d ", number);
            }

            System.out.println(")");
        }
    }

    public static boolean isSquareMagic(int[][] square) {
        int rowsSum = sumRows(square);
        int colsSum = sumCols(square);
        int diagsSum = sumDiags(square);

        if((rowsSum == -1) || (colsSum == -1) || (diagsSum == -1)) {
            return false;
        } else {
            return ((rowsSum == colsSum) && (colsSum == diagsSum));
        }
    }

    public static int sumRows(int[][] square) {
        int[] rowsSum = new int[square.length];
        Arrays.fill(rowsSum, 0);

        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square.length; j++) {
                rowsSum[i] += square[i][j];
            }
        }

        boolean isTheSame = true;
        int tempSum = rowsSum[0];

        for(int i = 1; (i < rowsSum.length) && isTheSame; i++) {
            if(tempSum != rowsSum[i]) {
                isTheSame = false;
            }
        }

        if(isTheSame) {
            return tempSum;
        } else {
            return -1;
        }
    }

    public static int sumCols(int[][] square) {
        int[] colsSum = new int[square.length];
        Arrays.fill(colsSum, 0);

        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square.length; j++) {
                colsSum[i] += square[j][i];
            }
        }

        boolean isTheSame = true;
        int tempSum = colsSum[0];

        for(int i = 1; (i < colsSum.length) && isTheSame; i++) {
            if(tempSum != colsSum[i]) {
                isTheSame = false;
            }
        }

        if(isTheSame) {
            return tempSum;
        } else {
            return -1;
        }
    }

    public static int sumDiags(int[][] square) {
        int[] diagsSum = new int[2];
        Arrays.fill(diagsSum, 0);

        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square.length; j++) {
                if(i == j) {
                    diagsSum[0] += square[i][j];
                }
                if(((square.length - 1) - j) == i) {
                    diagsSum[1] += square[i][j];
                }
            }
        }


        if(diagsSum[0] == diagsSum[1]) {
            return diagsSum[0];
        } else {
            return -1;
        }
    }
}
