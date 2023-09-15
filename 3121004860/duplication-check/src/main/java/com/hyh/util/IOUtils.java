package com.hyh.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class IOUtils {
    public static final Logger LOGGER = LoggerFactory.getLogger("Main.class");

    private IOUtils() {
    }

    /**
     * 读取文件内容
     *
     * @param filePath 文件路径
     * @return 文件内容
     */
    public static String readFileContent(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            LOGGER.error("文件读取失败...");
        }
        return content.toString();
    }

    /**
     * 写入文件内容
     *
     * @param filePath 文件路径
     * @param message  文件内容
     */
    public static void writeFileContent(String filePath, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            LOGGER.error("打开文件失败...");
        }
    }
}
