package oop.principles.abstraction;

//Lớp con kế thừa từ lớp cha là Animal
public class Dog extends Animal {
    //Phương thức makeSound() để phát ra tiếng kêu của chó kế thừa từ lớp cha được lớp con override lại
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}