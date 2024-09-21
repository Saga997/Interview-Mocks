package org.zaidism.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
    public static void main(String[] args)
    {
        //first create a simple ArrayList
        List<String> sample_list=new ArrayList<>();

        //make the arrayList synchronized
        List<String> synch_list = Collections.synchronizedList(sample_list);
        synch_list.add("Ayush");
        synch_list.add("Amisha");

        //Access the synch_list
        synchronized(synch_list)
        {
            for(String item: synch_list)
            {
                System.out.println(item);
            }
        }







    }
}
