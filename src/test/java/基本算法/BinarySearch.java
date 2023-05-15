package 基本算法;

import org.junit.Test;

public class BinarySearch {
    /**
     * 用于测试算法结果
     */
    @Test
    public void test1() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String[] strings = {"aike","bake","ciner","dick","elk","fuck"};
        int target = 8;
        String target2 = "elk";
        System.out.println(binarySearch(arr, target));
        System.out.println("binarySearchByName(chars) = " + binarySearchByName(strings,target2));
        Integer integer = Integer.MAX_VALUE - 1 + (Integer.MAX_VALUE - (Integer.MAX_VALUE - 1) );
    }

    /**
     * 二分查找
     * 特点：只能用于有序数组
     *
     */
    public int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int median = left + (right - left) / 2; // 避免极端情况整型溢出
            if (arr[median] == target) {
                return median;
            }else if (arr[median] < target) {
                left = median+1;
            } else if (arr[median] > target) {
                right = median-1;
            }
        }
        return -1;
    }

    /*
    进阶：二分法查找英文名
     */
    public int binarySearchByName(String[] arr,String target){
        int left = 0;
        int right = arr.length - 1;

        // 边界检查
        if (target.compareTo(arr[left]) < 0 || target.compareTo(arr[right]) > 0) {
            return -1;
        }
        while (left <= right) {
            int median = left + (right-left)/2;

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
}
