package com.rohit;

public class javaIntv {

    public static void main(String[] args) {


        100 Java Programs

        Contents

        Java Programs	1
        1.	Simple Java Program	4
        2.	Print Integer in java	4
        3.	Command Line Argument	4
        4.	How to get Using input using Scanner Program in java	5
        5.	How to convert Fahrenheit to Celsius	Program in java	5
        6.	How to swap 2 no using 3rd variable Program in java	6
        7.	How to swap 2 no without using 3rd variable Program in java	6
        8.	How to add two number Program in java	7
        9.	Find Largest no in java Program	8
        10.	If Else clause in java	8
        11.	If Else clause in java- Program 2	9
        12.	Nested If Else clause in java	9
        13.	How to check Odd and Even Number in java	10
        14.	Find factorial for given no Program in Java	10
        15.	How to complete 2 string in Java program	11
        16.	Simple For  Loop Program in Java	12
        17.	Print Star console using Loop	12
        18.	Print Star console using Loop	13
        19.	While loop Program in java	13
        20.	Print Reverse number in java program	14
        21.	While loop using break Program in java	14
        22.	While loop using break and continue Program in java	15
        23.	Print all alphabet using for loop Program in java	15
        24.	Enhance loop in java Program	16
        25.	Print Multiplication table Program in java	16
        26.	Print prime no  Program in java	17
        27.	Check no is Armstrong or not   in java Program	18
        28.	Print Floyd’s Triangle in java Program	19
        29.	Find All substring of string in java Program	19
        30.	Print reverse string  in java Program	20
        31.	Check Given No is palindrome or Not in java Program	21
        32.	How to add two matrix in java Program	22
        33.	How to multiply two matrix in java Program	23
        34.	How to get transpose of matrix in java Program	24
        35.	How to compare 2 string in java Program	25
        36.	How to string width with specific char in java Program	25
        37.	How to use indesOf() in java Program	25
        38.	How to replace string with another string in java Program	26
        39.	How to split string in java Program	26
        40.	How to remove space in string both end in java Program	26
        41.	How to convert all char in string lower case in java Program	26
        42.	How to create method  in java Program	27
        43.	Find Length, Concatenate and Replace String in Java Program	27
        44.	How Static block working in java Program	28
        45.	Difference between Static and Instance method working in java Program	28
        46.	How to create Multiple class in java Program	29
        47.	How to create constructor  in java Program	29
        48.	How to create constructor overloading in java Program	30
        49.	Exception Handling java Program	30
        50.	How to throw exception in java Program	31
        51.	Advantage of Finally in Exception Handling java Program	31
        52.	How to create Interface in java Program	32
        53.	How to print date and time in java Program	32
        54.	How to SQL Date in java Program	33
        55.	How to Date format in java Program	33
        56.	How to Generate random number in java Program	34
        57.	How perform garbage collection in java Program	34
        58.	How to get own IP Address in java Program	34
        59.	How to open notepad in  java Program	35
        60.	Leaner search Program in java	35
        61.	Binary search Program in java	36
        62.	Bubble sort Program in java	37
        63.	How to connect Database using java Program	37
        64.	How to insert data in table using JDBC in java Program	38
        65.	How to insert image  using JDBC in java Program	38
        66.	How to execute Procedure in JDBC in java Program	39
        67.	How to check Regular expression in java Program	39
        68.	How to create Multithreading program in java	39
        69.	How to join thread in java program	40
        70.	How to write data in text file using java  program	40
        71.	How to read data from text file using java program	40
        72.	How to get URL of site using java Programs	41
        73.	How to get IP address from site URL using java program	41
        74.	How to create AWT program in java	41
        75.	How to add lable in AWT  program in java	42
        76.	How to add text area program in java	42
        77.	How to dropdown in AWT program in java	42
        78.	How to create Swing program in java	43
        79.	How to add checkbox in Swing program in java	43
        80.	How to convert string to integer in java program	44
        81.	How to convert integer to string in java program	44
        82.	How to convert string to long in java	44
        83.	How to convert string to float in java	44
        84.	How to convert string to double in java program	44
        85.	How to convert string to date in java program	45
        86.	Create   ArrayList program in java	45
        87.	How to create LinkedList program in java	46
        88.	How to ArrayList using list interface program in java	46
        89.	How to create Hashset program in java	47
        90.	How to create LinkedHashSet program in java	47
        91.	How to create TreeSet program in java	48
        92.	How to create PriorityQueue program in java	48
        93.	How to create HashMap using map interface program in java	49
        94.	How to create LinkedHashMap program in java	49
        95.	How to create TreeMap program in java	49
        96.	How to create Hashtable program in java	50
        97.	How to create Array program in java	50
        98.	How to create Multidimensional array program in java	50
        99.	How to create Find Factorial No using Recursion Program in java	51
        100.	How to create Method Overriding program in java	51



        1.	Simple Java Program
        class HelloWorld
        {
            public static void main(String args[])
            {
                System.out.println("Hello World by Technolamror");
            }
        }





        2.	Print Integer in java










        3.	Command Line Argument in java
        class Arguments {
            public static void main(String[] args) {
                for (String t: args) { System.out.println(t);
                }
            }
        }








        4.	How to get Using input using Scanner Program in java
import java.util.Scanner;

        class GetInputFromUser
        {
            public static void main(String args[])
            {
                int a; float b; String s;

                Scanner in = new Scanner(System.in);

                System.out.println("Enter a string"); s = in.nextLine();
                System.out.println("You entered string "+s);

                System.out.println("Enter an integer"); a = in.nextInt();
                System.out.println("You entered integer "+a);

                System.out.println("Enter a float"); b = in.nextFloat();
                System.out.println("You entered float "+b);
            }
        }





        5.	How to convert Fahrenheit to Celsius Program in java
import java.util.*;

        class FahrenheitToCelsius {
            public static void main(String[] args) {
                float temperatue;
                Scanner in = new Scanner(System.in);

                System.out.println("Enter temperatue in Fahrenheit"); temperatue = in.nextInt();

                temperatue = ((temperatue - 32)*5)/9;

                System.out.println("Temperatue in Celsius = " + temperatue);
            }
        }








        6.	How to swap 2 no using 3rd variable	Program in java
import java.util.Scanner;

        class SwapNumbers
        {
            public static void main(String args[])
            {
                int x, y, temp; System.out.println("Enter x and y"); Scanner in = new Scanner(System.in);

                x = in.nextInt(); y = in.nextInt();

                System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

                temp = x; x = y;
                y = temp;

                System.out.println("After Swapping\nx = "+x+"\ny = "+y);
            }
        }





        7.	How to swap 2 no without using 3rd variable Program in java
import java.util.Scanner;

        class SwapNumbers
        {
            public static void main(String args[])
            {
                int x, y;
                System.out.println("Enter x and y"); Scanner in = new Scanner(System.in);

                x = in.nextInt(); y = in.nextInt();

                System.out.println("Before Swapping\nx = "+x+"\ny = "+y);


                x = x + y; y = x - y;
                x = x - y;

                System.out.println("After Swapping\nx = "+x+"\ny = "+y);
            }
        }





        8.	How to add two number Program in java


import java.util.Scanner;

        class AddNumbers
        {

            number2 = in.nextLine();
            BigInteger first = new BigInteger(number1); BigInteger second = new BigInteger(number2); BigInteger sum;

            sum = first.add(second);

System.out.println("Result of addition = " + sum);
        }

    }



9.	Find Largest no in java Program
import java.util.Scanner;

