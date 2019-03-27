package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
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
