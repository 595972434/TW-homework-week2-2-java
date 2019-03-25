package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start=0;
        int end=0;
        int result=0;
        if(leftBorder<rightBorder){
            start=leftBorder;
            end=rightBorder;
        }
        else{
            start=rightBorder;
            end=leftBorder;
        }
        for(int i=start;i<=end;i++){
            if(i%2==0){
                result+=i;
            }
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int start=0;
        int end=0;
        int result=0;
        if(leftBorder<rightBorder){
            start=leftBorder;
            end=rightBorder;
        }
        else{
            start=rightBorder;
            end=leftBorder;
        }
        for(int i=start;i<=end;i++){
            if(i%2==1){
                result+=i;
            }
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result=0;
        for(int i=0;i<arrayList.size();i++){
            result+=arrayList.get(i)*3+2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                arrayList.set(i,arrayList.get(i)*3+2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                result+=arrayList.get(i)*3+5;
            }
        }
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<arrayList.size();i++){
            result.add((arrayList.get(i)+arrayList.get(i-1))*3);
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> result=new ArrayList<>();
        double Result;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0){
                result.add(arrayList.get(i));
            }
        }
        Collections.sort(result);
        if(result.size()%2==0){
            Result=(double)(result.get(result.size()/2)+result.get(result.size()/2-1))/2;
        }
        else{
            Result=(double)(result.get(result.size()/2));
        }
        return Result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

}
