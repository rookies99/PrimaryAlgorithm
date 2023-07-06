package _基本算法;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.UUID;

public class Recursion {

    /**
     * 测试结果
     */
    @Test
    public void test1() {
//        sumByRecursion(5);
        System.out.println("factorialRecursion(2) = " + factorialRecursion(3));
        String directory = "D:\\Desktop\\test";
        findDirectories(directory);
    }

    /**
     * 递归输出倒序 *
     * @param i
     */
    public void sumByRecursion(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
        if (i == 1) {
            return;
        }
        sumByRecursion(--i);
    }

    /**
     * 递归 求阶乘
     * @param i
     * @return
     */
    public int factorialRecursion(int i) {
        if (i == 1) {
            return i;
        } else {
            return i*factorialRecursion(--i);
        }
    }

    /**
     * 递归 获取指定目录下的所有文件夹
     * @param directory
     */
    public void findDirectories(String directory) {
        File rootDirectory = new File(directory);
        if (!rootDirectory.exists() || !rootDirectory.isDirectory()) {
            System.out.println("无效的目录路径：" + directory);
            return;
        }
        traverseFiles(rootDirectory);
    }

    public void traverseFiles(File rootDirectory) {
        File[] files = rootDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("file = " + file.getAbsolutePath());
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    String renamedFileName = uuid + getFileExtension(file.getName());
                    File renamedFile = new File(file.getParent(), renamedFileName);
                    if (file.renameTo(renamedFile)) {
                        System.out.println("Renamed File Path: " + renamedFile.getAbsolutePath());
                    } else {
                        System.out.println("Failed to rename file: " + file.getAbsolutePath());
                    }
                } else if (file.isDirectory()){
                    traverseFiles(file);
                }
            }
        }
    }

    /**
     * 获取文件扩展名
     * @param fileName
     */
    public String  getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex);
    }

}
