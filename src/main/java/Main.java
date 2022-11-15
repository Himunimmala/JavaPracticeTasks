import org.example.Tasks;

public class Main {
    public static void main(String[] args) {

        System.out.println("****TASK1*****");
        Tasks t1=new Tasks();
        double[] a=t1.randnum();
        double min=t1.minarr(a);
        double max=t1.maxarr(a);
        double avg=t1.avgarr(a);

        t1.display(a);
        System.out.println("minimum value in array="+min);
        System.out.println("maximum value in array="+max);
        System.out.println("average value in array="+avg);


        System.out.println("\n****TASK2*****");
        double[] bubblesort=t1.bubbesort(a);
        System.out.println("Bubble sort of an array");
        for(int i=0;i< bubblesort.length;i++)
        {
            System.out.println(bubblesort[i]);
        }
        System.out.println("\n****TASK3*****");
        System.out.println("Prime number in range[0,200]");
        int[] arr=new int[201];
        for(int i=0;i<=200;i++)
        {
            arr[i]=i;

        }
        t1.prime(arr);
        System.out.println("\n****TASK4*****");
        int[] arr2=new int[10];
        int[] arr3=new int[10];
        arr2= new int[]{1, 2, 3, 3,4,5,6,7,8,2,1};
        arr3=t1.remove(3,arr2);
        System.out.println("Removal array");
        for(int i=0;i< arr3.length-1;i++)
        {
            System.out.println(arr3[i]);
        }
        System.out.println("\n****TASK5*****");
     String s="himaja";
     t1.CountLetters(s);
     System.out.println("\n****TASK6*****");
     System.out.println("Iterator over the Integer array");
     t1.iter(arr2);

     System.out.println("\n****TASK7*****");
     String st="himajahim";
     char unique=t1.countunique(st);
        if (unique == '0')
        {
            System.out.println("No unique element in string");

        }
        else {
            System.out.println("Unique character in the string:" + unique);
        }


    }
}