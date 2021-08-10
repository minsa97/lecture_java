package a2;

public class While07 {
    public static void main(String[] args) {
        int i=1, sum=0;
        while(i<=10){
            if(i%2==0){
                System.out.print(i+" ");
                sum=sum+i;
            }
            i++;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}
