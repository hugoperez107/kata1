package software.ulpgc.katas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Hugo Pérez", LocalDate.of(2006, 6, 26));
        System.out.println(person.toString());
    }
}
