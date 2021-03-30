//Mark Ewert
//date

public class Question_2{
    public static void main(String[] args){
        triangle(3);
        reverseTriangle(3);
    }

    public static void triangle(int n){
        if (n > 0){
          printStars(n);
          triangle(n-1);
        }
    }

    public static void reverseTriangle(int n){
        if (n > 1) reverseTriangle(n-1);
        
        printStars(n);
    }

    private static void printStars(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
