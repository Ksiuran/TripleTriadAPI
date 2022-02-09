package com.revature.ttapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class TtapiApplication {

    public static int func(List<List<Integer>> customers){
        //i is time
        LinkedList<Integer> time = new LinkedList<>();
        List<Integer> alreadyServed = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++){
            if(time.isEmpty()) {
                time.add(customers.get(0).get(1));
                alreadyServed.add(customers.get(0).get(0));
            }
            int maxTime = time.stream().reduce(0,Integer::sum);
            int finalI = i;
            List<Integer> list;
            Optional<List<Integer>> listo = customers.stream().filter(a -> a.get(0) <= maxTime
                            && !alreadyServed.contains(a.get(0))
                            && a.get(0) <= finalI)
                    .min(Comparator.comparingInt(a -> a.get(1)));
            if(listo.isPresent()) {
                list = listo.get();
                time.add(list.get(1));
                alreadyServed.add(list.get(0));
            }
        }
        return time.stream().reduce(0,Integer::sum) / customers.size();
    }

    public static void main(String[] args) {
        //SpringApplication.run(TtapiApplication.class, args);
    }
    /*TODO: Model a MGP to Pack Buy System
        Web Socket front end work
    */
}
