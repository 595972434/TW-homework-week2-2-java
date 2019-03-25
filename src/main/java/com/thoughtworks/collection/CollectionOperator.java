package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> result=new ArrayList<>();
        if(left<right){
            for(int i=left;i<=right;i++){
                result.add(i);
            }
        }
        else{
            for(int i=left;i>=right;i--){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result=new ArrayList<>();
        if(left<right){
            for(int i=left;i<=right;i++){
                if(i%2==0) {
                    result.add(i);
                }
            }
        }
        else{
            for(int i=left;i>=right;i--){
                if(i%2==0){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                result.add(array[i]);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                if(firstArray[i]==secondArray[j]){
                    result.add(firstArray[i]);
                    continue;
                }
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> result=new ArrayList<>(Arrays.asList(firstArray));
        for(int i=0;i<secondArray.length;i++){
            int findFlag=0;
            for(int j=0;j<firstArray.length;j++){
                if(secondArray[i]==firstArray[j]){
                    findFlag=1;
                    continue;
                }
            }
            if(findFlag==0){
                result.add(secondArray[i]);
            }
        }
        return result;
    }
}