    class LargestOfThreeNumbers
    {
        public static void main(String args[])
        {
            int x, y, z;
            System.out.println("Enter three integers "); Scanner in = new Scanner(System.in);

            x = in.nextInt(); y = in.nextInt(); z = in.nextInt();

            if ( x > y && x > z )
                System.out.println("First number is largest.");
            else if ( y > x && y > z ) System.out.println("Second number is largest.");
            else if ( z > x && z > y ) System.out.println("Third number is largest.");
            else
                System.out.println("Entered numbers are not distinct.");
        }
    }





10.	If Else clause in java







}
else {
        System.out.println("What are you doing here?");
        }
        }
        }








        11.	If Else clause in java- Program 2
// If else in Java code
        import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        int marksObtained, passingMarks; passingMarks = 40;
        Scanner input = new Scanner(System.in); System.out.println("Input marks scored by you"); marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) { System.out.println("You passed the exam.");
        }
        else {
            System.out.println("Unfortunately you failed to pass the exam.");
        }
    }
}




12.	Nested If Else clause in java
        import java.util.Scanner;

        Scanner input = new Scanner(System.in); System.out.println("Input marks scored by you"); marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
        if (marksObtained > 90) grade = 'A';

        else if (marksObtained > 75) grade = 'B';
        else if (marksObtained > 60) grade = 'C';
        else
        grade = 'D';

        System.out.println("You passed the exam and your grade is " + grade);
        }
        else {
        grade = 'F';
        System.out.println("You failed and your grade is " + grade);
        }
        }
        }




        13.	How to check Odd and Even Number in java.
        import java.util.Scanner;

class OddOrEven
{
    public static void main(String args[])
    {
        int x;
        System.out.println("Enter an integer to check if it is odd or even "); Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if ( x % 2 == 0 )
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}




14.	Find factorial for given no Program in Java
        import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial"); Scanner in = new Scanner(System.in);

        n = in.nextInt();


        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ ) fact = fact*c;

            System.out.println("Factorial of "+n+" is = "+fact);

        }
    }




15.	How to complete 2 string in Java program
import java.util.Scanner;

    class CompareStrings
    {
        public static void main(String args[])
        {
            String s1, s2;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the first string"); s1 = in.nextLine();

            System.out.println("Enter the second string"); s2 = in.nextLine();

            if ( s1.compareTo(s2) > 0 )
                System.out.println("First string is greater than second.");
            else if ( s1.compareTo(s2) < 0 )
                System.out.println("First string is smaller than second.");
            else
                System.out.println("Both strings are equal.");
        }
    }




16.	Simple For Loop Program in Java
    //Java for loop program
    class ForLoop {
        public static void main(String[] args) {
            int c;

            for (c = 1; c <= 10; c++) { System.out.println(c);
            }
        }
    }




17.	Print Star console using Loop
    class Stars {
        public static void main(String[] args) {
            int row, numberOfStars;

            for (row = 1; row <= 10; row++) {
                for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) { System.out.print("*");
                }
                System.out.println(); // Go to next line
            }
        }
    }








18.	Print Star console using Loop














19.	  While loop Program in java
import java.util.Scanner;

    class WhileLoop {
        public static void main(String[] args) {
            int n;

            Scanner input = new Scanner(System.in); System.out.println("Input an integer");

            while ((n = input.nextInt()) != 0) { System.out.println("You entered " + n); System.out.println("Input an integer");
            }

            System.out.println("Out of loop");
        }

    }




