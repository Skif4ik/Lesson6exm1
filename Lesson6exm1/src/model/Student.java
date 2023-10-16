package model;

//класс Student наследует у класса Person
//Person - суперкласс
//Student - подкласс
//каждый объект класса Student будет состоять из 4 полей
//каждый объект подкласс состоитиз совокупности его полей и полей его суперкласса
public class Student extends Person {
    private String university;
    private int course;

    //none 17 GSTU 1
    public Student() {
        //можно вызвать либо только super() либо только this()
        this("none", 17, "GSTU", 1);
        //super(); если не осуществить вызов конструктора суперкласса самостоятельно,
        //то автоматически при создании объекта Student будет
        //вызван конструктор по умолчанию суперкласса
    }

    public Student(String name, int age, String university, int course) {
        super(name, age);//вызов конструктора суперкласса
        //конструкция super для вызова конструктора суперкласса может быть
        // описана только на первой позиции конструктора
        this.university = university;
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //переопределение метода - создание в подклассе метода с таким же именем,
    // типом и списком параметров как у метода суперкласса. Переопределение метода
    // для этого класса перекрывает метод суперкласса

    @Override//аннотация сообщающая о том что этот метод переопределяет метод суперкласса
    public void info() {
        //можно вызвать версию которую переопределили
        //super.info();//способ вызвать версию метода базового класса
        System.out.println("Student - имя: " + getName() +
                ", возраст: " + getAge() +
                ", универ: " + university +
                ", курс: " + course);
    }

    /*@Override
    public void greeting() {
        System.out.println("Hi student");
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", university='" + university + '\'' +
                ", course=" + course +
                '}';
    }
}
