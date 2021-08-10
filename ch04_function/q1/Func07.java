package q1;

import java.util.Scanner;

public class Func07 {
    public static void main(String[] args) {
        // 숫자를 입력
        // checkEven()
        //    - 짝수 입력되면 Even 출력
        //    - 홀수 입력되며 Odd 출력
        //    - 리턴값이 없는 함수이다.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int n=sc.nextInt();
        checkEven(n);
    }

    public static void checkEven(int x){
        if(x%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
