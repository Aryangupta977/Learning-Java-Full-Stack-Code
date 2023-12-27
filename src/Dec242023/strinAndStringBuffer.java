package Dec242023;

public class strinAndStringBuffer {
    public static void main(String[] args) {

        // Difference between string and stringbuffer

        //ANS:- In string if we want to add a new lement
        // into the string it gives us new object but in
        // stringbuffer we can do this in the same element .

        //Examples:-    |
        //              |
        //              ^


        // String

        String s1 = "Hello";
        String s2 = s1.concat("GuptaJI");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);


        // StringBuffer

        StringBuffer s3 = new StringBuffer("Aryan ");
        s3.append("Gupta");
        System.out.println(s3);
    }
}
