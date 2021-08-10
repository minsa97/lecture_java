package q1;

public class Func04 {
    public static void main(String[] args) {
        // 1부터 100까지 소수를 출력하시오.
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    public static Boolean checkPrime(int x){
        int cnt=0;
        for(int i=1;i<=x;i++){
            if(x%i==0)
                cnt++;
        }
        if(cnt==2)
            return true;
        else
            return false;
    }
}
