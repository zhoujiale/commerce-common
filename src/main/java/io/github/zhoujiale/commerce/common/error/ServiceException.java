package io.github.zhoujiale.commerce.common.error;

import io.github.zhoujiale.commerce.common.enums.BaseStatusType;
import io.github.zhoujiale.commerce.common.enums.ResponseCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    public ServiceException(BaseStatusType baseStatusType){
        super(baseStatusType.getMsg());
        this.code = baseStatusType.getCode();
    }
}
