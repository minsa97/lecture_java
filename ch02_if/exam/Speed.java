package exam;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("자동차 속도: ");
        int speed=sc.nextInt();
        if(speed>=120){
            System.out.println("벌금 12만원");
        }
        else if(speed<=60){
            System.out.println("벌금 3만원");
        }
        else{
            System.out.println("상금 7만원");
        }
        sc.close();
    }
}
