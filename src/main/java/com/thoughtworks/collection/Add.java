package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);

        return IntStream.rangeClosed(min, max).filter(n -> n % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = Math.max(leftBorder, rightBorder);
        int min = Math.min(leftBorder, rightBorder);

        return IntStream.rangeClosed(min, max).filter(n -> n % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for(Integer item : arrayList) {
            sum += item*3 +2;

        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        Integer length = arrayList.size();
        for(int i = 0; i< length; i++) {
            if(arrayList.get(i) %2 != 0) {
                Integer newNum = arrayList.get(i)*3 +2;
                arrayList.set(i, newNum);
            }
        }
        return arrayList;

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for(Integer item : arrayList) {
            if(item % 2 != 0) {
                sum += item*3 + 5;
            }
        }
        return sum;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        Integer length = arrayList.size();
        for (int i = 0; i < length - 1; i++) {
            Integer item = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            result.add(item);
        }
        return result;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

        List<Integer> evenArr = new ArrayList<Integer>();
        int median;
        Integer length = arrayList.size();
        for(int i = 0; i<length; i++) {
            if(arrayList.get(i) % 2 == 0) {
                evenArr.add(arrayList.get(i));
            }
        }

        int evenArrLength = evenArr.size();
        if (evenArrLength % 2 == 0) {
            median = (evenArr.get(evenArrLength / 2) + evenArr.get(evenArrLength / 2 - 1)) / 2;
        } else {
            median = evenArr.get(evenArrLength / 2);
        }

        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double average;
        int sum = 0, count = 0;
        for (Integer item : arrayList) {
            if(item % 2 == 0) {
                sum += item;
                count++;
            }
        }
        average = sum / count;
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenArr = new ArrayList<>();
        for(Integer item : arrayList) {
            if(item % 2 == 0) {
                evenArr.add(item);
            }
        }

        return evenArr.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(Integer item : arrayList) {
            if(item % 2 == 0) {
                evenArr.add(item);
            }
        }
        for(Integer ele : evenArr) {
            if(!result.contains(ele)) {
                result.add(ele);
            }
        }

        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();

        for(Integer item : arrayList) {
            if(item % 2 == 0) {
                evenArr.add(item);
            }
        }
        for(Integer item : arrayList) {
            if(item % 2 != 0) {
                oddArr.add(item);
            }
        }

        Collections.sort(evenArr);
        Collections.sort(oddArr, Collections.reverseOrder());

        List<Integer> result = evenArr;

        evenArr.addAll(oddArr);

        System.out.println(result);
        return result;

    }


}
