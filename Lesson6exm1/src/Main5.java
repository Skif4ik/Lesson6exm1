import model.Person;
import model.Student;

public class Main5  {
    public static void main(String[] args) {
        Object[] objects = {
                new Person(),
                new Student(),
                "Строка",
                4//new Integer(4)
        };
        for (Object object : objects) {
            System.out.println(object.toString());
        }
    }
}
