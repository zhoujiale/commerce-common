package io.github.zhoujiale.commerce.common.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import io.github.zhoujiale.commerce.common.enums.AuthErrorEnum;
import io.github.zhoujiale.commerce.common.enums.ResponseCodeEnum;
import io.github.zhoujiale.commerce.common.enums.SystemErrorEnum;

/**
 * 服务异常类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException{

    private int code;

    public ServiceException(ResponseCodeEnum responseCodeEnum, String message) {
        super(message);
        this.code = responseCodeEnum.getCode();
    }

    public ServiceException(SystemErrorEnum systemErrorEnum){
        super(systemErrorEnum.getMsg());
        this.code = systemErrorEnum.getCode();
    }

    public ServiceException(AuthErrorEnum authErrorEnum){
        super(authErrorEnum.getMsg());
        this.code = authErrorEnum.getCode();
    }
}
