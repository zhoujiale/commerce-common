package io.github.zhoujiale.commerce.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * SQL工具类
 */
public class SQLUtil {

    public static String like(String property,LikeType likeType){
        if (StringUtils.isBlank(property)){
            return null;
        }
        switch (likeType){
            case FULL -> {
                return "%" + property + "%";
            }
            case PREFIX -> {
                return  "%" + property;
            }
            case SUFFIX -> {
                return property + "%";
            }
            default -> throw new IllegalStateException("Unexpected value: " + likeType);
        }
    }

    public enum LikeType {
        FULL,
        PREFIX,
        SUFFIX
    }
}
