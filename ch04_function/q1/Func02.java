package q1;

public class Func02{
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            gugudan(2);
        }    
    }

    public static void gugudan(int a){
        for(int i=1;i<=9;i++)
            System.out.print(a+"*"+i+"="+(a*i)+"\t");
        
        System.out.println();
    }
}
