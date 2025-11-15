package io.github.zhoujiale.commerce.common.enums;

/**
 * 基础错误枚举
 */
public enum BaseErrorEnum implements BaseStatusType{
    REQUEST_ERROR(5028,"请求异常"),
    ;

    private final Integer code;

    private final String msg;

    BaseErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
