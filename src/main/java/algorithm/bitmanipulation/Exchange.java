package algorithm.bitmanipulation;

import org.junit.Test;

/**
 * 不用新的变量交换两个变量的值
 */
public class Exchange {

    /**
     * 用四则运算
     * @param a
     * @param b
     */
    public void exchange1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + ", b=" + b);
    }

    /**
     * 用位运算
     * @param a
     * @param b
     */
    public void exchange2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + ", b=" + b);
    }

    @Test
    public void test() {
        exchange2(5, 7);
    }
}
