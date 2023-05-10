package 基本算法;

import org.junit.Test;

public class BinarySearch {
    /**
     * 用于测试二分查找
     * 特点：只能用于有序数组
     *
     */
    @Test
    public void  binarySearch() throws InterruptedException {
        long start = System.currentTimeMillis();
        int[] arr = {11, 26, 35, 45, 57, 68, 99, 102,11, 26, 35, 45, 57, 68, 99, 102,11, 26, 35, 45, 57, 68, 99, 102,11, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 102,11, 26, 35, 45, 57, 68, 99, 102,222};
        int target = 222;
        int median = arr[arr.length / 2];
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+" ms");
    }
}
