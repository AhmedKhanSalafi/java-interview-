package newcodingprogram;

public class VowelConsonanatCount {

    public static void main(String[] args) {

        String str= "ahmedkhan";

        countVowel(str);
    }

    private static void countVowel(String str) {
        int vowelcount = 0;
        int consonanatcount = 0;

        for (int i=0;i<str.length();i++){
            if (isVowel(str.charAt(i))){
                ++vowelcount;
            }else {
                ++consonanatcount;
            }
        }
        System.out.println("vowel count"+ vowelcount);
        System.out.println("consonant count"+consonanatcount);
    }


    private static boolean isVowel(char ch) {
ch=Character.toUpperCase(ch);

return (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U');

    }}
