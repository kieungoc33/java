package oop.principles.encapsulation;

public class Test {

    public static void main(String[] args) {
        // Lớp Player được đóng gói bởi nó có chứa dữ liệu private và để có thể truy cập phải dùng tới hàm getter và setter
        Person person = new Person();   //Tạo instance của lớp đóng gói
        person.setName("Kieu quoc ngoc");    //Đặt giá trị cho biến name trong lớp đóng gói bằng hàm setter
        System.out.println(person.getName());   //Lấy giá trị của biến name trong lớp đóng gói bằng hàm getter
    }


}
