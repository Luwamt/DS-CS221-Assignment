package assignment8;

public class FindCharacter {

    public  static void findChar(String str , char c){
       // public static boolean searchString(String str, char target) {

            if (str == null || str.isEmpty())

                return;

            if (str.charAt(0) == c)
                 findChar(str.substring(1),c);
    }

    public static void main(String[] args) {
        findChar("luwam" ,'l');
    }
}