20.	Print Reverse number in java program
import java.util.Scanner;

    class ReverseNumber
    {
        public static void main(String args[])
        {
            int n, reverse = 0;

            System.out.println("Enter the number to reverse"); Scanner in = new Scanner(System.in);
            n = in.nextInt();

            while( n != 0 )
            {
                reverse = reverse * 10; reverse = reverse + n%10; n = n/10;
            }

            System.out.println("Reverse of entered number is "+reverse);
        }
    }




21.	While loop using break Program in java
import java.util.Scanner;

    class BreakWhileLoop {
        public static void main(String[] args) {
            int n;

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Input an integer"); n = input.nextInt();

                if (n == 0) {
                    break;
                }
                System.out.println("You entered " + n);
            }
        }
    }








22.	While loop using break and continue Program in java
import java.util.Scanner;

    class BreakContinueWhileLoop {
        public static void main(String[] args) {
            int n;

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Input an integer"); n = input.nextInt();

                if (n != 0) {
                    System.out.println("You entered " + n);
                    continue;
                }
                else {
                    break;
                }
            }
        }
    }




23.	Print all alphabet using for loop Program in java
    class Alphabets
    {
        public static void main(String args[])
        {
            char ch;

            for( ch = 'a' ; ch <= 'z' ; ch++ ) System.out.println(ch);
        }
    }




24.	Enhance loop in java Program
    class EnhancedForLoop {
        public static void main(String[] args) {
            int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

            for (int t: primes) { System.out.println(t);
            }
        }
    }
    //For String
    class EnhancedForLoop {
        public static void main(String[] args) {
            String languages[] = { "C", "C++", "Java", "Python", "Ruby"};

            for (String sample: languages) { System.out.println(sample);
            }
        }
    }




25.	Print Multiplication table Program in java
import java.util.Scanner;

    class MultiplicationTable
    {
        public static void main(String args[])
        {
            int n, c;
            System.out.println("Enter an integer to print it's multiplication table");
            Scanner in = new Scanner(System.in); n = in.nextInt();
            System.out.println("Multiplication table of "+n+" is :-");
            for ( c = 1 ; c <= 10 ; c++ ) System.out.println(n+"*"+c+" = "+(n*c));
        }
    }

//For Any Number
import java.util.Scanner;

    class Tables
    {
        public static void main(String args[])
        {
            int a, b, c, d;


            System.out.println("Enter range of numbers to print their multiplication table");
            Scanner in = new Scanner(System.in);

            a = in.nextInt(); b = in.nextInt();

            for (c = a; c <= b; c++) { System.out.println("Multiplication table of "+c);

                for (d = 1; d <= 10; d++) { System.out.println(c+"*"+d+" = "+(c*d));
                }
            }
        }
    }




26.	Print prime no Program in java
import java.util.*;

    class PrimeNumbers
    {
        public static void main(String args[])
        {
            int n, status = 1, num = 3;

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of prime numbers you want"); n = in.nextInt();

            if (n >= 1)
            {
                System.out.println("First "+n+" prime numbers are :-"); System.out.println(2);
            }

            for ( int count = 2 ; count <=n ; )
            {
                for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
                {
                    if ( num%j == 0 )
                    {
                        status = 0;
                        break;
                    }
                }
                if ( status != 0 )
                {
                    System.out.println(num); count++;
                }

                status = 1; num++;
            }
        }
    }




27.	Check no is Armstrong or not	in java Program

System.out.println(n + " is not an Armstrong number.");
}

    static int power(int n, int r) {
        int c, p = 1;

        for (c = 1; c <= r; c++) p = p*n;

        return p;

    }
}




28.	Print Floyd’s Triangle	in java Program
        import java.util.Scanner;

class FloydTriangle
{
    public static void main(String args[])
    {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of floyd's triangle you want");
        n = in.nextInt(); System.out.println("Floyd's triangle :-");
        for ( c = 1 ; c <= n ; c++ )
        {
            for ( d = 1 ; d <= c ; d++ )
            {
                System.out.print(num+" "); num++;
            }

            System.out.println();
        }
    }
}




29.	Find All substring of string in java Program
        import java.util.Scanner;

class SubstringsOfAString
{
    public static void main(String args[])
    {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings"); string = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \""+string+"\" are :-");

        for( c = 0 ; c < length ; c++ )
        {
            for( i = 1 ; i <= length - c ; i++ )
            {
                sub = string.substring(c, c+i); System.out.println(sub);
            }
        }
    }
}




30.	Print reverse string in java Program
        import java.util.*;

class ReverseString
{
    public static void main(String args[])
    {
        String original, reverse = ""; Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse"); original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- ) reverse = reverse + original.charAt(i);

        System.out.println("Reverse of entered string is: "+reverse);
    }
}
//Using Internal java Methog
class InvertString
{
    public static void main(String args[])
    {
        StringBuffer a = new StringBuffer("Java programming is fun"); System.out.println(a.reverse());
    }
}




31.	Check Given No is palindrome or Not in java Program
        import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        String original, reverse = ""; Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome"); original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- ) reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");

    }
}
//Another Method
import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string"); inputString = in.nextLine();

        int length = inputString.length();
        int i, begin, end, middle;

        begin = 0;
        end	= length - 1; middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) { begin++;
                end--;
            }
            else {
                break;
            }
        }

        if (i == middle + 1) { System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}




32.	How to add two matrix in java Program
        import java.util.Scanner;

class AddTwoMatrix
{
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix"); m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ ) first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ ) second[c][d] = in.nextInt();

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                sum[c][d] = first[c][d] + second[c][d]; //replace '+' with '-' to subtract matrices

        System.out.println("Sum of entered matrices:-");

