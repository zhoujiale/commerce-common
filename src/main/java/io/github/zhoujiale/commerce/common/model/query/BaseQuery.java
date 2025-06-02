package io.github.zhoujiale.commerce.common.model.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 基本查询
 */
@Data
@Schema(description = "基本查询")
public class BaseQuery {

    /**
     * 页号
     **/
    @Schema(description = "页号")
    protected Integer pageNum;
    /**
     * 每页大小
     **/
    @Schema(description = "大小")
    protected Integer pageSize;
}
