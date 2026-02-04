package reto1;
import java.util.*;
public class reto1 {
    
    public static class Student{
        private String name;
        private String age;
        private String semester;
        private String mail;

        public Student(String name, int age, int semester, String mail){
            this.name = name;
            this.age = String.valueOf(age);
            this.semester = String.valueOf(semester);
            this.mail = mail;
        }
    }

    public static class WelcomeMessage{

        private static void printWelcomeMessage(List<Student> students){

            String message = students.stream()
                            .map(e -> e.name + ", estudiante de la escuela de " +
                            e.semester + " semestre de " + e.age + " años")
                            .reduce("", (a, b) -> a.isEmpty() ? b : a + " y " + b);

            String mails = students.stream()
                            .map(e -> e.mail)
                            .reduce("", (a, b) -> a.isEmpty() ? b : a + " y " + b);

            System.out.println("Hola, bienvenidos, nosotros somos la pareja formada por: " + message + ". Nuestros correos institucionales son "
                            + mails + ".");

        }
        
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                        new Student("Roger Duran", 21, 8, "roger.duran-g@mail.escuelaing.edu.co"),
                        new Student("Camilo Alfonso leon", 23, 8, "camilo.leon-a@mail.escuelaing.edu.co"));

        WelcomeMessage.printWelcomeMessage(students);
    }
}
