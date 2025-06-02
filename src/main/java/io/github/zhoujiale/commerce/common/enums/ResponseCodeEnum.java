package io.github.zhoujiale.commerce.common.enums;

import lombok.Getter;

/**
 * 响应码
 */
@Getter
public enum ResponseCodeEnum {

    SUCCESS(200),
    FAIL(500),
    PARAM_ERROR(400)
    ;
    private final int code;

    ResponseCodeEnum(int code) {
        this.code = code;
    }
}
