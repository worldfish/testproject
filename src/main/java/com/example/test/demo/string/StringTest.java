package com.example.test.demo.string;

import org.apache.tomcat.util.buf.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest implements Serializable {

    private char[] value;

    public static void main(StringTest[] args) {
        String a = "abc";
        a.charAt(8);
        a.concat(a);
    }

    //index
    public char charAt01(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }

    //连接字符串
    public String concat02(String str){
        String test = str.concat("-");
        return test;
    }

    //分割字符串
    public String[] split03(String str){
        String[] test = str.split("/");
        return test;
    }

    //字符串转化为数组
    public char[] array04(String str){
        char[] test = str.toCharArray();
        return test;
    }

    //切割
    public String substring05(String str,int start,int end){
        String test = str.substring(start,end);
        return test;
    }

    //替换
    public String replace06(String str1,String str2){
        String str = str1.replace(str1,str2);
        return str;
    }

    //String转化为List
    public List<String> toList07(String str){
        String[] test = str.split(",");
        List<String> list = Arrays.asList(test);
        return list;
    }

    //list转String
    public String toString08(List<String> list){
        String[] str = list.toArray(new String[list.size()]);
        String result = "";
        for (int i = 0;i<str.length;i++){
            result += str[i];
        }
        return result;
    }

    //list转String
    public String toString09(List<String> list){
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (String str : list){
            sb.append(",");
            sb.append(str);
        }
        result = sb.toString();
        return result;
    }

    //String to list
    public List<String> toList10(String str) {
        //字符串转list<String>

        //此处为了将字符串中的空格去除做了一下操作
        List<String> list= Arrays.asList(str .split(",")).stream().map(s -> (s.trim())).collect(Collectors.toList());
        //list<String>转字符串（以逗号隔开）
        //System.out.println(String.join(",", list));
        return list;
    }
    //array to string
    public String tostring11(String[] arr){
        return Arrays.toString(arr);
    }

    public String toString12(String[] arr){
        String join = "";
        join = StringUtils.join(Arrays.asList(arr), ',');
        return join;
    }

    //String类中常用的方法
    //1.string中重写的方法：equals   hashCode  compareTo
    //2.String中常用的方法；split  substring indexOf  replace .....
    //3.String中那些比较平常的：toUpperCase concat







}
