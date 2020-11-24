package lesson5;

class Employee {
    String name;
    String email;
    String phone;
    int salary;
    int age;

     Employee(String name, String email, String phone, int salary, int age) {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    void showInfo(){
        System.out.println("Сотрудник "+name);
        System.out.println("Телефон "+phone);
        System.out.println("Электронный адрес "+email);
        System.out.println("Зарплатушка "+salary);
        System.out.println("Возраст "+age);
        System.out.println();
    }
}
