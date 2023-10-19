package com.showcase.infrastructure.repository;

import com.showcase.domain.repository.ISysUserRepository;
import com.showcase.infrastructure.mysql.entity.SysUser;

import java.lang.reflect.Member;
import java.util.Optional;

/**
 * Repository的mysql实现
 *
 * @author zhoudy
 * @date 2023/10/18 10:19
 */
public class SysUserRepositoryMysqlImpl implements ISysUserRepository {

    @Override
    public Member byId(String id) {
        return null;
    }

    @Override
    public Optional<Member> byIdOptional(String id) {
        return Optional.empty();
    }

    @Override
    public Member byIdAndCheckTenantShip(String id, SysUser user) {
        return null;
    }

    @Override
    public void save(Member member) {

    }

    @Override
    public void delete(Member member) {

    }
}