        for ( c = 0 ; c < m ; c++ )
        {
            for ( d = 0 ; d < n ; d++ ) System.out.print(sum[c][d]+"\t");

            System.out.println();

        }
    }
}




33.	How to multiply two matrix in java Program
        import java.util.Scanner;

class MatrixMultiplication
{
    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt(); n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ ) first[c][d] = in.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt(); q = in.nextInt();

        if ( n != p )
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q]; System.out.println("Enter the elements of second matrix");
            for ( c = 0 ; c < p ; c++ )
                for ( d = 0 ; d < q ; d++ ) second[c][d] = in.nextInt();

            for ( c = 0 ; c < m ; c++ )
            {
                for ( d = 0 ; d < q ; d++ )
                {
                    for ( k = 0 ; k < p ; k++ )
                    {

                        sum = sum + first[c][k]*second[k][d];
                    }

                    multiply[c][d] = sum; sum = 0;
                }
            }

            System.out.println("Product of entered matrices:-");

            for ( c = 0 ; c < m ; c++ )
            {
                for ( d = 0 ; d < q ; d++ ) System.out.print(multiply[c][d]+"\t");

                System.out.print("\n");
            }
        }
    }
}




34.	How to get transpose of matrix in java Program
        import java.util.Scanner;

class TransposeAMatrix
{
    public static void main(String args[])
    {
        int m, n, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix"); m = in.nextInt();
        n = in.nextInt();
        int matrix[][] = new int[m][n]; System.out.println("Enter the elements of matrix"); for ( c = 0 ; c < m ; c++ )
        for ( d = 0 ; d < n ; d++ )
            matrix[c][d] = in.nextInt();
        int transpose[][] = new int[n][m]; for ( c = 0 ; c < m ; c++ )
    {
        for ( d = 0 ; d < n ; d++ ) transpose[d][c] = matrix[c][d];
    }


        System.out.println("Transpose of entered matrix:-");

        for ( c = 0 ; c < n ; c++ )
        {
            for ( d = 0 ; d < m ; d++ ) System.out.print(transpose[c][d]+"\t");

            System.out.print("\n");
        }
    }
}




35.	How to compare 2 string in java Program
public class LastIndexOfExample{ public static void main(String args[]){ String s1="hello";
    String s2="hello"; String s3="meklo"; String s4="hemlo";
    System.out.println(s1.compareTo(s2)); System.out.println(s1.compareTo(s3)); System.out.println(s1.compareTo(s4));
}}



36.	How to string width with specific char in java Program
class StringEndwith{
    public static void main(String args[]){ String s1="java by TechnoLamror"; System.out.println(s1.endsWith("r")); //true
        System.out.println(s1.endsWith("Lamror")); //true System.out.println(s1.endsWith("lamror"));//false
    }
}

37.	How to use indesOf() in java Program
public class IndexOfExample{
    public static void main(String args[]){ String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring System.out.println(index1+" "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value System.out.println(index4);//3
    }}

38.	How to replace string with another string in java Program
public class ReplaceAllExample2{
    public static void main(String args[]){
        String s1="My name is Rajendra. My name is lamror. My name is Technolamror."; String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }}

39.	How to split string in java Program
public class SplitExample{
    public static void main(String args[]){
        String s1="java string split method by Technolamror";
        String[] words=s1.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        for(String w:words){ System.out.println(w);
        }
    }}

40.	How to remove space in string both end in java Program
public class StringTrimExample{
    public static void main(String args[]){ String s1=" hello string	";
        System.out.println(s1+"Technolamror");//without trim() System.out.println(s1.trim()+"Technolamror");//with trim()
    }}

41.	How to convert all char in string lower case in java Program
public class StringLowerExample{
    public static void main(String args[]){
        String s1="TECHNOLAMROR by Rajendralamror HELLO stRIng"; String s1lower=s1.toLowerCase();

        System.out.println(s1lower);
    }}

42.	How to create method in java Program
class Methods {

// Constructor method





43.	Find Length, Concatenate and Replace String in Java Program
    class StringMethods
    {
        public static void main(String args[])
        {
            int n;
            String s = "Java programming", t = "", u = ""; System.out.println(s);
// Find length of string

            n = s.length();
            System.out.println("Number of characters = " + n);

// Replace characters in string

            t = s.replace("Java", "C++"); System.out.println(s); System.out.println(t);

// Concatenating string with another string

            u = s.concat(" is fun"); System.out.println(s); System.out.println(u);
        }
    }




44.	How Static block working in java Program




45.	Difference between Static and Instance method working in java Program
    class Difference {

        public static void main(String[] args) { display(); //calling without object

            Difference t = new Difference(); t.show(); //calling using object
        }

        static void display() { System.out.println("Programming is amazing.");
        }

        void show(){
            System.out.println("Java is awesome.");
        }
    }




46.	How to create Multiple class in java Program
    class Computer { Computer() {
        System.out.println("Constructor of Computer class.");
    }

        void computer_method() {
            System.out.println("Power gone! Shut down your PC soon...");
        }

        public static void main(String[] args) { Computer my = new Computer();
            Laptop your = new Laptop();

            my.computer_method(); your.laptop_method();
        }
    }

    class Laptop { Laptop() {
        System.out.println("Constructor of Laptop class.");
    }

        void laptop_method() {
            System.out.println("99% Battery available.");
        }
    }




47.	How to create constructor in java Program
    class Programming {
        //constructor method
        Programming() {
            System.out.println("Constructor method called.");
        }


        public static void main(String[] args) {
            Programming object = new Programming(); //creating object
        }
    }




48.	How to create constructor overloading in java Program
    class Language { String name;

        Language() {
            System.out.println("Constructor method called.");
        }

