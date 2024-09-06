package collection;

public class ReverseWord {

    public static void main (String[] args) {

        String str= "Geeks", nstr="";
        //char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        int lenth=str.length();

        for (int i=lenth-1; i>=0; i--)
        {
          //  ch= str.charAt(i); //extracts each character
           // nstr= ch+nstr; //adds each character in front of the existing string

            nstr=nstr+str.charAt(i);
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

