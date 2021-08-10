package exam;

public class Exam04 {
    public static void main(String[] args) {
        int a=72451;
        Reverse(a);
    }

    public static void Reverse(int x){
        while(x>0){
            System.out.print(x%10);
            x=x/10;
        }
    }
}