        Language(String t) { name = t;
        }

        public static void main(String[] args) { Language cpp = new Language(); Language java = new Language("Java");

            cpp.setName("C++");

            java.getName(); cpp.getName();
        }

        void setName(String t) { name = t;
        }

        void getName() {
            System.out.println("Language name: " + name);
        }
    }




49.	Exception Handling java Program
    class Division {
        public static void main(String[] args) {

            int a, b, result;

            Scanner input = new Scanner(System.in); System.out.println("Input two integers");

            a = input.nextInt(); b = input.nextInt();

// try block

            try {
                result = a / b; System.out.println("Result = " + result);
            }

// catch block

            catch (ArithmeticException e) { System.out.println("Exception caught: Division by zero.");
            }
        }
    }




50.	How to throw exception in java Program
    public class TestThrow1{
        static void validate(int age){
            if(age<18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome to vote on Technolamror");
        }
        public static void main(String args[]){
            validate(13);
            System.out.println("rest of the code...");
        }
    }

51.	Advantage of Finally in Exception Handling java Program
    class Allocate {
        public static void main(String[] args) {

            try {
                long data[] = new long[1000000000];
            }
            catch (Exception e) { System.out.println(e);
            }

            finally {
                System.out.println("finally block will execute always.");
            }
        }
    }






52.	How to create Interface in java Program
    interface Info {
        static final String language = "Java";
        public void display();
    }

    class Simple implements Info {
        public static void main(String []args) { Simple obj = new Simple(); obj.display();
        }

// Defining method declared in interface

        public void display() { System.out.println(language + " is awesome");
        }
    }




53.	How to print date and time in java Program
    public class SQLDateExample {
        public static void main(String[] args) {
            long millis=System.currentTimeMillis(); java.sql.Date date=new java.sql.Date(millis); System.out.println(date);
        }
    }
/// Another Way
import java.util.*;

    class GetCurrentDateAndTime
    {
        public static void main(String args[])
        {
            int day, month, year;
            int second, minute, hour;
            GregorianCalendar date = new GregorianCalendar();

            day = date.get(Calendar.DAY_OF_MONTH); month = date.get(Calendar.MONTH);
            year = date.get(Calendar.YEAR);

            second = date.get(Calendar.SECOND); minute = date.get(Calendar.MINUTE); hour = date.get(Calendar.HOUR);

            System.out.println("Current date is "+day+"/"+(month+1)+"/"+year); System.out.println("Current time is "+hour+" : "+minute+" : "+second);
        }
    }



54.	How to SQL Date in java Program
import java.sql.Date;
    public class StringToSQLDateExample {
        public static void main(String[] args) { String str="2015-03-31";
            Date date=Date.valueOf(str);//converting string into sql date System.out.println(date);
        }
    }



55.	How to Date format in java Program
import java.text.ParseException; import java.text.SimpleDateFormat; import java.util.Date;
import java.util.Locale;
    public class SimpleDateFormatExample2 {
        public static void main(String[] args) { Date date = new Date();
            System.out.println("Date formate chnage by Technolamror "); SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); String strDate = formatter.format(date); System.out.println("Date Format with MM/dd/yyyy : "+strDate);

            formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss"); strDate = formatter.format(date);
            System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);

            formatter = new SimpleDateFormat("dd MMMM yyyy"); strDate = formatter.format(date);
            System.out.println("Date Format with dd MMMM yyyy : "+strDate);

            formatter = new SimpleDateFormat("dd MMMM yyyy zzzz"); strDate = formatter.format(date);
            System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);

            formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z"); strDate = formatter.format(date);
            System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
        }
    }

56.	How to Generate random number in java Program
import java.util.*;

    class RandomNumbers {
        public static void main(String[] args) {
            int c;
            Random t = new Random();

// random integers in [0, 100]

            for (c = 1; c <= 10; c++) { System.out.println(t.nextInt(100));
            }
        }
    }




57.	How perform garbage collection in java Program
import java.util.*;

    class GarbageCollection
    {
        public static void main(String s[]) throws Exception
        {
            Runtime rs = Runtime.getRuntime();
            System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
            rs.gc();
            System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());
        }
    }




58.	How to get own IP Address in java Program
import java.net.InetAddress;

    class IPAddress
    {
        public static void main(String args[]) throws Exception
        {
            System.out.println(InetAddress.getLocalHost());
        }
    }






59.	How to open notepad in java Program
import java.util.*;
import java.io.*;

    class Notepad {
        public static void main(String[] args) { Runtime rs = Runtime.getRuntime();

            try { rs.exec("notepad");
            }
            catch (IOException e) { System.out.println(e);
            }
        }
    }




60.	Leaner search Program in java
import java.util.Scanner;

    class LinearSearch
    {
        public static void main(String args[])
        {
            int c, n, search, array[];

            Scanner in = new Scanner(System.in); System.out.println("Enter number of elements"); n = in.nextInt();
            array = new int[n];

            System.out.println("Enter " + n + " integers");

            for (c = 0; c < n; c++) array[c] = in.nextInt();

            System.out.println("Enter value to find"); search = in.nextInt();

            for (c = 0; c < n; c++)
            {
                if (array[c] == search)	/* Searching element is present */
                {


                    ".");

                }

                System.out.println(search + " is present at location " + (c + 1) +

                break;

            }
            if (c == n) /* Searching element is absent */
                System.out.println(search + " is not present in array.");
        }
    }




