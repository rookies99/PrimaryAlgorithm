package _基本算法.soft;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    @Test
    public void test1() {
        Random random = new Random();
        int[] arr = new int[200000];
        for (int i = 0; i < 200000; i++) {
            arr[i] = random.nextInt(1000000-1+1)+1;
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
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
