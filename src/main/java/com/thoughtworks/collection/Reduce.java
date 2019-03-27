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
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0){
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(arrayList.size()!=this.arrayList.size()){
            return false;
        }
        else{
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i)!=this.arrayList.get(i)){
                    return false;
                }
            }
            return true;
        }
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double num=0;
        if(arrayList.size()%2==1){
            num=arrayList.get(arrayList.size()/2);
        }
        else{
            num=(double)(arrayList.get(arrayList.size()/2)+arrayList.get(arrayList.size()/2-1))/2;
        }
        return num;
    }

    public int getLastOdd() {
        int num=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                num=arrayList.get(i);
            }
        }
        return num;
    }

    public int getIndexOfLastOdd() {
        int num=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==1){
                num=i;
            }
        }
        return num;
    }
}
