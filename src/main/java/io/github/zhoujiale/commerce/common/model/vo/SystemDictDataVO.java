package io.github.zhoujiale.commerce.common.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 字典数据
 */
@Data
@Schema(description = "字典数据")
public class SystemDictDataVO {

    @Schema(description = "id")
    private Long id;

    @Schema(description = "字典id")
    private Long dictId;

    @Schema(description = "字典分组key")
    private String dictKey;

    @Schema(description = "字典分组名")
    private String dictName;

    @Schema(description = "字典名称")
    private String dictDataName;

    @Schema(description = "字典值")
    private String dictData;

    private Integer sortNumber;
}
