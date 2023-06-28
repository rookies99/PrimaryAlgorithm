package _基本算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = random.nextInt(100000-1+1)+1;
        }
        long start = System.currentTimeMillis();
        System.out.println("bubbleSort(arr) = " + Arrays.toString(bubbleSort(arr)));
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }


    /**
     * 冒泡排序 O(n)²
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
