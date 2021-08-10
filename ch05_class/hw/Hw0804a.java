package hw;

class Student{
    String name;
    int ban, no, kor, eng, math;

    public int getTotal(){
        return kor+eng+math;
    }
    public double getAverage(){
        return getTotal()/3.;
    }
}

public class Hw0804a {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Hong gil dong";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("name: "+s.name);
        System.out.println("sum: "+s.getTotal());
        System.out.printf("avg: %.2f\n",s.getAverage());

    }
}
