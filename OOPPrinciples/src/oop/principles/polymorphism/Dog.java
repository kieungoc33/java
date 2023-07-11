package oop.principles.polymorphism;

//Lớp Dog kế thừa lớp cha là Car khi sử dụng extends
public class Dog extends Animal {
    public void makeSound () {
        System.out.println("Woof");
    }

}
