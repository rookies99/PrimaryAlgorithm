package _基本算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    @Test
    public void test1() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 6, 7, 8, 9};
        System.out.println("intersection(firstArray,secondArray) = " + intersection(firstArray, secondArray));
    }

    /**
     * 获取两个数组之间的交集
     *
     * @param firstArray
     * @param secondArray
     * @return
     */
    public Set<Integer> intersection(int[] firstArray, int[] secondArray) {
        Set<Integer> set = new HashSet<>();
        for (int first : firstArray) {
            for (int second : secondArray) {
                if (first == second) {
                    set.add(first);
                    break;
                }
            }
        }
        return set;
    }
}
