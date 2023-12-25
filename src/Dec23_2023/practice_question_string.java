package Dec23_2023;

import java.util.Scanner;

public class practice_question_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question

        // 1. wjp to combine two string
        String s1 = "Narendra";
        String s2 = "Modi";
        String s3 = s1+s2;
        System.out.println(s3);

        // 2. wjp to compare to string

        String s4 = "Aryan";
        String s5 = "Gupta";
        System.out.println(s4.compareTo(s5));

        // 3. wjp to count numbers of words in the string

        String s6 = "I will be the programmer";
        System.out.println(s6.length());

        // 4. wjp to check first string is present in second string

        String s7 = "He is the great man and we should prase him";
        String s8 = "great";
        System.out.println(s7.matches(s8));
    }
}
