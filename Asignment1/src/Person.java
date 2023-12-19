package Asignment1;

public class Person {
    private String fullName;
    public int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        setValues(fullName, age);
    }

    public void setValues(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move() {
        System.out.println(this.fullName + " is moving.");
    }
    public void talk() {
        System.out.println(this.fullName + " is talking.");
    }
}
