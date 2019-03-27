package com.thoughtworks.collection;

import org.apache.commons.collections.ArrayStack;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        List<Integer> result= new ArrayList<>();
        for(int i=0;i<array.size();i++){
            result.add(array.get(i)*3);
        }
        return result;
    }

    public List<String> mapLetter() {

        List <String>result =new ArrayList<>();
        for(int i=0;i<array.size();i++){
            result.add((char)(array.get(i)+0x60)+"");
        }
        return result;
    }

    public List<String> mapLetters() {

        List <String>result =new ArrayList<>();
        for(int i=0;i<array.size();i++){
            int num=array.get(i);
            String str="";
            while(num>0){
                num--;
                str=(char)(num%26+0x61)+str;
                num=(num-num%26)/26;
            }
            result.add(str);
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array,Collections.reverseOrder());
        return array;
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
