import model.Person;
import model.Student;

public class Main4 {
    public static void main(String[] args) {
        Person[] people ={
                new Person("Vasya",25),
                new Student("Grisha", 45 , "GSTU",2),
                new Person("Misha", 21),
                new Student("Sasha", 23, "GGTU", 5)
        };

        for (Person person : people) {
            person.info();
        }

        //people[0]. через такие ссылки будут видны методы только класса Person
    }
}
