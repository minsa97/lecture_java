package a3;

public class For14 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                System.out.print(i+" ");
            }
        }
    }
}
