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
     * 冒泡排序:1.从列表的第一个元素开始，依次比较相邻的两个元素。
     *         2.如果前一个元素大于后一个元素，则交换它们的位置，使较大的元素往后移动。
     *         3.继续比较下一对相邻元素，重复上述交换步骤，直到比较到列表的倒数第二个元素。
     *         4.重复执行上述步骤，直至按照顺序排列
     *         时间复杂度是O(n²)
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
