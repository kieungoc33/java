package oop.principles.inheritance;

// Lớp cha Animal
public class Animal {
    private String name; // Tên động vật
    private int age; // Tuổi động vật

    // Constructor của lớp Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức ăn của động vật
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Phương thức ngủ của động vật
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

}