package com.rec.springbootgeneratorformybatis.common.exception;

import com.rec.springbootgeneratorformybatis.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountNotExistException extends UsernameNotFoundException {

    public AccountNotExistException() {
        super(AppUtil.getMessage("accountNotExistException"));
    }

    public AccountNotExistException(String msg) {
        super(msg);
    }
}
