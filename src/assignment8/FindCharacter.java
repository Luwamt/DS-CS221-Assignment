package assignment8;

public class FindCharacter {

    public  static boolean findChar(String str , char c){
            if (str == null || str.isEmpty()) {
                return false;
            }
            else if (str.charAt(0) == c){
                return true;
            }
            else
              return    findChar(str.substring(1),c);
    }

    public static void main(String[] args) {

       boolean ans= findChar("luwam" ,'l');
        System.out.println(ans);
    }
   /* private static boolean check(String str) {
        char target = 'a';
        if(str==null||str.equalsIgnoreCase(""))
            return false;
        else if(target==str.charAt(0))
            return true;
        else
            return check(str.substring(1));
    }*/
}
