package string;

public class FirstCharacterPrintTest {

    public static void main(String[] args) {


        String str = "Welcome To Tutorials Point";
        char c [] = str.toCharArray();
        System.out.println("The first character of each word: ");
        for (int i=0; i < c.length; i++) {
            // Logic to implement first character of each word in a string
            if (c[i] != ' ' && i == 0 || c[i-1] == ' ') {
                System.out.println(c[i]);
            }
        }
    }
}
