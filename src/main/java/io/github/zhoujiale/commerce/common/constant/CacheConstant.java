package io.github.zhoujiale.commerce.common.constant;

/**
 * 缓存
 */
public interface CacheConstant {

    /**
     * 统一前缀
     **/
    String CACHE_NAMESPACE = System.getenv().getOrDefault("CACHE_NAMESPACE","commerce:");

    String SYS_DICT = "sys_dict:";

    static String getCacheKey(String key){
        return CACHE_NAMESPACE + key;
    }

}
