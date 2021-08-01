package a4;

class Circle {
    int radius;
    String name;

    public Circle(){

    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleExam{
    public static void main(String[] args) {
        Circle pizza;
        pizza=new Circle();
        pizza.radius=10;
        pizza.name="아이스 피자";
        double area=pizza.getArea();
        System.out.println(pizza.name +"의 면적은 "+area+ " 이다.");

        Circle donut=new Circle();
        donut.radius=2;
        donut.name="설탕 도넛";
        area=donut.getArea();
        System.out.println(donut.name +"의 면적은 "+area+ " 이다.");
    }    
}