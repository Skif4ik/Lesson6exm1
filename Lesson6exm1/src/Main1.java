import model.Person;
import model.Student;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.info();

        Student student1 = new Student();
        student1.info();
        Student student2 = new Student("Vasya", 19, "GGTU",3);
        student2.info();

        person1.greeting();
        student1.greeting();
    }
}
