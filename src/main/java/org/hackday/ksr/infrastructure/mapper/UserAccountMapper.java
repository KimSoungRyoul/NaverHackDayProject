package org.hackday.ksr.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.hackday.ksr.domain.User.UserAccount;

@Mapper
public interface UserAccountMapper {

    void insert(UserAccount userAccount);

    UserAccount selectOne(String email);


}
