package _基本算法;

import org.junit.Test;

import java.util.*;

public class hasDuplicateValue {

    @Test
    public void test1() {
        Object [] arr = {"","12","13","14","15","16","18"};
        System.out.println("hasDuplicate(arr) = " + hasDuplicate(arr));
    }


    /**
     * 数组 重复值判断  时间复杂度O(n)
     * @param arr
     * @return
     */
    public boolean hasDuplicate(Object[] arr) {
        int steps = 0;
        Set<Object> set = new HashSet<>();
        for (Object o : arr) {
            steps++;
            if (!set.add(o)) {
                return true;
            }
        }
//        System.out.println("steps:"+steps);
//        set.forEach(System.out::println);
        return false;
    }
}
