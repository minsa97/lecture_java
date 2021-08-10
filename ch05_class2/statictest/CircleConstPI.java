package statictest;

class Circle {
    static final double PI = 3.1415;
    private double radius;
	
    Circle(double rad) { 
        radius = rad; 
    }

    void showPerimeter() {
        double peri = (radius * 2) * PI;
        System.out.println("둘레: " + peri);
    }
    
    void showArea() {
        double area = (radius * radius) * PI;
        System.out.println("넓이: " + area);
    }
}

class CircleConstPI {
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        c.showPerimeter();
        c.showArea();
    }
}