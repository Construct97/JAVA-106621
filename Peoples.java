package Zadanie5;

public class Peoples implements Comparable {
    public String imie;
    public int wiek;


    public People(int wiek, String imie) {

        this.imie = imie;
        this.wiek = wiek;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
