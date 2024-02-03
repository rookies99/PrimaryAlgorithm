package _基本算法.soft;

import _基本算法.matrix.Mtrix;
import javafx.scene.transform.MatrixType;
import org.junit.Test;

import javax.swing.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

    @Test
    public void test1() {
//        Random random = new Random();
//        int[] arr = new int[20];
//        int[] arr2 = {4, 2, 1, 3, 7};
//        for (int i = 0; i < 20; i++) {
//            arr[i] = random.nextInt(100-1+1)+1;
//        }
//        long start = System.currentTimeMillis();
//        System.out.println("insertionSort(arr) = " + Arrays.toString(insertionSort(arr)));
//        System.out.println("执行时间：" + (System.currentTimeMillis() - start) + "ms");

        double num1 = 0.1;
        double num2 = 0.2;
        double sum = num1 + num2;
        sum  = sum*2;
        System.out.print(sum);
    }



    /**
     * 插入排序：1.从第一个元素开始用临时变量存起来，
     * 2.再用一个临时变量存用来比较的元素，用临时变量跟前面的元素比较，比它大则让前面的元素右移，
     * 3.并进行交换，重复上述步骤直至有序。
     *
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            int position = i;
            while (temp > arr[position]) {
                arr[i] = arr[position];
                arr[position] = temp;
                position++;
            }
        }
        return arr;
    }

    @Test
    public void test2() {
        String str = "Hello World";
        str.toUpperCase();
        str.substring(6,11);
        System.out.println(str);
    }
}

