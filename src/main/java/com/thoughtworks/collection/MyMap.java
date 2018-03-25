package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();

        for(Integer item : array) {
            result.add(item*3);
        }

        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < array.size(); i++) {
            result.add(letterList.get(array.get(i) - 1));
        }

        return result;
    }

    //将数字转化为对应的英文字母
    public String convertToTitle(int num) {

        StringBuilder str = new StringBuilder();

        while(num > 0){
            num --;
            char ch = (char) (num % 26 + 'a');
            num = num/26;
            str.append(ch);
        }

        str.reverse();
        return str.toString();
    }




    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();

        for(Integer item : array) {
            result.add(convertToTitle(item));
        }

        System.out.println(result);
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>();

        for(Integer item : array) {
            result.add(item);
        }

        Collections.sort(result);
        Collections.sort(result, Collections.reverseOrder());

        return result;
    }

    public List<Integer> sortFromSmall() {

        List<Integer> result = new ArrayList<>();

        for(Integer item : array) {
            result.add(item);
        }

        Collections.sort(result);

        return result;
    }
}
