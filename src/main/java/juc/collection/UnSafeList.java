package juc.collection;

import java.util.ArrayList;

public class UnSafeList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
