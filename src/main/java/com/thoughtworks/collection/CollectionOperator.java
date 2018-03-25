package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right) {
            for(Integer i = left; i <= right; i++) {
                result.add(i);
            }
        }else {
            for(Integer i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right) {
            for(Integer i = left; i <= right; i++) {
                if(i % 2 == 0) {
                    result.add(i);
                }
            }
        }else {
            for(Integer i = left; i >= right; i--) {
                if(i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for(Integer item : array) {
            if(item % 2 == 0) {
                result.add(item);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> result = new ArrayList<>();

        for(Integer itemA : firstArray) {
            for(Integer itemB : secondArray) {
                if(itemA == itemB) {
                    result.add(itemA);
                }
            }
        }

        return result;

    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();

        for(Integer item :  firstArray) {
            result.add(item);
        }

        for(int i = 0; i < secondArray.length; i++ ) {
            if(!result.contains(secondArray[i])) {
                result.add(secondArray[i]);
            }
        }

        return result;
    }
}
