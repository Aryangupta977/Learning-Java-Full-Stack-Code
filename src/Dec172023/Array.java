package Dec172023;

public class Array {
    public static void main(String[] args) {

        int ar[] = new int[10];

        for(int i = 0; i<10; i++)
        {
            ar[i]=i;
        }

        // Get value to print each-for

        for (int a : ar)
        {
            System.out.print(a);
        }

        System.out.println();
        System.out.println("-------------------------------------");


        // Another way of doing the inicializaztion of the array

        int arr[] = {10,20,30,40,50};

        for (int i = 0; i<=4; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("------------------");

        for (int b : arr)
        {
            System.out.println(b);
        }


        System.out.println("----------------------");


        //How to find length of an array
        System.out.println("Length of Array = " + arr.length);

    }
}
