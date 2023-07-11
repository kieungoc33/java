package oop.principles.polymorphism;

public class Test {
    public static void main(String[]args) {
        Animal dog = new Dog();//Có thể tạo đối tượng Dog bằng Animal bởi có kế thừa từ lớp cha Animal
        Animal cat = new Cat();//Có thể tạo đối tượng Cat bằng Animal bơi có kế thừa từ lớp cha Animal
        dog.makeSound();
        cat.makeSound();
        //phương thức makeSound() có sự khác nhau
    }

}