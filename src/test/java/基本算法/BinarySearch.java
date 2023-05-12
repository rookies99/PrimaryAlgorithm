package 基本算法;

import org.junit.Test;

public class BinarySearch {
    /**
     * 用于测试算法结果
     */
    @Test
    public void test1() {
        int[] arr = {11, 26, 35, 45, 57, 68, 99, 102, 11, 26, 35, 45, 57, 68, 99, 102, 11, 26, 35, 45, 57, 68, 99, 102, 11, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 10211, 26, 35, 45, 57, 68, 99, 102, 11, 26, 35, 45, 57, 68, 99, 102, 222};
        int target = 222;
        binarySearch(arr, target);
    }

    /**
     * 二分查找
     * 特点：只能用于有序数组
     *
     */
    public boolean binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int median = (left + right) / 2;
            if (arr[median] == target) {
                return true;
            }
            if (arr[median] < target) {
                left = median+1;

            }
        }
        return false;
    }
}
