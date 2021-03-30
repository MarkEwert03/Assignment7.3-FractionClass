//Mark Ewert
//Mar 9, 2020

public class Question_1{

    public static int GCF(int a, int b){
        if (a == b) return a;
        
        if (a > b) return GCF(a-b, b);
        else return GCF(a, b-a);
    }
}
