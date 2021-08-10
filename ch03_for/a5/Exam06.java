package a5;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("시간, 나이: ");
        int time=sc.nextInt();
        int age=sc.nextInt();

        int price=0;
        if(time<17){
            if(age>=13 && age<=64){ // 대인
                price=34000;
            }
            else{
                price=25000;
            }
        }
        else{
            price=10000;
        }
        System.out.println("요금은 "+price+"원 입니다.");

    }
}