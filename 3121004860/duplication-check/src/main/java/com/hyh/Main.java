package com.hyh;

import com.hyh.util.CheckUtils;
import com.hyh.util.IOUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // 定义一个抄袭论文集合
    private static final List<String> IMITS = new ArrayList<>();

    public static void main(String[] args) {
        String orig = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig.txt";
        String target = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\target.txt";
        String imit1 = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig_0.8_add.txt";
        String imit2 = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig_0.8_del.txt";
        String imit3 = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig_0.8_dis_1.txt";
        String imit4 = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig_0.8_dis_10.txt";
        String imit5 = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig_0.8_dis_15.txt";
        // 将抄袭论文添加到集合中
        Collections.addAll(IMITS, imit1, imit2, imit3, imit4, imit5);
        for (String imit : IMITS) {
            // 计算相似度并写入target文件中
            double result = CheckUtils.calculateSimilarity(IOUtils.readFileContent(orig), IOUtils.readFileContent(imit));
            String message = "文件 " + imit + " 查重率为：" + String.format("%.2f", result);
            System.out.println(message);
            IOUtils.writeFileContent(target, message);
        }
    }
}