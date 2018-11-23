import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.*;
import java.io.*;

class Solution1{

public static void main(String[] args) {

     String s1= "java";
     String s2= "hello";

     int length =s1.length()+s2.length();
     System.out.println(length);

     System.out.print(s2.compareTo(s1));


     System.out.println(s1.toUpperCase());
     System.out.println(s2.toUpperCase());

     System.out.println(s1.substring(0,1).toUpperCase() );

    //System.out.println(char s3=s1.charAt(0));
    //System.out.println(char s4=s2.charAt(0));
    // s1.replace(s1.charAt(0),s3);
     //s2.replace(s2.charAt(0),s4);
    //System.out.println(s3);
    //System.out.println(s4);


    System.out.println(s1);
    System.out.println(s2);




 /*   Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

        int n = in.nextInt();
        int p = in.nextInt();
        Calculator myCalculator = new Calculator();
        try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
        }
        in.close();*/
        }
        }

