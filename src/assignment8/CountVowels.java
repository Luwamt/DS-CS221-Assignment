package assignment8;

public class CountVowels {

    public static int countVowels(String word) {
        // final  String VOWEL ="[aeiou]";
        if (word.equals("")) {
            return 0;
        } else {
            //char num = word.charAt(0);
            int count = countVowels(word.substring(1));
            if (isVowel(word.charAt(0)) == true) {
                return 1+ count;
            } else
                return count;
        }
    }
    public static boolean isVowel(char ch){
        if (ch=='a' ||
                ch=='e' ||
                ch=='i' ||
                ch=='o' ||
                ch=='u')
        {
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Lowaaai"));
    }
}