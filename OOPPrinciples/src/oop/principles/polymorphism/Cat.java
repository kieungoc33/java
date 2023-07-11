package oop.principles.polymorphism;

public class Cat extends Animal{
    //Lớp con kế thừa các phương thức từ lớp cha và có thể viết đè lên chúng
    @Override
    public void makeSound() {
        //Sử dụng từ khóa super có thể gọi các phương thức từ lớp cha
        super.makeSound();
    }
}