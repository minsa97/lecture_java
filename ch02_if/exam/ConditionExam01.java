package exam;

import java.util.Scanner;

public class ConditionExam01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("원화를 입력: ");
        double won=sc.nextDouble();
        double dollar=won/1100.;
        System.out.println("달러: "+dollar+" $");
        sc.close();
    }
}
