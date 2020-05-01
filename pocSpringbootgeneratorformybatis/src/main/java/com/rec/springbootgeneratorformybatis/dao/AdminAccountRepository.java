package com.rec.springbootgeneratorformybatis.dao;

import com.rec.springbootgeneratorformybatis.entity.AdminAccount;
import org.springframework.data.repository.CrudRepository;

public interface AdminAccountRepository extends CrudRepository <AdminAccount, Long> {

    public AdminAccount findByAdminName(String adminName);

}
