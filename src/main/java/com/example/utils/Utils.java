package com.example.utils;

import java.util.UUID;

/**
 * @Description
 * @ClassName Utils
 * @Author User
 * @date 2020.04.17 22:50
 */
public class Utils {
    /**
     * @Description 生成随机id
     * @return {String} str
     * @Author zhen.ma
     * @Date 2020.04.18 8:58
     **/
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        return uuidStr;
    }
}
