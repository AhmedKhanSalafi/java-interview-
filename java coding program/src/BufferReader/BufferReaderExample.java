package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderExample {

    public static void main(String args[]) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Welcome Dear love " + name);
    }
}