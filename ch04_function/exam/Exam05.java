package exam;

public class Exam05 {
    public static void main(String[] args) {
        int a=152627389;
        System.out.println(checkNumbers(a));
    }

    public static boolean checkNumbers(int a){
        int[] arr=new int[10];
        while(a>0){
            int x=a%10;
            arr[x]++;
            a=a/10;
        }

        for(int i=0;i<10;i++){
            if(arr[i]!=1){
                return false;
            }
        }

        return true;
    }

}