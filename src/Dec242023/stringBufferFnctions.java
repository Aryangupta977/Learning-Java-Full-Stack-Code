package Dec242023;

public class stringBufferFnctions {
    public static void main(String[] args) {

        //append()

        StringBuffer sb = new StringBuffer("Aryan ");
        sb.append("Gupta");
        System.out.println(sb);

        //insert()

        sb.insert(3,7354);
        System.out.println(sb);

        //reverse()

        sb.reverse();
        System.out.println(sb);

        //replace()

        sb.replace(5,7,"fh");
        System.out.println(sb);
    }
}
