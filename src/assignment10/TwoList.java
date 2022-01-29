package assignment10;

import java.util.*;

public class TwoList {
    public  static Map<String,Integer>listInOne(List<String> names, List<Integer> num){
        if(names.size()!= num.size()) throw new IllegalArgumentException();
        Map <String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < names.size(); i++) {
           map.put(names.get(i),num.get(i));
        }
        return map;
    }
    public static void main(String[] args) {

        List< String> name = new ArrayList<>();
        List< Integer> nums = new ArrayList<>();
        name.add("Dean ==");
        name.add("Dave ==");
        name.add("Zaineh ==");
        /*name.add("Yasmeen");
        name.add("Yasmeen");
        name.add("Dave");*/
        nums.add(90);
        nums.add(80);
        nums.add(94);
       System.out.println(listInOne(name, nums));
        /*for (Object res : listInOne(name,nums).entrySet()) {
            System.out.println(res );
        }*/
    }
}
