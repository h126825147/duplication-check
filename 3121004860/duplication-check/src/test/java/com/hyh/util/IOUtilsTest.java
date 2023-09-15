package com.hyh.util;

import org.junit.Test;

public class IOUtilsTest {
    @Test
    public void readFileContentTest1() {
        // 读取文本内容测试
        IOUtils.readFileContent("D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\resources\\orig.txt");
    }

    @Test
    public void readFileContentTest2() {
        // 读取文本内容测试
        IOUtils.readFileContent("orig.txt");
    }

    @Test
    public void writeFileContentTest() {
        // 写入文本内容测试
        IOUtils.writeFileContent("D:\\HYHAO\\Documents\\duplication-check\\3121004860\\duplication-check\\src\\main\\resources\\target.txt", "hello");
    }

}
