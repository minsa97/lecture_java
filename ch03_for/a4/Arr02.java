package a4;
import java.util.Scanner;
public class Arr02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("정수 5개를 입력하시오.");
        int[] a=new int[5];
        
        for(int i=0;i<a.length;i++){
            System.out.print("정수: ");
            a[i]=sc.nextInt();
        }

        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("최대값: "+max);
    }
    
}
