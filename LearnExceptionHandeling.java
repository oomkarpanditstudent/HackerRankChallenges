import javax.print.DocFlavor;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LearnExceptionHandeling {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int t = Integer.parseInt(S);
            System.out.println(t);
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
