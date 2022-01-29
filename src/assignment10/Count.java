package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Count {

    public  static int count(List<String> name){
        Set<String> set = new TreeSet<>();
        set.addAll(name);
      return  set.size();
    }

    public static void main(String[] args) {

        List< String> name = new ArrayList<>();
        name.add("Dean");
        name.add("Dave");
        name.add("Zaineh");
        name.add("Yasmeen");
        name.add("Yasmeen");
        name.add("Dave");

        System.out.println(count(name));
    }
}
