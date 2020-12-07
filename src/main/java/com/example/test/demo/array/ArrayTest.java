package com.example.test.demo.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public void testArray(){

        int[] array = new int[10];
        //排序
        Arrays.sort(array);
        //数组->string
        Arrays.toString(array);




    }

    //add
    public void add(int[] array,int temp){
        array[array.length - 1] = temp;
    }
    //delete
    public void delete(int[] array,int temp){
        int i;
        for (i=0;i<array.length;i++){
            if(array[i] == temp){
                break;
            }
        }
        for (int j=i;j<array.length-1;j++){
            array[j] = array[j+1];
        }
    }
    //delete
    public void assignment(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
    }
    //modify
    public void modify(int[] array,int key,int temp){
        array[key] = temp;
    }

    //query
    public int query(int[] array,int temp){
        int i;
        for (i=0;i<array.length;i++){
            if(array[i] == temp){
                break;
            }
        }
        return i;
    }

    //去重

    //直接插入排序
    public void insertSort(int[] array){
        int temp = 0;
        for (int i=1;i<array.length;i++){
            int j=i-1;
            temp = array[i];
            for (;j>=0&&temp<array[j];j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }

    //冒泡排序
    public void bubbleSort(int[] array){
        int temp;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //快速排序

    //希尔（插入）排序

    //选择排序



}
