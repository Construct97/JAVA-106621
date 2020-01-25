package Zadanie2;

public class JoinPractise {

	 for (int i = 0; i < 10; i++){
        Thread thread[i] = new Thread[i](() -> {
            for (int j = 1; j <= 20; j++) {
                System.out.println(j);
            }
            )};
    }

    public static void main(String[] args) {
        try {
            for (int k; k<10;k++) {
                t[i].join();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}