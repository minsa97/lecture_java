package exam;

public class Exam03 {
    public static void main(String[] args) {
        String a="This is my favorite food";
        wordlist(a);
    }

    public static void wordlist(String str){
        int left=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.println(str.substring(left,i));
                left=i+1;
            }
        }
        System.out.println(str.substring(left));
    }
}