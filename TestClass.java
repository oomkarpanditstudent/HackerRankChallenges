import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
int swaps=0;
int counter=0;

        //practice
        int[] a =new int[]{1,2,3};
        int len = a.length;
        System.out.println(len);
        System.out.println(Arrays.toString(a));

        while (true){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int holder=a[i];
                a[i]=a[i+1];
                a[i+1]=holder;
                counter++;
                swaps++;
            }
            System.out.println(Arrays.toString(a));
            System.out.println("Number of counter "+counter);
            System.out.println(Arrays.toString(a));

        }
            if (swaps==0){
                break;
            }
            else
                swaps=0;
        }
        System.out.println("Array is sorted in "+counter+" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("First Element: "+ a[a.length-1]);

    }
}