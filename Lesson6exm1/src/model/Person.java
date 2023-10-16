package model;

public class Person {
    private String name;
    private int age;

    public Person() {
        this(" ",-1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("Person -имя: " + name + ", возраст: " + age);
    }

    //для метода final означает, что такой метод невозможно переопределить
    public final void greeting(){
        System.out.println("Hi");
    }

    public static void method(){
        System.out.println("static method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}