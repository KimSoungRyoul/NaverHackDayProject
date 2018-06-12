package org.hackday.backend.controller.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hackday.backend.domain.Company;
import org.hackday.backend.domain.Contact;
import org.hackday.backend.domain.Groups;
import org.hackday.backend.domain.PhoneNum;

@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO implements Serializable {

  private String name;

  private int viewCnt;

  private List<PhoneNum> phoneNums;

  private List<String> emails;

  private List<String> belongsGroups;

  private List<CompanyDTO> companyInfos;

  private List<String> hashTagList;

  public Contact convertEntity(String contactOwnerId) {

    Contact contact = new Contact();

    contact.setName(this.getName());
    contact.setViewCnt(this.getViewCnt());

    contact.setContactOwnerId(contactOwnerId);

    contact.setContactOwnerId(contactOwnerId);

    contact.setPhoneNums(this.getPhoneNums());
    contact.setEmails(this.getEmails());

    List<Groups> groupsList = new ArrayList<>();

    for (String groupName : this.belongsGroups) {

      Groups groups = new Groups();
      groups.setGroupName(groupName);

      groupsList.add(groups);
    }
    contact.setBelongsGroups(groupsList);

    List<Company> companyList = new ArrayList<>();

    for (CompanyDTO companyDTO : this.companyInfos) {

      Company company = new Company();
      company.setDepartmentInCompany(companyDTO.getDepartmentInCompany());
      company.setPositionInCompany(companyDTO.getPositionInCompany());
      company.setAddressInCompany(companyDTO.getAddressInCompany());

      companyList.add(company);
    }
    contact.setCompanyInfos(companyList);
    contact.setHashTagList(this.getHashTagList());

    return contact;
  }
}
