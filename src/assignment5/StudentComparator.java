package assignment5;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if ((o1.getSname().compareTo(o2.getSname())== 0)) {
            if(o1.getSid() - o2.getSid()==0){
                return o1.getScore()-(o2.getScore());
            }
            return o1.getSid() - o2.getSid();

        }
   /*     else if((o1.getSname().compareTo(o2.getSname())== 0) && o1.getSid() - o2.getSid()==0 ){
            return o1.getScore()-(o2.getScore());
        }*/
        else
        return o1.getSname().compareTo(o2.getSname());
    }
}

