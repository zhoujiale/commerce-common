package io.github.zhoujiale.commerce.common.enums;

/**
 * 认证异常
 **/
public enum AuthErrorEnum implements BaseStatusType {

    UN_KNOWN_ACCOUNT(4000, "账号不存在"),
    ERROR_CREDENTIALS(4001, "账号或密码错误"),
    LOCK_ACCOUNT(4002, "账号被锁定"),
    AUTH_ERROR(4003, "认证异常"),
    NEED_LOGIN(4004,"未登录或登录过期"),
    NEED_PERMISSION(4005,"该账号没有这项操作权限"),
    ACCOUNT_EXPIRE(4006,"账号过期"),
    PROVIDER_NOT_FOUND(4007,"认证方式不支持"),
    DISABLE_ERROR(4008,"账号被禁用"),
    AUTH_SERVICE_ERROR(4009,"认证服务异常"),
    CREDENTIALS_EXPIRE(4010,"凭证过期"),
    PERMISSION_REFUSE(4011,"当前账号没有该项操作权限"),
    TOKEN_EMPTY(4012, "缺少令牌"),
    JWT_PARSE_ERROR(4013, "jwt解析错误"),
    JWT_VERIFY_ERROR(4014, "jwt验证错误"),
    JWT_EXPIRE(4015, "jwt过期"),
    JWT_COMPLETE(4016, "jwt不完整"),
    PHONE_NUMBER_REPEAT(4017,"手机号已被使用"),
    REGISTER_ERROR(4018, "注册用户失败"),
    TWO_PASSWORD_NOT_MATCH(4019,"两次输入的密码不一致"),
    UPDATE_PASSWORD_ERROR(4020, "更新密码失败");

    private final Integer code;

    private final String msg;

    AuthErrorEnum(Integer code, String msg) {
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
