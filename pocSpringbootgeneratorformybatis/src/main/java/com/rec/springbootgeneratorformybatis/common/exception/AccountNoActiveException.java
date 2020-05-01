package com.rec.springbootgeneratorformybatis.common.exception;

import com.rec.springbootgeneratorformybatis.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AccountNoActiveException extends UsernameNotFoundException {

    public AccountNoActiveException() {
        super(AppUtil.getMessage("accountNoActiveException"));
    }
    public AccountNoActiveException(String msg) {
        super(msg);
    }
}
