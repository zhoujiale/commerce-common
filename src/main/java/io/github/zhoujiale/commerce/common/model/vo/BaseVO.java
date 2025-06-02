package io.github.zhoujiale.commerce.common.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 基础响应类
 */
@Data
@Schema(description = "基础响应")
public class BaseVO implements Serializable {

    public void strToList(){
        throw new RuntimeException("请实现字符串转列表");
    }
}
