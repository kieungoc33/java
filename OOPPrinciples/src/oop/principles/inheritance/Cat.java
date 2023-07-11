package oop.principles.inheritance;

// Lớp con Cat kế thừa từ lớp cha Animal bằng việc sử dụng extend
public class Cat extends Animal {
    // Constructor của lớp Cat
    public Cat(String name, int age) {
        // Gọi constructor của lớp cha Animal
        super(name, age);
    }
    public void makeSound() {
        System.out.println("Meow");
    }
}