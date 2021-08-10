package a2;
import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Alphabet: ");
        char x=sc.next().charAt(0);
        int n=(int)x-(int)'a'+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                char y=(char)(j+(int)'a'-1);
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
