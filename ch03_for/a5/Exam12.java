package a5;

public class Exam12 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println("output>> "+sum);
    }
}
