package com.gabriel.orden;

import java.util.ArrayList;
import java.util.List;

public class Final{
    public List<String> data = new ArrayList<String>();

    public void setAlg(String alt){
        data.add(alt);
    }

    public void show(){
        for (String da : data){
            int index = data.indexOf(da);
            System.out.println("Posicion de " + da + " : " + (index + 1));
        }
    }

}
