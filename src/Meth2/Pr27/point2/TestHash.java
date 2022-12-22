package Meth2.Pr27.point2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class NameHash {
    Map<String, ArrayList<String>> map;

    NameHash(){
        map = new HashMap<String, ArrayList<String>>();
    }

    public void addValues(String key, String value) {
        ArrayList tempList = null;
        if (map.containsKey(key)) {
            tempList = map.get(key);
            if(tempList == null)
                tempList = new ArrayList();
            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }
        map.put(key,tempList);
    }

    public HashMap<String, ArrayList<String>> createMap(){
        return (HashMap<String, ArrayList<String>>) map;
    }

    public int getSameFirstNameCount(){
        int count = 0;
        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            if (item.getValue().size() > 1) count++;
        }
        return count;
    }

    public int getSameLastNameCount(){
        Map<String, Integer> tmp = new HashMap<>();

        for(Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            for (String name : item.getValue()) {
                if (tmp.containsKey(name)) tmp.replace(name, tmp.get(name) + 1);
                else tmp.put(name, 1);
            }
        }
        int count = 0;
        for(Map.Entry<String, Integer> item : tmp.entrySet()){
            if (item.getValue() > 1) count++;
        }
        return count;
    }
}

public class  TestHash {
    public static void main(String[] args) {
        NameHash work = new NameHash();

        work.addValues("1","1");
        work.addValues("2","2");
        work.addValues("2","3");
        work.addValues("1","4");
        work.addValues("1","5");
        work.addValues("3","1");
        work.addValues("3","2");
        work.addValues("4","3");
        work.addValues("4","4");
        work.addValues("5","5");

        System.out.println(work.getSameFirstNameCount());
        System.out.println(work.getSameLastNameCount());

    }
}