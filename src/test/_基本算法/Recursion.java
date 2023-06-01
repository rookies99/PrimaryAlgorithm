package _基本算法;

import org.junit.Test;

public class Recursion {

    /**
     * 测试结果
     */
    @Test
    public void test1() {
        sumByRecursion(5);
        System.out.println("factorialRecursion(2) = " + factorialRecursion(3));
    }

    /**
     * 递归输出倒序 *
     * @param i
     */
    public void sumByRecursion(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
        if (i == 1) {
            return;
        }
        sumByRecursion(--i);
    }

    public int factorialRecursion(int i) {
        if (i == 1) {
            return i;
        } else {
            return i*factorialRecursion(--i);
        }
    }
}
