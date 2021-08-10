package a1;

import java.util.Scanner;
public class While06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println("james"+i);
            i++;
        }
        
    }
}
