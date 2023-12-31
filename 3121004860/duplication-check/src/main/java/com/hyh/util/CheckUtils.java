package com.hyh.util;

public class CheckUtils {
    /**
     * 计算字符串相似度，使用 Levenshtein 距离算法
     *
     * @param origContent 原论文
     * @param imitContent 抄袭论文
     * @return 相似度
     */
    public static double calculateSimilarity(String origContent, String imitContent) {
        int origLength = origContent.length();
        int addLength = imitContent.length();
        int[][] dp = new int[origLength + 1][addLength + 1];

        for (int i = 0; i <= origLength; i++)
            dp[i][0] = i;

        for (int j = 0; j <= addLength; j++)
            dp[0][j] = j;

        for (int i = 1; i <= origLength; i++) {
            for (int j = 1; j <= addLength; j++) {
                int cost = (origContent.charAt(i - 1) == imitContent.charAt(j - 1)) ? 0 : 1;
                // 状态转移方程
                dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost));
            }
        }

        int distance = dp[origLength][addLength];
        return 1 - (double) distance / Math.max(origLength, addLength);
    }
}
