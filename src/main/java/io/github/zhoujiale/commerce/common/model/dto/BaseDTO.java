package io.github.zhoujiale.commerce.common.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import io.github.zhoujiale.commerce.common.model.vo.AuthUserVO;

/**
 * 基础传输类
 */
@Data
@Schema(description = "基础传输类")
public class BaseDTO {

    @Schema(description = "ID",hidden = true)
    protected Long id;

    @Schema(description = "操作者",hidden = true)
    protected String operator = "admin";

    @Schema(hidden = true)
    public void setAuthUser(AuthUserVO authUserVO){
        this.id = authUserVO.getId();
        this.operator = authUserVO.getUsername();
    }

    public void listToStr(){
        throw new RuntimeException("请实现列表转字符串");
    }
}