61.	Binary search Program in java
import java.util.Scanner;

    class BinarySearch
    {
        public static void main(String args[])
        {
            int c, first, last, middle, n, search, array[];

            Scanner in = new Scanner(System.in); System.out.println("Enter number of elements"); n = in.nextInt();
            array = new int[n];

            System.out.println("Enter " + n + " integers");

            for (c = 0; c < n; c++) array[c] = in.nextInt();

            System.out.println("Enter value to find"); search = in.nextInt();

            first = 0; last	= n - 1;
            middle = (first + last)/2;

            while( first <= last )
            {
                if ( array[middle] < search ) first = middle + 1;
                else if ( array[middle] == search )
                {


                    ".");

                    System.out.println(search + " found at location " + (middle + 1) +

                    break;
                }

                else
                    last = middle - 1;

                middle = (first + last)/2;
            }
            if ( first > last )
                System.out.println(search + " is not present in the list.\n");
        }
    }






62.	Bubble sort Program in java
import java.util.Scanner;

    class BubbleSort {
        public static void main(String []args) {
            int n, c, d, swap;
            Scanner in = new Scanner(System.in);

            System.out.println("Input number of integers to sort"); n = in.nextInt();

            int array[] = new int[n]; System.out.println("Enter " + n + " integers");
            for (c = 0; c < n; c++)
                array[c] = in.nextInt();

            for (c = 0; c < ( n - 1 ); c++) {
                for (d = 0; d < n - c - 1; d++) {
                    if (array[d] > array[d+1]) /* For descending order use < */
                    {
                        swap	= array[d]; array[d]	= array[d+1]; array[d+1] = swap;
                    }
                }
            }

            System.out.println("Sorted list of numbers");

            for (c = 0; c < n; c++) System.out.println(array[c]);
        }
    }




63.	How to connect Database using java Program
import java.sql.*;
    class OracleCon{
        public static void main(String args[]){
            try{
//step1 load the driver class Class.forName("oracle.jdbc.driver.OracleDriver");
//step2 create the connection object

                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
//step3 create the statement object Statement stmt=con.createStatement();
//step4 execute query
                ResultSet rs=stmt.executeQuery("select * from emp");
                while(rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//step5 close the connection object con.close();
            }catch(Exception e){ System.out.println(e);}

        }
    }

64.	How to insert data in table using JDBC in java Program
import java.sql.*;
    class InsertPrepared{
        public static void main(String args[]){
            try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
                PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)"); stmt.setInt(1,101);//1 specifies the first parameter in the query stmt.setString(2,"Ratan");
                int i=stmt.executeUpdate(); System.out.println(i+" records inserted"); con.close();
            }catch(Exception e){ System.out.println(e);}

        }
    }



65.	How to insert image using JDBC in java Program
import java.sql.*;
import java.io.*;
    public class InsertImage {
        public static void main(String[] args) {
            try{ Class.forName("oracle.jdbc.driver.OracleDriver"); Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");

                ps.setString(1,"Technolamror");
                FileInputStream fin=new FileInputStream("d:\\g.jpg"); ps.setBinaryStream(2,fin,fin.available());
                int i=ps.executeUpdate(); System.out.println(i+" records affected"); con.close();
            }catch (Exception e) {e.printStackTrace();}
        }
    }

66.	How to execute Procedure in JDBC in java Program
import java.sql.*;
    public class Proc {
        public static void main(String[] args) throws Exception{ Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracl e");
            CallableStatement stmt=con.prepareCall("{call insertR(?,?)}"); stmt.setInt(1,1011);
            stmt.setString(2,"Amit"); stmt.execute(); System.out.println("success");
        }
    }

67.	How to check Regular expression in java Program
import java.util.regex.*;
    public class RegexExample1{
        public static void main(String args[]){
//1st way
            Pattern p = Pattern.compile(".s");//. represents single character Matcher m = p.matcher("as");
            boolean b = m.matches();
//2nd way
            boolean b2=Pattern.compile(".s").matcher("as").matches();
//3rd way
            boolean b3 = Pattern.matches(".s", "as"); System.out.println(b+" "+b2+" "+b3);
        }}

68.	How to create Multithreading program in java
    class Multi extends Thread{
        public void run(){ System.out.println("thread is running...");
        }


        public static void main(String args[]){ Multi t1=new Multi();
            t1.start();
        }
    }

69.	How to join thread in java program
    class TestJoinMethod1 extends Thread{
        public void run(){ for(int i=1;i<=5;i++){ try{
            Thread.sleep(500);
        }catch(Exception e){System.out.println(e);} System.out.println(i);
        }
        }
        public static void main(String args[]){ TestJoinMethod1 t1=new TestJoinMethod1(); TestJoinMethod1 t2=new TestJoinMethod1(); TestJoinMethod1 t3=new TestJoinMethod1(); t1.start();
            try{ t1.join();
            }catch(Exception e){System.out.println(e);}

            t2.start();
            t3.start();
        }
    }

70.	How to write data in text file using java program
import java.io.FileOutputStream;
    public class FileOutputStreamExample {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); fout.write(65);
                fout.close();
                System.out.println("success.. by Technolamror.");
            }catch(Exception e){System.out.println(e);}
        }
    }

71.	How to read data from text file using java program
import java.io.FileInputStream;
    public class DataStreamExample {


        public static void main(String args[]){
            try{
                FileInputStream fin=new FileInputStream("D:\\Technolamror.txt");
                int i=fin.read(); System.out.print((char)i);

                fin.close();
            }catch(Exception e){System.out.println(e);}
        }
    }

