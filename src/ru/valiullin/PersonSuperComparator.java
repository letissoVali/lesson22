package ru.valiullin;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<PersonSimple> {
    public int compare(PersonSimple a, PersonSimple b) {
        int comporatorResult = a.getName().compareTo(b.getName());
        if(comporatorResult !=0) {
            return comporatorResult;
        } else{
            return a.getAge().compareTo(b.getAge());
        }
        //
    }

}
