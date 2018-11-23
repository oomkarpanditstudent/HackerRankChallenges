import java.io.*;
import java.util.*;

public class QueueAndStacks {

    Queue queue=new LinkedList();
    Stack stack= new Stack();

    public void pushCharacter(char c){
    stack.push(c);
    }
    public void enqueueCharacter(char c){
    queue.add(c);
    }
    private char popCharacter() {

       // Object peek = stack.peek();

        //char e= peek.toString().charAt(0);
       // System.out.println(e);
        return (Character) stack.pop();
    }

    private char dequeueCharacter() {

      //  Object peek = queue.peek();
      //  char d= peek.toString().charAt(0);
      //  System.out.println(d);
        return ((Character) queue.remove());
    }

    public static void main(String[] args) {


        //practice
          int[] a=new int[3];
          int len=a.length;
          System.out.println(len);

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            scan.close();

            // Convert input String to an array of characters:
            char[] s = input.toCharArray();

            // Create a Solution object:
            QueueAndStacks p = new QueueAndStacks();

            // Enqueue/Push all chars to their respective data structures:
            for (char c : s) {
                p.pushCharacter(c);
                p.enqueueCharacter(c);
            }

            // Pop/Dequeue the chars at the head of both data structures and compare them:
            boolean isPalindrome = true;
            for (int i = 0; i < s.length/2; i++) {
                if (p.popCharacter() != p.dequeueCharacter()) {
                    isPalindrome = false;
                    break;
                }
            }

            //Finally, print whether string s is palindrome or not.
            System.out.println( "The word, " + input + ", is "
                    + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        }



}
