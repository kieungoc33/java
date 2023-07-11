package oop.principles.encapsulation;

public class Person {
    // Biến name thể hiện tên người được đặt là private để các lớp bên ngoài không thể tùy ý truy cập mà phải thông qua hàm getter và setter
    private String name;

    //Hàm getter cho phép lấy giá trị của biến name
    public String getName() {
        return name;
    }

    //Hàm setter cho phép đặt giá trị mới cho biến name
    public void setName(String name) {
        this.name = name;
    }
}

