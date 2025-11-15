package io.github.zhoujiale.commerce.common.crypt;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhou
 * @version 1.0
 * @className SHAUtil
 * @description sha工具
 * @date 2021/01/08 19:56
 **/
@Slf4j
public class SHAUtil {

    private static final String SHA1 = "SHA";

    private static final String SHA256 = "SHA-256";

    private static final String SHA512 = "SHA-512";

    /**
     * @description sha加密
     * @created  2021/1/9 19:42
     * @param rawData 明文
     * @param algorithm 算法
     * @return java.lang.String
     **/
    public static String encrypt(String rawData,final String algorithm){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(rawData.getBytes());
            byte[] bytes = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : bytes) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) stringBuilder.append('0');
                stringBuilder.append(hex);
            }
            return stringBuilder.toString();
        }catch (NoSuchAlgorithmException e){
            log.error(e.getMessage(),e);
            return StringUtils.EMPTY;
        }
    }

}
