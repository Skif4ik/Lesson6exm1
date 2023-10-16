import model.Person;
import model.Student;

public class Main2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Vasya", 20),
                new Person("Grisha",25)
        };

        //при помощи foreach можно изменять объекты класса, например при помощи сеттеров
        for (Person person : people) {
            //person.setName("hdsc")
            person.info();
        }

        System.out.println("================================");

        Student[] students = {
                new Student("Misha", 18 , "GSTU",1),
                new Student("Masha", 22, "GGTU",5)
    };
        for (Student student : students) {
            student.info();

        }
    }
}
