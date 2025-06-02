package io.github.zhoujiale.commerce.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 登录认证用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class AuthUserVO extends BaseVO implements Serializable {

    private Long id;

    private String username;

    private Long roleId;

    private Long departmentId;

    private String roleName;

    private String departmentName;

    private Boolean isAdmin;
}
