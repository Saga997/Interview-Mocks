package org.zaidism.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {
    public static void main(String[] args) throws Exception{
        try{
            List<String> sample= new ArrayList<>();
            sample.add("practise");
            sample.add("solve");
            System.out.println("The initial list is:"+sample);

            //using unmodifiableList() method to amke arrayList readOnly
            List<String> read_only_sample= Collections.unmodifiableList(sample);

            System.out.println("The read only arrayList is"+read_only_sample);

            //try to add elemnt in readOnly ArrayList
            read_only_sample.add("job");
        }
        catch(UnsupportedOperationException ex)
        {
            System.out.println("The exception is:" +ex);
        }
    }

}
