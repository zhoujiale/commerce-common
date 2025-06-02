package io.github.zhoujiale.commerce.common.enums;

/**
 * 异常错误码
 */
public enum SystemErrorEnum implements BaseStatusType{

    USER_NOT_FOUND(5001, "用户不存在"),
    USER_AND_PASSWORD_ERROR(5002, "用户名或密码错误"),
    USER_LOCKED(5003, "用户已被锁定"),
    DEPARTMENT_NAME_REPEAT(5004, "部门名称重复"),
    DEPARTMENT_PARENT_IS_NULL(5005, "部门父级不存在"),
    ADD_DEPARTMENT_ERROR(5006, "添加部门异常"),
    MODIFY_DEPARTMENT_ERROR(5007, "编辑部门异常"),
    DELETE_DEPARTMENT_ERROR(5008, "删除部门异常"),
    DEPARTMENT_HAS_CHILD(5009, "部门下含有子部门，不允许删除"),
    MENU_NAME_REPEAT(5010, "菜单名称重复"),
    MENU_PARENT_IS_NULL(5011, "菜单父级不存在"),
    ADD_MENU_ERROR(5012, "添加菜单失败"),
    MENU_IS_NULL(5013, "菜单不存在"),
    MODIFY_MENU_ERROR(5014, "编辑菜单失败"),
    MENU_HAS_CHILDREN(5015, "菜单下存在子菜单，请先删除子菜单"),
    DELETE_MENU_ERROR(5016, "删除菜单失败"),
    ROLE_NAME_IS_REPEAT(5017, "角色名称重复"),
    ADD_ROLE_ERROR(5018, "添加角色失败"),
    ROLE_IS_NULL(5019,"角色不存在"),
    MODIFY_ROLE_ERROR(5020, "编辑角色失败"),
    DELETE_ROLE_ERROR(5021, "删除角色失败"),
    ADD_USER_ERROR(5022,"添加用户失败"),
    MODIFY_USER_ERROR(5023, "编辑用户失败"),
    DELETE_USER_ERROR(5024, "删除用户失败"),
    DELETE_ME_ERROR(5025, "不能删除自己"),
    DELETE_ADMIN_ERROR(5026, "只有超管可以删除超管"),
    MODIFY_ADMIN_ERROR(5027, "不能编辑超管"),
    REQUEST_ERROR(5028,"请求异常"),
    DICT_EMPTY(5029, "查询不到字典");

    private final int code;

    private final String msg;

    SystemErrorEnum(int code, String msg) {
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
