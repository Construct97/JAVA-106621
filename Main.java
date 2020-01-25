public class Main<T> {
    public Main() {
    }

    public boolean contains(T[] Kolekcja, T Generalnie_ele) {
        int var3 = Kolekcja.length;
        byte var6 = 0;
        if (var6 < var3) {
            T item = Kolekcja[var6];
            return item.equals(Generalnie_ele);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] array = new String[]{"element", "item"};
        String element1 = "element";
        String element2 = "element2";
        Main main = new Main();
        System.out.println(main.contains(array, element1));
        System.out.println(main.contains(array, element2));
    }
}
