package Dec172023;

import java.util.Scanner;

public class practice_question {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        // Questions


        // 1. write a java program to print an array.

        int ar[] = {45,36,25,14,78};

        for (int a : ar)
        {
            System.out.println(a);
        }

        System.out.println("---------------------------------------------------------");

        //2. write a java program to sum of array.

        int sum = 0;
        for (int a : ar)
        {
            sum = sum + a;
        }
        System.out.println(sum);

        System.out.println("---------------------------------------------------------");

        // 3. write a java program to find min and max element of an array.

        int max = Integer.MIN_VALUE;  // Integer.MIN_VALUE ---> -Infinity
        for (int a : ar)
        {
            if (max < a){
                max = a;
            }
        }
        System.out.println(max);

        System.out.println("-------");

        int min = Integer.MAX_VALUE;  // Integer.MAX_VALUE ---> +Infinity
        for (int a : ar)
        {
            if (min > a){
                min = a;
            }
        }
        System.out.println(min);

        System.out.println("--------------------------------------------------------------------");


        // 4. Find the element in the array .  # print the index number of that element .

        int k = 36;
        for (int i = 0; i<ar.length; i++){
            if (ar[i] == k){
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------------------------");


        // 5. write a java program to reverse a array.

        int temp = ar[0];
        ar[0] = ar[4];
        ar[4] = temp;
        int tem = ar[1];
        ar[1] = ar[3];
        ar[3] = tem;

        System.out.println(ar[0] + " " + ar[1] + " " + ar[2] + " " + ar[3] + " " + ar[4]);

        System.out.println("---------------------------------------");

        for (int a : ar){
            System.out.print(a + " ");
        }


    }
}
