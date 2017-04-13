package map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExam {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();

        map.put("1", "kim-m");
        map.put("2", "lee-m");
        map.put("3", "park-m");

        System.out.println(map.get("1"));


        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");

        System.out.println(list.get(1));

        list.add(2,"choi");
        System.out.println(list.get(2));
        System.out.println(list.get(3));


    }
}