package org.hackday.backend.controller.dto;


import lombok.Data;

@Data
public class CompanyDTO {

  // 해당 그룹(조직) 내 소속 부서
  private String departmentInCompany;

  // 해당 그룹(조직) 내 소속 직책
  private String positionInCompany;

  // 해당 그룹(조직) 내 주소 ex)회사면 회사주소 , 가족이면 가족주소
  private String addressInCompany;

}
