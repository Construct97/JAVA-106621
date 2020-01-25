package Zadanie4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        People people1 = new People(10, "Zbigniew", "Stonoga");
        People people2 = new People(20, "Tommy", "Ferrari");
        People people3 = new People(30, "Daniel", "Zieliński");
        List<People> peopleList = new ArrayList();
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        Iterator var = peopleList.iterator();

        People temp;
        while(var.hasNext()) {
            temp = (People)var.next();
            System.out.println(temp.PrintInfo());
        }

        peopleList.sort(Comparator.comparingInt((a) -> {
            return a.wiek;
        }));
        Collections.reverse(peopleList);
        var = peopleList.iterator();

        while(var.hasNext()) {
            temp = (People)var.next();
            System.out.println(temp.PrintInfo());
        }

        peopleList.sort(Comparator.comparing((a) -> {
            return a.nazwisko;
        }));
        Collections.reverse(peopleList);
        var = peopleList.iterator();

        while(var.hasNext()) {
            temp = (People)var.next();
            System.out.println(temp.PrintInfo());
        }

    }
}
