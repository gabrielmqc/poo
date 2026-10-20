package org.example.veiculos;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hash=new HashMap<Integer,String>();
        Map<Integer,String> linked=new LinkedHashMap<Integer,String>();
        Map<Integer,String> tree=new TreeMap<Integer,String>();

        int[] chaves={100,3,47,16};
        String[] frutas={"Mango","Apple","Banana","Grapes"};
        for(int i=0;i<chaves.length;i++){
            hash.put(chaves[i],frutas[i]);
            linked.put(chaves[i],frutas[i]);
            tree.put(chaves[i],frutas[i]);
        }

        System.out.println("HashMap:       "+hash);
        System.out.println("LinkedHashMap: "+linked);
        System.out.println("TreeMap:       "+tree);
    }
}