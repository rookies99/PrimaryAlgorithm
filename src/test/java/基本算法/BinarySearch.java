package 基本算法;

import org.junit.Test;

public class BinarySearch {
    /**
     * 用于测试算法结果
     */
    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"aike", "bake", "cine", "daile", "elk", "feel"};
        int target = 8;
        String target2 = "elk";
        System.out.println("binarySearch(arr,target) = " + binarySearch(arr, target));
        System.out.println("binarySearchByName(strings,target2) = " + binarySearchByName(strings, target2));
        System.out.println("binarySearchByRecursion(arr,target,0,arr.length-1) = " + binarySearchByRecursion(arr, 11, 0, arr.length - 1));

    }

    /**
     * 二分查找
     * 特点：只能用于有序数组
     * 时间复杂度：O(logN)
     */
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int median = left + (right - left) / 2; // 避免极端情况整型溢出
            if (arr[median] == target) {
                return median;
            } else if (arr[median] < target) {
                left = median + 1;
            } else if (arr[median] > target) {
                right = median - 1;
            }
        }
        return -1;
    }

    /**
     * 进阶：二分法查找英文名
     * @param arr
     * @param target
     * @return median
     */
    public int binarySearchByName(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        // 边界检查
        if (target.compareTo(arr[left]) < 0 || target.compareTo(arr[right]) > 0) {
            return -1;
        }
        while (left <= right) {
            int median = left + (right - left) / 2;

            int cmp = arr[median].compareTo(target);
            if (cmp == 0) {
                return median;
            } else if (cmp < 0) {
                left = median + 1;
            } else {
                right = median - 1;
            }
        }
        return -1;
    }

    /**
     * 进阶：二分查找递归写法
     */
    public int binarySearchByRecursion(int[] arr, int target, int left, int right) {
        if (left > right || target<arr[left] || target>arr[right]) {// 优化后：增加目标值越界比较
            return -1;
        }
        int median = left + (right - left) / 2;
        if (arr[median] == target) {
            return median;
        } else if (arr[median] > target) {
            return binarySearchByRecursion(arr, target, left, median - 1);
        } else{ // 优化后：省略多余if
            return binarySearchByRecursion(arr, target, median + 1, right);
        }
    }
}
