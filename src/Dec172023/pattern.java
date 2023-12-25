package Dec172023;

public class pattern {
    public static void main(String[] args) {


        // Pattern

        /*
           *
           * *
           * * *
           * * * *
           * * * * *
         */

        int rows = 5;
        for (int i =1 ; i<=rows; i++ )
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("------------------------------------");




        /*
            * * * * *
            * * * *
            * * *
            * *
            *
         */


        for (int a = rows;a >= 1 ; a--)
        {
            for (int b= 1; b<=a; b++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("-----------------------");


        /*
           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
         */




        for (int c =1 ; c<=rows; c++)
        {
            for ( int d = 1; d<=c; d++)
            {
                System.out.print(d + " ");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------");


        /*
           5 4 3 2 1
           4 3 2 1
           3 2 1
           2 1
           1
         */


         // Adjust the number of rows as needed

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {

            // Inner loop for spaces
            for (int j = 0; j < i; j++) {
                System.out.print("   "); // Adjust the number of spaces as needed
            }

            // Inner loop for numbers
            for (int k = rows - i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line after each row
        }

            }
        }


