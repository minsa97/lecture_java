package a5;

public class Exam10 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%3==0){
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println("sum: "+sum);
    }
}
