package io.github.zhoujiale.commerce.common.util;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * 序列号工具类
 */
@Slf4j
public class SerialNoUtil {

    /**
     * 生成序列号
     * @param key 关键字
     * @param prefix 前缀
     * @return string
     */
    public static String generateSerialNo(String key,String prefix){
        final int size = 32;
        String formatDatetime = DateUtil.formatDatetime(LocalDateTime.now(), "yyyyMMddHHmmssSSS");
        String sn = prefix + formatDatetime;
        int diffSize = size - sn.length();
        return sn + String.format("%0" + diffSize + "d", Integer.parseInt(key));
    }

}
