package io.github.zhoujiale.commerce.common.response;

import io.github.zhoujiale.commerce.common.enums.ResponseCodeEnum;

/**
 * 统一响应类
 * @param code 响应码
 * @param msg 信息
 * @param data 数据
 */
public record WebResponse<T>(int code,String msg,T data) {

    public static <T> WebResponse<T> success(T data){
       return new WebResponse<>(ResponseCodeEnum.SUCCESS.getCode(), "成功",data);
    }

    public static WebResponse<Void> success(){
        return success(null);
    }

    public static WebResponse<Void> fail(int code,String msg){
        return new WebResponse<>(code,msg,null);
    }

    public static WebResponse<Void> fail(){
        return fail(ResponseCodeEnum.FAIL.getCode(), "服务器异常");
    }

}
