package org.hackday.backend.service;

import org.hackday.backend.domain.Contact;
import org.hackday.backend.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactService {

  @Autowired
  private ContactMapper contactMapper;

  @Transactional
  public void registerContact(Contact contact) {

    contactMapper.insert(contact);

    if (contact.getEmails() != null) {
      contactMapper.insertEmails(contact.getEmails());
    }

    if (contact.getHashTagList() != null) {
      contactMapper.insertHashTags(contact.getHashTagList());
    }

    if (contact.getPhoneNums() != null) {
      contactMapper.insertPhoneNums(contact.getPhoneNums());
    }

    if (contact.getCompanyInfos() != null) {
      contactMapper.insertCompany(contact.getCompanyInfos());
    }
  }
}
