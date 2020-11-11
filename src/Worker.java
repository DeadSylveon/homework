public class Worker {
    private String name;
    private String position;
    private int phoneNumber;
    private int salary;
    private int age;
    private int personalIndexNumber; // личный уникальный идентификационный порядковый номер
    private static int indexNumber = 1;

    public Worker(String name, String position, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.personalIndexNumber = indexNumber++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPersonalIndexNumber() {
        return personalIndexNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Сотрудник " + getName() + "(" + getPersonalIndexNumber() + ")" + ", должность - " + getPosition() + ", номер телефона: " + getPhoneNumber() + ", зарплата - " + getSalary() +
                ", возраст - " + getAge() + " лет.";
    }
}
