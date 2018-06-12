package org.hackday.backend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.hackday.backend.domain.UserAccount;

@Mapper
public interface UserAccountMapper {

  void insert(UserAccount userAccount);

  UserAccount selectOne(String userId);
}
