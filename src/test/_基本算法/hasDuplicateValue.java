package _基本算法;

import org.junit.Test;

import java.util.Arrays;

public class hasDuplicateValue {

    @Test
    public void test1() {
        int[] arr = {10,12,13,14,15,16};
        System.out.println("hasDuplicate(arr) = " + hasDuplicate(arr));
    }

    /**
     * 数组 重复值判断
     */

    public boolean hasDuplicate(int[] arr) {
        int steps = 0;
        int[] existingNumbers = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (existingNumbers[arr[i]] >=1) {
                return true;
            } else {
                existingNumbers[arr[i]]++;
            }
        }
        System.out.println(Arrays.toString(existingNumbers));
        return false;
    }
}
