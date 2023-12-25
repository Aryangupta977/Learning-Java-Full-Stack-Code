package Dec23_2023;

import Dec172023.Array;

import java.util.Arrays;

public class stringmanupulations {
    public static void main(String[] args) {

        // Length

        String s = "aryan gupta";
        System.out.println(s.length());

        // Concentation

        String s1 = "Aryan";
        String s2 = "Gupta";
        String s3 = s1 + s2;
        System.out.println(s3);

        //to char array()

        String s4 = "Aryan";
        char arr[] = s4.toCharArray();
        System.out.println("to char Array = " + Arrays.toString(arr));

        // charAt()

        String s5 = "Aryan";
        System.out.println("Char at = " + s5.charAt(4));

        //compareto()

        String s6 = "hello";
        String s7 = "Hello";

        int res = s6.compareTo(s7);
        System.out.println(res);

        // == reference comparison equals()
        System.out.println(s6.equals(s7));

        // contains()

        String s8 = "Hello Aryan welcome to the development course spark 1.0";
        System.out.println(s8.contains("to the"));

        //indexof()

        System.out.println(s8.indexOf('w'));

        //repalce()

        String ss = "Hello world";
        String res1 = ss.replace("Hello" , "Aryan");
        System.out.println(res1);

        //substring()

        String r1 = "Hello Aryan welcome to the development course spark 1.0";
        String r2 = r1.substring(0,9);
        System.out.println(r2);
    }
}

