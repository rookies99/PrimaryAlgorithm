package _基本算法;

import org.junit.Test;

import java.util.Random;

public class SortableArray {

    @Test
    public void test1() {
        int[] arr = {5, 1, 3, 7, 8, 4};
        sortableArray(arr);
    }

    /**
     * 分区
     * @param array
     * @return
     */
    public int[] sortableArray(int[] array) {
        Random random = new Random();
        int randomNum = random.nextInt(array.length - 1 + 1);
        System.out.println("randomNum = " + randomNum);
        int left = 0;
        int right = array.length-1;

        return array;
    }

}
