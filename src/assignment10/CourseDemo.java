package assignment10;

import java.util.*;

public class CourseDemo {


    public  static Map<String, Course>listCourse(List<Course> courses){
        Map <String, Course> map = new HashMap<>();
        /*for (int i = 0; i < course.size(); i++) {
            map.put(course.get(i).getcID(),course.get(i));*/
        for (Course c : courses) {
            map.put(c.getcID(), c);
        }
        return map;
    }
    public static void main(String[] args) {
        List<Course> list = new ArrayList<>();
        Course course1 = new Course("CS221", "DS", 4);
        Course course2 = new Course("CS201", "PP", 3);
        Course course3 = new Course("CS105", "PS", 2);

        list.add(course1);
        list.add(course2);
        list.add(course3);


        //System.out.println(listCourse(list) );
        Map hp = listCourse(list);
       for (Object an : hp.entrySet()) {
            System.out.println(an);
        }
    }

}
