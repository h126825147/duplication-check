package com.hyh;

import com.hyh.util.CheckUtils;
import com.hyh.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger LOGGER = LoggerFactory.getLogger("Main.class");
    public static void main(String[] args) {
        // 对命令行输入的参数进行筛选
        if (args.length != 3) {
            LOGGER.error("命令行输入参数个数有误...");
        } else {
            for (String arg : args) {
                if (!arg.endsWith("txt")) {
                    LOGGER.error("命令行输入参数文本类型有误...");
                    return;
                }
            }
        }

        // 计算相似度并写入target文件中
        double result = CheckUtils.calculateSimilarity(IOUtils.readFileContent(args[0]), IOUtils.readFileContent(args[1]));
        String message = "文件 " + args[1] + " 查重率为：" + String.format("%.2f", result);
        System.out.println(message);
        IOUtils.writeFileContent(args[2], message);


    }
}