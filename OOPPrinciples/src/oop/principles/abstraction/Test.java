package oop.principles.abstraction;

public class Test {
    public static void main(String[] args) {
        Animal myCat = new Cat(); //Tạo đối tượng
        Animal myDog = new Dog();

        myCat.makeSound();// không cần biết nội dung phương thức hoạt động ra sao
        myDog.makeSound();
    }
}
