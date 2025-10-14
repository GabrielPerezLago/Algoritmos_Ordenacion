package com.gabriel.orden;

import java.util.ArrayList;
import java.util.List;

public class Final{
    public List<String> data = new ArrayList<String>();

    public void setAlg(String alt){
        if(!data.contains(alt)) {
            data.add(alt);
        }
    }

    public void show(){
        for (int i = 0; i < data.size(); i++) {
            System.out.println("En la posicion : " + (i + 1) + ". Llego :  " + data.get(i));
        }
    }

}
