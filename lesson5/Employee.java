package lesson5;

public class Employee {
    String name;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String email, String phone, int salary, int age) {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    public void showInfo(){
        System.out.println("Сотрудник "+name);
        System.out.println("Телефон "+phone);
        System.out.println("Электронный адрес "+email);
        System.out.println("Зарплатушка "+salary);
        System.out.println("Возраст "+age);
        System.out.println();
    }
}
