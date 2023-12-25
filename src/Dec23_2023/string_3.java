package Dec23_2023;

public class string_3 {
    public static void main(String[] args) {

        char arr[] = {'A', 'r','y','a','n'};
        for(char ch : arr) {
            System.out.print(ch);
        }

        System.out.println();

        // or a different way

        String s = new String(arr);
        System.out.println(arr);
    }
}
