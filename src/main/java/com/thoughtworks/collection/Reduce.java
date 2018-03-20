package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);

        for(Integer item : arrayList) {
            if(item > max) {
                max = item;
            }
        }

        return max;
    }

    public double getMinimum() {

        int min = arrayList.get(0);

        for(Integer item : arrayList) {
            if(item < min) {
                min = item;
            }
        }

        return min;
    }

    public double getAverage() {
        double average, sum=0;

        for(Integer item : arrayList) {
            sum += item;
        }
        average = sum / arrayList.size();
        return average;
    }

    public double getOrderedMedian() {
        List<Integer> result = new ArrayList<Integer>();
        double median;
        for(int i = 0; i<arrayList.size(); i++) {
            result.add(arrayList.get(i));
        }

        int length = result.size();

        if (length % 2 == 0) {
            median = ((double)(result.get(length / 2) + result.get(length / 2 - 1))) / 2;
        } else {
            median = result.get(length / 2);
        }

        return median;
    }

    public int getFirstEven() {

        int result = 0;

        for(Integer item : arrayList) {
            if(item % 2 == 0) {
                result = item ;
                break;
            }
        }
        return result;
    }

    public int getIndexOfFirstEven() {

        int result = 0;

        for(int i = 0; i < arrayList.size(); i++ ) {
            if(arrayList.get(i) % 2 == 0) {
                result = i;
                break;
            }

        }
        return result;
    }

    public boolean isEqual(List<Integer> differentArrayList) {
        if (arrayList.size() != differentArrayList.size()) {
            return false;
        }
        for (Integer item : arrayList) {
            if (!differentArrayList.contains(item)) {
                return false;
            }
        }
        return true;

    }

    //实现接口SingleLink，然后再此函数内使用
    public double getMedianInLinkList(SingleLink<Integer> singleLink) {

        for(Integer item : arrayList) {
            singleLink.addTailPointer(item);
        }

        if(arrayList.size()%2 == 0){
            return ((double)(singleLink.getNode(arrayList.size()/2) + singleLink.getNode(arrayList.size()/2+1))/2);
        }else{
            return singleLink.getNode(arrayList.size()/2+1);
        }
    }

    public int getLastOdd() {
        int result = 0;
        for(int i = arrayList.size() - 1; i >=0; i--) {
            if(arrayList.get(i) % 2 != 0) {
                result = arrayList.get(i);
                break;
            }
        }
        return result;
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for(int i = arrayList.size() - 1; i >=0; i--) {
            if(arrayList.get(i) % 2 != 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
