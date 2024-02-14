package homeworks.homework_19.Project.Variant_2;

import scanner.UserInput;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {

    UserInput userInput = new UserInput();
    public Student[] createStudentsArrayFromUserInput(){
        int countOfStudents = userInput.inputInteger("Введите количество студентов в группе: ");
        Student[] students = new Student[countOfStudents];
        return students;
    }
    public Student[] fillStudentsArrayFromUserInput(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите даннык о новом студенте: ");
            String firstName = userInput.inputText("Введите имя студента: ");
            String lastName = userInput.inputText("Введите фамилию студента: ");
            int age = userInput.inputInteger("Введите возраст студента: ");
            students[i] = new Student(firstName,lastName,age);
        }
        return students;
    }

    public void printArray(Student[] students) {
        System.out.println("Студенты: ");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("Имя студента: " + student.getFirstName() );
            System.out.println("Фамилия студента: " + student.getLastName());
            System.out.println("Возраст: " + student.getAge());
        }
    }

    public Student[] sortStudents(Student[] students){
        Arrays.sort(students, Comparator.comparing(Student::getLastName));    //сортирует массив объектов students типа Student
        return students;                                                      //по фамилии каждого студента, используя метод getLastName().
    }

    public Student[] sortStudentsCompareTo(Student[] students) {

        //Создается копия исходного массива, это делается для того, чтобы изменения не затронули исходный массив.
        Student[] sorted = students.clone();

        //Внешний цикл управляет текущим элементом, с которым сравниваются остальные элементы
        for (int i = 0; i < sorted.length - 1; i++) {

            // а внутренний цикл управляет элементами, с которыми сравнивается текущий элемент.
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                //Это сравнение происходит с использованием метода compareTo, который сравнивает строки лексикографически.
                if (students[j].getLastName().compareTo(students[j].getLastName()) > 0) {
                    Student temp = sorted[j];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;                                        //После завершения внутреннего цикла элемент с наибольшей фамилией перемещается в конец массива reversed.
                }
            }
        }
        return sorted;
    }

}
