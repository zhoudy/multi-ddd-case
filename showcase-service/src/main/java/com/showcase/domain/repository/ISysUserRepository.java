package com.showcase.domain.repository;

import com.showcase.infrastructure.mysql.entity.SysUser;

import java.lang.reflect.Member;
import java.util.Optional;

public interface ISysUserRepository {
    Member byId(String id); //返回聚合根

    Optional<Member> byIdOptional(String id); //返回聚合根

    Member byIdAndCheckTenantShip(String id, SysUser sysUser); //返回聚合根

    void save(Member member); //聚合根作为参数

    void delete(Member member); //聚合根作为参数
}