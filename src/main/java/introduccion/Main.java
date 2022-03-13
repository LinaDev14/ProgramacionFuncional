package introduccion;

import java.util.List;

import static introduccion.Main.Gender.FEMALE;
import static introduccion.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        // programación imperativa -> es decir, como una secuencia de operaciones a realizar.
        // programación declarativa -> es decir, se especifica el resultado deseado, no cómo lograrlo.

        // forma declarativa
        List<Student> students = List.of(
            new Student("Lina", "Guerrero", 23, FEMALE),
            new Student("Mateo", "Vlad", 25, MALE),
            new Student("Santiago", "Vlad", 30, MALE),
            new Student("Camila", "Savaraín", 24, FEMALE),
            new Student("Juan Pablo", "0'Brien", 27, MALE),
            new Student("Pablo", "Saavedra", 23, MALE)
        );

        // forma imperativa
        for (Student student: students){
            // se deja a la izquierda el valor fijo, no el variable
            if(MALE.equals(student.gender)){
                System.out.println(student);
            }
        }
    }


    static class Student{
        private final String name;
        private final String lastName;
        private final int age;
        private final Gender gender;

        // Se crea un constructor
        public Student(String name, String lastName, int age, Gender gender) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
        }

        // sobre escribir el metodo a string
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        FEMALE,
        MALE
    }
}