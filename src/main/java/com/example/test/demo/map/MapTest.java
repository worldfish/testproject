package com.example.test.demo.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
    HashMap<Integer,String> map = new HashMap<>();

    public void getList(){
        HashMap<Integer,String> map = new HashMap<>();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            map.get(i);
        }
    }

}
