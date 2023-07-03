package _基本算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[200000];
        int[] arr2 = {4, 2, 1, 3, 7};
        for (int i = 0; i < 200000; i++) {
            arr[i] = random.nextInt(1000000-1+1)+1;
        }
        long start = System.currentTimeMillis();
        System.out.println("insertionSort(arr) = " + Arrays.toString(insertionSort(arr)));
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }

    /**
     * 插入排序  时间复杂度O(n)²  速度比选择排序和冒泡排序更快
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int position = i;
            while (position > 0 && arr[position - 1] > temp) {
                arr[position] = arr[position - 1];
                arr[position-1] = temp;
                position = position-1;
            }
        }
        return arr;
    }
}
