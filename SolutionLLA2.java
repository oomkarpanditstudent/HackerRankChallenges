import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}

class SolutionLLA99
{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node start = head;
        Node current = start.next;

        if (head.next == null) {
            return head;
        }

        while (current.next!=null) {
            if (start.data == current.data) {
                System.out.println("Match Found: ");
                System.out.println(" As soon as there is a match Found : Data on Left at start " + start.data + " Data on right " + current.data);
              System.out.println("Value of Left OBJ NEXT LINK " + start.next + " Value of Right OBJ NEXT LINK " + current.next.toString());

                while (start.data==current.data && current.next!=null ){
               // start=start.next;
                    System.out.println("On Comparision found a match - CURRENT.NEXT is not null - Same left right -Data on Left " + start.data + " Data on right " + current.data);

                    current=current.next;
                    System.out.println(" As found another match for current next - continued to Move on current=current.next " + current.next);

                }
                if ((start.data==current.data && current.next==null )) {
                    System.out.println(" Continued to end still matching- going to mark Start.next=null " + start.data + " Data on right " + current.data);

                    start.next = null;
                    break;
                }
                start.next = current;
                System.out.println("Renamed start.next  so that it point to right link in final run with skipping duplicate " + start.next);
                start=start.next;
                System.out.println("Moved on start to next one from it next column " + start.next);
                if (start.next==null)
                    break;
                    //current.next = current.next.next;
                 if (current.next!=null) {
                   current= current.next;
                     System.out.println("Moving on  current=current.next  as sill more items to compare" + current.next);
                }
                System.out.println("renamed new left " + start.data + " New data on right " + current.data);

                // System.out.println("NOW Value of Left OBJ NEXT LINK " + start.next.toString() + " Value of Right OBJ NEXT LINK " + current.next.toString());
            }

            else {
                System.out.println("MATCH NOT FOUND - COMPARED - Data on Left " + start.data + " Data on right " + current.data);
                start= start.next;
                System.out.println("Moved LEFT PLACE HOLDER to next but not moved current yet " + start.data + " Data on right " + current.data);
                if (current.next!=null){
                current= current.next;
                System.out.println("Now Moved RIGHT PLACE HOLDER to next  so that we can do next compare Start Data and Current DATA " + start.data + "   right " + current.data);}
                else {
                    current.next=null;
                }
            }
        }
        if (start.data == current.data &&  current.next==null){
            start.next=null;
        }

        return head;
        }


    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}