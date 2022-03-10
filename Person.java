import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Date;

public class Person {

    private String secondName;
    private String firstName;
    private String patronymic;
    private String age;


    public Person(String secondName, String firstName, String patronymic, String age) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public void printFirstName() {
        System.out.println("Имя: " + firstName);
    }

    public void printAge() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int i = Integer.parseInt(age.trim());;
        System.out.println(year - i);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

