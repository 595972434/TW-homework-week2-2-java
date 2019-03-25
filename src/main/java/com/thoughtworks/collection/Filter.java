package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.size();i++){
            if(array.get(i)%2==0){
                result.add(array.get(i));
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.size();i++){
            if(array.get(i)%3==0){
                result.add(array.get(i));
            }
        }
        return result;
    }
    public List<Integer> getDifferentElements() {

        Set<Integer> set= new HashSet();
        for(int i=0;i<array.size();i++)
        {
            set.add(array.get(i));
        }
        List<Integer> result=new ArrayList<>(set);
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<firstList.size();i++){
            for(int j=0;j<secondList.size();j++){
                if(firstList.get(i)==secondList.get(j)){
                    result.add(firstList.get(i));
                }
            }
        }
        return result;
    }


}