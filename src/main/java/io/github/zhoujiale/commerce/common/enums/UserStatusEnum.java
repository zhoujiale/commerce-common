package io.github.zhoujiale.commerce.common.enums;

/**
 * 用户状态
 */
public enum UserStatusEnum implements BaseStatusType{

    NORMAL(1,"正常"),
    LOCKED(2,"禁用")
    ;

    private final Integer code;

    private final String msg;

    UserStatusEnum(Integer code, String msg) {
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
