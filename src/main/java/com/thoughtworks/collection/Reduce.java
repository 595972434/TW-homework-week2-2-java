package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int num=arrayList.get(0);
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)>num){
                num=arrayList.get(i);
            }
        }
        return num;
    }

    public double getMinimum() {
        int num=arrayList.get(0);
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)<num){
                num=arrayList.get(i);
            }
        }
        return num;
    }

    public double getAverage() {
        double sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i);
        }
        return sum/arrayList.size();
    }

    public double getOrderedMedian() {
        double result=0;
        Collections.sort(arrayList);
        if(arrayList.size()%2==0){
            result=(double)(arrayList.get(arrayList.size()/2)+arrayList.get(arrayList.size()/2-1))/2;
        }
        else{
            result=(double)(arrayList.get(arrayList.size()/2));
        }
        return result;
    }

    public int getFirstEven() {
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0){
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
