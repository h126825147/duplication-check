package com.hyh;

import com.hyh.util.IOUtils;

public class Main {
    public static void main(String[] args) {
        String orig = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\orig.txt";
        String target = "D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\java\\target.txt";
        System.out.println(IOUtils.readFileContent(orig));
        IOUtils.writeFileContent(target, "hello");
    }
}