package collection;

public class Substring {

    public static void main(String args[])
    {

        // Initializing String
        String Str = new String("Welcome to geeksforgeeks");

        // using substring() to extract substring
        // returns (whiteSpace)geeksforgeeks

        System.out.print("The extracted substring is : ");
        System.out.println(Str.substring(10));
    }
}

