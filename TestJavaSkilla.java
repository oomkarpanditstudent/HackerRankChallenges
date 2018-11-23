




import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class TestJavaSkilla {

    public static int[][] makeArray( int r, int c) {
        int  rowsize = r;
        int  colsize = c;
        int  increment=100;
        int[][] newArray = new int[rowsize][colsize];

        for (int i = 0; i < rowsize; i++) {

            for (int ii = 0; ii < colsize; ii++) {
                newArray[i][ii] =  increment;
                increment+=100;

            }
        increment+=400;
        }
        return newArray;

    }

    public static void showArray(int[][] arrayAsArg) {
        int arr[][] = arrayAsArg;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ROW " + i);
           // System.out.print("Array Length "+arr.length +" Thank");

            for (int ii = 0; ii < arr[i].length; ii++) {
              //  System.out.print("Column " + ii+ " ");
                System.out.print(arr[i][ii] + " ");


            }

            System.out.println("");

           // System.out.print("Array Length "+arr.);

        }

    }

    public static void pickArray(int[][] arrayAsArg) {
        int arr[][] = arrayAsArg;
        int start ;
        int rowstart=-1;
       // int col;
       for (int moverowsdone = 0; moverowsdone < arr.length-2;moverowsdone++) {

            rowstart++;
            start=-1;
            int col=0;

            for (int topcols = 0; topcols < arr[0].length - 2; topcols++) {
                System.out.println("                        Hour Glass " + topcols);
                start++;
                for (int row = 0+rowstart; row < 3+rowstart; row++) {
                     System.out.println("ROW " + row);
                    // System.out.print("Array Length "+arr.length +" Thank");

                    for (col = 0 + start; col < 3 + start; col++) {
                        //  System.out.print("Column " + ii+ " ");
                        System.out.print(arr[row][col] + " ");


                    }

                    System.out.println("");

                    // System.out.print("Array Length "+arr.);

                }

            }

            System.out.println("3 Rows Four Columns extracted");
        }
   }

    public static void main(String args[]) {


      showArray(makeArray( 6, 6));

        int[][] testArray=makeArray( 6, 6);
       pickArray(testArray);

    }
}