package a2;

public class Dog {
    public void welcom(a1.Cat c) {
        c.makeSound();     // 호출 가능! 컴파일 성공!
        c.makeHappy();     // 호출 불가! 컴파일 오류! 
    }
}