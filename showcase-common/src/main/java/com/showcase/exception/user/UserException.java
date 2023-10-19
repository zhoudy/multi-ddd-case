package com.showcase.exception.user;


import com.showcase.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
