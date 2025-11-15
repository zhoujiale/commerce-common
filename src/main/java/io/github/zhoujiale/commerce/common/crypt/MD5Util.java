package io.github.zhoujiale.commerce.common.crypt;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhou
 * @version 1.0
 * @className MD5Util
 * @description MD5摘要工具
 * @date 2021/01/08 19:21
 **/
@Slf4j
public class MD5Util {

    private static final String MD5 = "MD5";

    /**
     * @description md5加密
     * @create 2021/1/8 19:51
     * @param rawData  原始数据
     * @return java.lang.String
     **/
    public static String encrypt(String rawData){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MD5);
            messageDigest.update(rawData.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                stringBuilder.append(String.format("%02x",b));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            log.error(e.getMessage(),e);
            return StringUtils.EMPTY;
        }
    }
}
