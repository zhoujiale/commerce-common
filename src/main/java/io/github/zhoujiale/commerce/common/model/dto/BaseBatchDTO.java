package io.github.zhoujiale.commerce.common.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 基础批量操作类
 */
@Data
@Schema(description = "基础批量操作类")
public class BaseBatchDTO {

    @Schema(description = "ID")
    protected List<Long> idList;


}
