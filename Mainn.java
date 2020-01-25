package Zadanie5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        People people = new People("Kamil",20);
        People peoplepeople2 = new People("Miłosz", 21);
        People samePerson = new People("Karolina", 22);
        HashSet<People> hashSet = new HashSet();
        hashSet.add(people);
        hashSet.add(peoplepeople2);
        hashSet.add(samePerson);
        Iterator var4 = hashSet.iterator();

        while(var4.hasNext()) {
            People peopleTemp = (People)var4.next();
            System.out.println(peopleTemp.hashCode());
            System.out.println(peopleTemp.equals(people));
        }

        TreeSet<People> treeSetPeople = new TreeSet();
        treeSetPeople.addAll(hashSet);
        treeSetPeople.comparator();
        Iterator var9 = treeSetPeople.iterator();

        while(var9.hasNext()) {
            People peopleTemp = (People)var9.next();
            System.out.println(peopleTemp.wiek);
        }

    }
}
