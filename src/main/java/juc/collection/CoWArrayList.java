package juc.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CoWArrayList {

    public static void main(String[] args) {
        final CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
