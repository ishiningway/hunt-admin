package com.hunt.service;

import com.hunt.model.dto.PageInfo;
import com.hunt.model.entity.SysRole;

/**
 * @Author ouyangan
 * @Date 2016/10/14/14:53
 * @Description
 */
public interface SysRoleService {
    boolean isExsitRoleName(String name);

    long insertRole(SysRole sysRole);

    void updateRole(SysRole sysRole);

    boolean isExsitRoleNameExcludeId(long id, String name);

    SysRole selectById(long id);

    PageInfo selectPage(int page, int row);
}
