//Mark Ewert
//date

public class Question_4{
   public static boolean isPalindrome(String word){
     int len = word.length();
     
     if (len <= 1) return true;
     
     if (word.charAt(0) == word.charAt(len-1)) return isPalindrome(word.substring(1, len-1));
     else return false;
   }
}
