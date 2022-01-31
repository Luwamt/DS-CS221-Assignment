package assignment11;


import java.util.HashMap;

public class FrequencyCount {

    public static void frequencyCount(String word){
        HashMap<String, Integer>  hm= new HashMap<>();
        String[] input= word.split(" ");

        for (int i = 0; i < word.length(); i++) {
            Integer key= hm.get(word);
            if(key==null)
                hm.put(word,1);
            else hm.put(word,key+1);
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        String para= "I love Miu to learn meditation ";
        frequencyCount(para);
        String para2 = "The weather in Miu to cold in" +
                " winter to hot in summer ";
        frequencyCount(para2);
    }

}
