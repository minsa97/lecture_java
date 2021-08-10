package exam;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Score>> ");
        int a=sc.nextInt();
        System.out.println(grade(a));
    }

    public static char grade(int score){
        if(score>=90) return 'A';
        else if(score>=80) return 'B';
        else if(score>=70) return 'C';
        else if(score>=60) return 'D';
        else return 'F';
    }
}