72.	How to get URL of site using java Programs
import java.io.*; import java.net.*; public class URLDemo{
        public static void main(String[] args){
            try{
                URL url=new URL("http://www.technolamror.com/java");

                System.out.println("Protocol: "+url.getProtocol()); System.out.println("Host Name: "+url.getHost()); System.out.println("Port Number: "+url.getPort()); System.out.println("File Name: "+url.getFile());

            }catch(Exception e){System.out.println(e);}
        }
    }

73.	How to get IP address from site URL using java program
import java.io.*; import java.net.*; public class InetDemo{
        public static void main(String[] args){
            try{
                InetAddress ip=InetAddress.getByName("www.Technolamror.com");

                System.out.println("Host Name: "+ip.getHostName()); System.out.println("IP Address: "+ip.getHostAddress());
            }catch(Exception e){System.out.println(e);}
        }
    }

74.	How to create AWT program in java
import java.awt.*;
    class First extends Frame{ First(){
        Button b=new Button("click me"); b.setBounds(30,100,80,30);// setting button position


        add(b);//adding button into frame setSize(300,300);//frame size 300 width and 300 height setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
    }
        public static void main(String args[]){ First f=new First();
        }}

75.	How to add lable in AWT program in java
import java.awt.*;
    class LabelExample{
        public static void main(String args[]){
            Frame f= new Frame("Label Example by Technolamror"); Label l1,l2;
            l1=new Label("First Label."); l1.setBounds(50,100, 100,30); l2=new Label("Second Label."); l2.setBounds(50,150, 100,30); f.add(l1); f.add(l2); f.setSize(400,400); f.setLayout(null); f.setVisible(true);
        }
    }

76.	How to add text area program in java
import java.awt.*;
    public class TextAreaExample
    {
        TextAreaExample(){ Frame f= new Frame();
            TextArea area=new TextArea("Welcome to Technolamror"); area.setBounds(10,30, 300,300);
            f.add(area); f.setSize(400,400); f.setLayout(null); f.setVisible(true);
        }
        public static void main(String args[])
        {
            new TextAreaExample();
        }
    }

77.	How to dropdown in AWT program in java
import java.awt.*;
    public class ChoiceExample
    {
        ChoiceExample(){


            Frame f= new Frame(); Choice c=new Choice(); c.setBounds(100,100, 75,75); c.add("Item 1 by Rajendra"); c.add("Item 2 by Lamror");
            c.add("Item 3 by Technolamror"); c.add("Item 4");
            c.add("Item 5"); f.add(c); f.setSize(400,400); f.setLayout(null); f.setVisible(true);
        }
        public static void main(String args[])
        {
            new ChoiceExample();
        }
    }

78.	How to create Swing program in java
import javax.swing.*;
    public class FirstSwingExample {
        public static void main(String[] args) {
            JFrame f=new JFrame();//creating instance of JFrame
            JButton b=new JButton("click");//creating instance of JButton b.setBounds(130,100,100, 40);//x axis, y axis, width, height f.add(b);//adding button in JFrame
            f.setSize(400,500);//400 width and 500 height f.setLayout(null);//using no layout managers f.setVisible(true);//making the frame visible
        }
    }

79.	How to add checkbox in Swing program in java
import javax.swing.*;
    public class CheckBoxExample
    {
        CheckBoxExample(){
            JFrame f= new JFrame("CheckBox Example by Technolamror"); JCheckBox checkBox1 = new JCheckBox("C++"); checkBox1.setBounds(100,100, 50,50);
            JCheckBox checkBox2 = new JCheckBox("Java", true); checkBox2.setBounds(100,150, 50,50); f.add(checkBox1);
            f.add(checkBox2); f.setSize(400,400); f.setLayout(null); f.setVisible(true);
        }
        public static void main(String args[])


        {
            new CheckBoxExample();
        }}

80.	How to convert string to integer in java program
    public class StringToIntExample{ public static void main(String args[]){ String s="200";
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100 because + is string concatenation operator System.out.println(i+100);//300 because + is binary plus operator
    }}

81.	How to convert integer to string in java program
    public class IntToStringExample1{ public static void main(String args[]){ int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator System.out.println(s+100);//200100 because + is string concatenation operator
    }}

82.	How to convert string to long in java
    public class StringToLongExample{ public static void main(String args[]){ String s="9990449935";
        long l=Long.parseLong(s); System.out.println(l);
    }}

83.	How to convert string to float in java
    public class StringToFloatExample{ public static void main(String args[]){ String s="23.6";
        float f=Float.parseFloat("23.6"); System.out.println(f);
    }}

84.	How to convert string to double in java program
    public class StringToDoubleExample{
        public static void main(String args[]){


            String s="23.6";
            double d=Double.parseDouble("23.6"); System.out.println(d);
        }}

85.	How to convert string to date  in java program
import java.text.SimpleDateFormat;
import java.util.Date;
    public class StringToDateExample1 {
        public static void main(String[] args)throws Exception { String sDate1="31/12/1998";
            String sDate2 = "31-Dec-1998"; String sDate3 = "12 31, 1998"; String sDate4 = "Thu, Dec 31 1998";
            String sDate5 = "Thu, Dec 31 1998 23:37:50"; String sDate6 = "31-Dec-1998 23:37:50";
            SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy"); SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy"); SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy"); SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss"); SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss"); Date date1=formatter1.parse(sDate1);
            Date date2=formatter2.parse(sDate2); Date date3=formatter3.parse(sDate3); Date date4=formatter4.parse(sDate4); Date date5=formatter5.parse(sDate5); Date date6=formatter6.parse(sDate6);
            System.out.println("String to Date converter by technolamror"); System.out.println(sDate1+"\t"+date1); System.out.println(sDate2+"\t"+date2); System.out.println(sDate3+"\t"+date3); System.out.println(sDate4+"\t"+date4); System.out.println(sDate5+"\t"+date5); System.out.println(sDate6+"\t"+date6);
        }
    }




