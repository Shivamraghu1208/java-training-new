package com.training;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionConcept {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shivam");
        list.add("akash");
        list.add("vishnu");
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("java Developer", list);
/*
        for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
            String key = entry.getKey();
            List<String> list1=entry.getValue();
            System.out.println("Key: " + key + ", Value: " + list1);
        }*/
        Map<String, Map<String, List<String>>> map = new HashMap<>();

        

        map.put("Aurx", map1);
        for (Map.Entry<String, Map<String, List<String>>> Entry1 : map.entrySet()) {
            String outerKey = Entry1.getKey();
            Map<String, List<String>> innervalue = Entry1.getValue();
            System.out.println("outerKey " +outerKey);
              for(Map.Entry<String,  List<String>>  entry2: innervalue.entrySet())
              {
                  String innerkey = entry2.getKey();
                  List<String> value = entry2.getValue();
                  System.out.println("innerKey "+ innerkey);
                  System.out.println("values"+value);



              }

            }
        }
    }

