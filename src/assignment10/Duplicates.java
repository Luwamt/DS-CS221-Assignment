package assignment10;

import java.util.*;

public class Duplicates {

    public static Set<String> duplicates(List<String> name){
        Set<String>set = new TreeSet<>();
        set.addAll(name);
//        for (String an: name) {
//            set.add(an);
//        }

        return set;
    }

    public static void main(String[] args) {

        List< String> name = new ArrayList<>();
        name.add("Dean");
        name.add("Dave");
        name.add("Zaineh");
        name.add("Yasmeen");
        name.add("Yasmeen");
        name.add("Dave");

        System.out.println(duplicates(name));
    }
}
