package a2;

public class For03 {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=1;i<=100;i++){
            if(i%3==0){
                sum=sum+i;
            }
        }
        System.out.println("sum="+sum);
    }
}
