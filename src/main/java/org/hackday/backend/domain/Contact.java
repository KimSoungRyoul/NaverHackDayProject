package org.hackday.backend.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

  private long serialNum;

  private String name;

  private int viewCnt;

  private String contactOwnerId;

  private List<PhoneNum> phoneNums;

  private List<String> emails = new ArrayList<>();

  // 그룹이란 네이버 주소록에서 그룹과 같은걔념이다.

  private List<Groups> belongsGroups;

  // 그룹내 소속정보
  // 한 연락처는 여러 그룹에 속할수있다.
  // xx회사차장 이면서 yy학교 동기일수잇다.
  // InGroupINfo 란 네이버 주소록의 회사 소속+ 주소를 합친 걔념이다.

  private List<Company> companyInfos;

  private List<String> hashTagList = new ArrayList<>();
}
