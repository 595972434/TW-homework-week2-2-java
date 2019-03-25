package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                result.add(array[i][j]);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result=new ArrayList<>();
        List<Integer> result1=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                result.add(array[i][j]);
            }
        }
        for(int i=0;i<result.size();i++){
            if(!result1.contains(result.get(i))){
                result1.add(result.get(i));
            }
        }
        return result1;
    }
}
