package com.mypack.refactoring.demo.SubstitudeAlgorithm9.type2;

import java.util.Arrays;
import java.util.List;

public class Person {
    public String foundPerson(String[] people) {

        List candidates = Arrays.asList("Don", "John", "Kent");
        for (int i = 0; i < people.length; i++) {
            if(candidates.contains(people[i]));
            return people[i];
        }
        return "";
    }
}