package _基本算法.matrix;

import java.util.Arrays;

public class Mtrix {

    // 向量点乘
    public static double dot(double[] x, double[] y) {
        // 判断向量长度
        if (x.length != y.length) {
            throw new IllegalArgumentException("向量长度必须相同");
        }
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }

    // 矩阵和矩阵之积
    static double[][] mult(double[][] a, double[][] b) {
        // 矩阵相乘注意：
        //          1.第一个矩阵的列数必须是等于第二个矩阵的行数
        //          2.相乘的结果具有第一个矩阵的行数和第二个矩阵的列数
        //根据上所述，先判断第一个参数的列是否等于第二个参数的行
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("第一个矩阵的列必须是第二个矩阵的行");
        }
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // 转置矩阵
    static double[][] transpose(double[][] a) {
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[j][i];
            }
        }
        return result;
    }

    // 标量和矩阵之积
    static double[][] mult(double a,double[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = x[i][j] * a;
            }
        }
        return x;
    }

    // 矩阵和向量之积
    static double[] mult(double[][] a,double[] x) {
        if (x.length != a[0].length) {
            throw new IllegalArgumentException("向量和矩阵的维度不兼容/矩阵的列数必须等于向量的行数");
        }
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                result[i] += a[i][j] * x[j];
            }

        }
        return result;
    }

    // 向量和矩阵之积
    static double[] mult(double[] y, double[][] a) {
        if (y.length != a.length) {
            throw new IllegalArgumentException("向量和矩阵的维度不兼容/矩阵的列数必须等于向量的行数");
        }
        double[] result = new double[a[0].length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i] += a[j][i] * y[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x = {3.0,4.0, 2.0};
        double[][] k = {
                {3.0,4.0, 2.0}
        };
        double[] y = {4.0, 5.0, 6.0};
        double[][] a = {
                {13,9,7,15},
                {8,7,4,6},
                {6,4,0,3}
        };

        double[][] a1 = {
                {1,2,3},
                {4,5,6}
        };
        double[][] a2 = {
                {7,8},
                {9,10},
                {11,12}
        };
        System.out.println("向量点乘 = " + dot(x,y));
        System.out.println("矩阵和矩阵之积 = " + Arrays.deepToString(mult(a1, a2)));
        System.out.println("转置矩阵 = " + Arrays.deepToString(transpose(a1)));
        System.out.println("标量和矩阵之积 = " + Arrays.deepToString(mult(2, a2)));
        System.out.println("矩阵和向量之积 = " + Arrays.toString(mult(a1,x)));
        System.out.println("向量和矩阵之积 = " + Arrays.toString(mult(x,a)));
    }
}

