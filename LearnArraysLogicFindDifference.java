import java.util.Arrays;

public class LearnArraysLogicFindDifference {

    static int maximumDifference;
   static int[] elements = {1, 2, 5,3};

    static void computeDifference() {
        int loopcounter = 0;

        int diff;
        maximumDifference = 0;
        while (loopcounter < elements.length-1) {
            for (int i = 0; i < elements.length - 1; i++) {

                System.out.println("first number "+elements[loopcounter]+" second number "+elements[i + 1]);
                diff = Math.abs(elements[loopcounter] - elements[i + 1]);
               //System.out.println("Difference "+ diff);
               System.out.println(Math.abs(diff));
                if (Math.abs(diff) > maximumDifference) {
                    maximumDifference = diff;
                }
            }
            loopcounter++;
        }
       // System.out.println(maximumDifference);
    }

    static void computeDifferenceMaxMin() {
        int diff;
        maximumDifference = 0;
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
    }

    public static void main (String args[]){
        computeDifference();
        computeDifferenceMaxMin();
    }

    }
