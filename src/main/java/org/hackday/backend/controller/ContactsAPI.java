package org.hackday.backend.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hackday.backend.controller.dto.CompanyDTO;
import org.hackday.backend.controller.dto.ContactDTO;
import org.hackday.backend.domain.Contact;
import org.hackday.backend.domain.PhoneNum;
import org.hackday.backend.domain.PhoneType;
import org.hackday.backend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/{userId}/contacts")
@CrossOrigin("*")
public class ContactsAPI {


  @Autowired
  private ContactService contactService;

  @GetMapping
  public ResponseEntity<List<Contact>> getContacts(@PathVariable("userId") String userId) {
    List<ContactDTO> contacts = new LinkedList<>();

    List<PhoneNum> phoneNums = new ArrayList<>();
    PhoneNum phoneNum = new PhoneNum();
    phoneNum.setPhoneNumber("010-7237-6602");
    phoneNum.setPhoneType(PhoneType.CELLPHONE);
    phoneNums.add(phoneNum);

    PhoneNum phoneNum2 = new PhoneNum();
    phoneNum2.setPhoneNumber("023-432-0429");
    phoneNum2.setPhoneType(PhoneType.HOME);

    List<String> hashTagList = new ArrayList<>();
    hashTagList.add("곱슬머리");
    hashTagList.add("대학4학년");

    List<CompanyDTO> companies = new ArrayList<>();

    CompanyDTO company = new CompanyDTO();

    company.setAddressInCompany("중랑구 상봉동");
    company.setDepartmentInCompany("네이버");
    company.setPositionInCompany("사원");

    companies.add(company);

    List<String> groups = new ArrayList<>();

    groups.add("회사 동료");
    groups.add("학교친구");

    List<String> emails = new ArrayList<>();

    emails.add("rlatjduf510@naver.com");
    emails.add("KimSoungRyoul@gmail.com");

    ContactDTO contact =
        ContactDTO.builder()
            .name("김성렬")
            .viewCnt(13)
            .phoneNums(phoneNums)
            .belongsGroups(groups)
            .hashTagList(hashTagList)
            .companyInfos(companies)
            .emails(emails)
            .build();

    contacts.add(contact);
    contacts.add(contact);

    ResponseEntity entity = new ResponseEntity(contacts, HttpStatus.OK);

    return entity;
  }

  @PostMapping
  public ResponseEntity<String> postContacts(
      @PathVariable("userId") String userId, @RequestBody ContactDTO contact) {

    contactService.registerContact(contact.convertEntity(userId));

    ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);

    return entity;
  }

  @PutMapping("/{contactId}")
  public ResponseEntity<String> putContact(
      @PathVariable("userId") String usrerId, @PathVariable("contactId") String contactId) {
    return null;
  }

  @DeleteMapping("/{contactId}")
  public ResponseEntity<String> deleteContact(
      @PathVariable("userId") String userId, @PathVariable("contactId") String contactId) {
    return null;
  }
}
