//Mark Ewert
//date

public class Question_3{
   public static String reverse(String word){
       int len = word.length();
       
       if (len == 0) return "";
       
       return word.substring(len-1, len) + reverse(word.substring(0, len-1));
    }
}
