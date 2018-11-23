public class Learn2DArrays_Hacker {

    public static int[][] makeArray( int r, int c) {
        int  rowsize = r;
        int  colsize = c;
        int  increment=1;
        int[][] newArray = new int[rowsize][colsize];

        for (int i = 0; i < rowsize; i++) {
            for (int ii = 0; ii < colsize; ii++) {
                newArray[i][ii] = increment;
                increment+=1;
            }
      // increment+=1;
        }
        return newArray;
    }

    public static void showArray(int[][] arrayAsArg) {
        int arr[][] = arrayAsArg;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ROW " + i);

            for (int ii = 0; ii < arr[i].length; ii++) {
              //  System.out.print("Column " + ii+ " ");
                System.out.print("  "+arr[i][ii] + " ");
            }
           System.out.println(" ");
        }
    }

    public static void pickArray(int[][] arrayAsArg) {
        int arr[][] = arrayAsArg;
        int start ;
        int rowstart=-1;
        int subtotal=0;
        int maxinrow=0;
        int max=0;
       for (int moverowsdone = 0; moverowsdone < arr.length-2;moverowsdone++) {
            rowstart++; // this moves the row down to grab until n-2 // row shifter to downward
            start=-1;   // this is a column mover to right
            for (int topcols = 0; topcols < arr[0].length - 2; topcols++) {
               // System.out.println("          Hour Glass " + topcols);
                start++;
                int counter=0;
                for (int row = 0+rowstart; row < 3+rowstart; row++) {  //ROWS FOR EACH ITERATION
                    // System.out.print("ROW " + row+"      ");

                    for (int col = 0+start; col < 3+start; col++) {   // COLUMNS FOR EACH ITERATION
                        //  System.out.print("Column " + ii+ " ");
                        counter++;
                        System.out.print(" "+arr[row][col] + " ");
                        if (counter != 4 & counter != 6){
                        subtotal+=arr[row][col];
                    }
                    }
                  //  System.out.println(" ");
                }
                //System.out.println(" Total of above Hour Glass is "+subtotal); //Total of each Hour Glass
                //System.out.println(" ");
                if (subtotal>max){
                    max=subtotal;
                }
             //   if (subtotal>maxinrow){
               //     maxinrow=subtotal;
                //}
                subtotal=0;
            }
          //  System.out.println(" EACH 3 Rows Four Columns extracted");
           // System.out.println(" In this lot max value of any hour glass is  "+maxinrow);
           // System.out.println(" ");
           // maxinrow=0;

       }
        System.out.println(max);
   }

    public static void main(String args[]) {


        showArray(makeArray( 6, 6));
         int[][] testArray=makeArray( 6, 6);
         pickArray(testArray);

    }
}