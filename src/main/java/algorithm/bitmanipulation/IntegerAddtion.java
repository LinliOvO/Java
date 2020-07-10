package algorithm.bitmanipulation;

import org.junit.Test;

/**
 * 整数相加，不用加减乘除四则运算或工具类
 */
public class IntegerAddtion {

    int addInt(int num1, int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        return num1;
    }

    @Test
    public void test() {
        System.out.println(addInt(5, 7));
    }
}
