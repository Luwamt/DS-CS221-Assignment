package assignment5;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (!(o1.getSname().equalsIgnoreCase(o2.getSname())))
            return   o1.getSname().compareToIgnoreCase(o2.getSname());
        else
        return o1.getSid() - o2.getSid();
    }
}

