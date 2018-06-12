package org.hackday.backend.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.hackday.backend.domain.Groups;

@Mapper
public interface GroupsMapper {

  void insert(Groups groups);

  List<Groups> selectList(String userId);


}
