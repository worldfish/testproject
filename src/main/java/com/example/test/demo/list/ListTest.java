package com.example.test.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {


    //增删改查
    public void listCrud(){
        List<String> list = new ArrayList<>();
        //add
        list.add("1");
        list.add("2");

        for (String i: list) {
            System.out.println(i);
        }

        if(list.contains("1")){
            System.out.println(1);
        }

        //改
        list.set(0, "1");
        for (int i=0;i<list.size();i++){
            if(list.get(i) == "1"){
                list.set(i, "3");
            }
        }

        //delete
        list.remove("1");

        //生成一个新的List
        list = list.subList(1,2);

        //判空
        list.isEmpty();

        //list->string
        list.toString();

        //集合->数组
        list.toArray();

        //去重,方法1
        for(int i=0;i<list.size()-1;i++){
            for (int j = list.size() -1 ;j>i;j--){
                if(list.get(j).equals(list.get(i))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);

        //去重，方法2
        List<String> list1 = new ArrayList<>();
        for (String s : list){
            if (Collections.frequency(list1,s)<1){
                list1.add(s);
            }
        }
        System.out.println(list1);

        //去重，方法3
        for (String s : list){
            if(!list.contains(s)){
                list.add(s);
            }
        }

    }

    //for each循环
    public void list01(){
        List<Integer> list = new ArrayList<>();
        for (Integer j : list){
            System.out.println(j);
        }
    }

    //显示调用集合迭代器
    public void list02(){
        List<Integer> list = new ArrayList<>();
        /*for (Iterator<Integer> iterator = list.iterator()){
            iterator.next();
        }*/
    }

    public void list03(){
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
    }

    //下标递增循环，终止条件为和等于size()的临时变量比较判断
    public void list04(){
        List<Integer> list = new ArrayList<>();
        int size = list.size();
        for (int j=0;j<size;j++){
            list.get(j);
        }
    }

    // 下标递减循环
    public void list05(){
        List<Integer> list = new ArrayList<>();
        for (int j = list.size() - 1;j>=0;j--){
            list.get(j);
        }
    }


}
