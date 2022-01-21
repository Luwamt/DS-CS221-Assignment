package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTester {
    public static void main(String[] args) {

        Student std1 = new Student(111, "Tsegai", 4526);
        Student std2 = new Student(112, "Mercy", 2366);
        Student std8 = new Student(112, "Mercy", 2366);
        Student std3 = new Student(113, "Arkan", 89626);
        Student std4 = new Student(114, "Fili", 49202);
        Student std5 = new Student(115, "Abel", 1356);
        Student std6 = new Student(116, "John", 9526);
        Student std7 = new Student(118, "assegai", 4526);
        Student std9 = new Student(118, "absegai", 455);
        Student std10 = new Student(118, "Tsegai", 605);


        ArrayList<Student> students = new ArrayList<>();

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        students.add(std6);
        students.add(std7);
        students.add(std8);
        students.add(std9);
        students.add(std10);

                System.out.println(std8.equals(std2));
                System.out.println(std1.equals(std7));

                System.out.println("~~~~~~~~~~~~~~Compare two students by name and id  and sCORE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Collections.sort(students, new StudentComparator());
                for (Student std : students) {
                    System.out.println(std);
                }
                System.out.println("~~~~~~~~~~~~~Compare by score point~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Collections.sort(students);
                for (Student std : students) {
                    System.out.println(std);
                }
        Iterator it = students.iterator();
        while (it.hasNext()) {
            Student item = (Student) it.next();
            if (item.equals(std6)) {
                it.remove();
            }
        }
        System.out.println(students);
    }
}