86.	Create	ArrayList program in java
import java.util.*;
    class Arrylist_Technolamror{
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist list.add("Rajendra");//Adding object in arraylist list.add("Mahendra");
            list.add("Raja"); list.add("Technolamror");


//Traversing list through Iterator Iterator itr=list.iterator(); while(itr.hasNext()){ System.out.println(itr.next());
        }
    }
}

87.	How to create LinkedList program in java
        import java.util.*;
public class LinkedList_technolamror{
    public static void main(String args[]){ Linkedal<String> al=new Linkedal<String>();
        al.add("Rajendra");//Adding object in LinkedList al.add("Mahendra");
        al.add("Raja"); al.add("Technolamror");

        Iterator<String> itr=al.iterator(); while(itr.hasNext()){ System.out.println(itr.next());
        }
    }
}

88.	How to ArrayList using list interface program in java
import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id; this.name = name; this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ListIteratorExample {
    public static void main(String[] args) {
//Creating list of Books
        List<Book> list=new ArrayList<Book>();
//Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Java Program Questation","Rajendra","Technolamror",4); Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
//Adding Books to list


        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Original content of list is: ");
//Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        ListIterator<Book> itr=list.listIterator(); System.out.println("Modified content of list in backward is: "); while(itr.hasNext()){
            Book st=(Book)itr.next();
            System.out.println(st.quantity+" "+st.publisher+" "+st.author+" "+st.name+" "+st.id);
        }
    }
}

89.	How to create Hashset program in java
        import java.util.*;
class TestCollection9{
    public static void main(String args[]){
//Creating HashSet and adding elements HashSet<String> set=new HashSet<String>(); set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi"); set.add("Technolamror");
//Traversing elements Iterator<String> itr=set.iterator(); while(itr.hasNext()){ System.out.println(itr.next());
    }
}
}

        90.	How to create LinkedHashSet program in java
        import java.util.*;
class LinkedHashSet_Technolamror{
    public static void main(String args[]){ LinkedHashSet<String> al=new LinkedHashSet<String>();

        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi"); al.add("Technolamror");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            out	itr


        }
    }
}

91.	How to create TreeSet program in java
        import java.util.*;
class TreeSet_Technolamror{
    public static void main(String args[]){
//Creating and adding elements TreeSet<String> al=new TreeSet<String>(); al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi"); al.add("Technolamror"); ments Iterator<String> itr=al.iterator(); while(itr.hasNext()){ System.out.println(itr.next());
        }
    }
}

92.	How to create PriorityQueue program in java
        import java.util.*;
class PriorityQueue_Technolamror{
    public static void main(String args[]){ PriorityQueue<String> queue=new PriorityQueue<String>(); queue.add("Rajendra");
        queue.add("Mahendra"); queue.add("Raja"); queue.add("Technolamror"); queue.add("Rahul");
        System.out.println("head:"+queue.element()); System.out.println("head:"+queue.peek()); System.out.println("iterating the queue elements:"); Iterator itr=queue.iterator();
        while(itr.hasNext()){ System.out.println(itr.next());
        }
        queue.remove(); queue.poll();
        System.out.println("after removing two elements:"); Iterator<String> itr2=queue.iterator(); while(itr2.hasNext()){ System.out.println(itr2.next());
        }
    }
}

93.	How to create HashMap using map interface program in java
import java.util.*;
class MapInterfaceExample{
    public static void main(String args[]){ Map<Integer,String> map=new HashMap<Integer,String>(); map.put(100,"Rajendra");
        map.put(101,"Lamror"); map.put(102,"Technolamror"); for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

94.	How to create LinkedHashMap program in java
        import java.util.*;
class LinkedHashMap_Technolmaror{
    public static void main(String args[]){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>(); hm.put(100,"Rajendra");
        hm.put(101,"Vijay");
        hm.put(102,"Technolamror");

        for(Map.Entry m:hm.entrySet()){ System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

95.	How to create TreeMap program in java
        import java.util.*;
class TreeMap_Technolamror{
    public static void main(String args[]){ TreeMap<Integer,String> hm=new TreeMap<Integer,String>(); hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay"); hm.put(103,"Technolamror"); for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

96.	How to create Hashtable program in java
        import java.util.*;
class Hashtable_Technolamror{
    public static void main(String args[]){ Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Rajendra");
        hm.put(102,"Praveen");
        hm.put(101,"Bipin");
        hm.put(103,"Pankaj");

        for(Map.Entry m:hm.entrySet()){ System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

97.	How to create Array program in java
class Array_Technolamror{
    public static void main(String args[]){

        int a[]=new int[5];//declaration and instantiation a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;

//printing array
        for(int i=0;i<a.length;i++)//length is the property of array System.out.println(a[i]);

    }}

98.	How to create Multidimensional array program in java
class Multi_Array{
    public static void main(String args[]){

//declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

//printing 2D array for(int i=0;i<3;i++){ for(int j=0;j<3;j++){
        System.out.print(arr[i][j]+" ");
    }
System.out.println();
}


}}

        99.	How to create Find Factorial No using Recursion Program in java

public class Recursion_Technolamror {
    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) { System.out.println("Factorial of 5 is: "+factorial(5));
    }
}

100.	How to create Method Overriding program in java
class Bank{
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

class Test2{
    public static void main(String args[]){ SBI s=new SBI();
        ICICI i=new ICICI(); AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    } }






    }
}
