package oop.principles.inheritance;

// Lớp chứa phương thức main() để chạy chương trình
public class Test {
    public static void main(String[] args) {
        // Tạo một đối tượng Cat với tên Fluffy và tuổi 2
        Cat cat = new Cat("Fluffy", 2);
        // Gọi các phương thức của đối tượng Cat
        cat.eat();//Cat có thể sử dụng phương thức eat() của Animal do Cat có sự kế thừa từ Animal
        cat.sleep();//Cat có thể sử dụng phương thức sleep() của Animal do Cat có sự kế thừa từ Animal
        cat.makeSound();//Cat có thể sử dụng phương thức bark() của chính nó
    }
}