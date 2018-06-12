package org.hackday.backend.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.hackday.backend.domain.Company;
import org.hackday.backend.domain.Contact;
import org.hackday.backend.domain.PhoneNum;

@Mapper
public interface ContactMapper {

  void insert(Contact contact);

  void insertEmails(List<String> emails);

  void insertPhoneNums(List<PhoneNum> phonenums);

  void insertCompany(List<Company> companies);

  void insertHashTags(List<String> hashTagList);

  List<Contact> selectList(Contact contact);


}
