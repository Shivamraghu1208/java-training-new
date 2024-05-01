package com.training;

import java.util.HashMap;
import java.util.Map;

public class Hashcode {
    public static void main(String[] args) {
     /* Map<String,String> map =new HashMap<>();
      map.put("Dev","Shivam");
      map.put("Dev","vISHNU");
        map.put("Dev","Akash");
        
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        Map<Demo,String> map =new HashMap<>();
        map.put(new Demo(2,"3"),"Shivam");
        map.put(new Demo(3,"3"),"Sumit");
        map.put(new Demo(2,"3"),"vishnu");
//        map.put(new Sumit("SHivam"),"Sumit piapriya");
//        map.put(new Sumit("Sumit"),"Sumit indore");
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
