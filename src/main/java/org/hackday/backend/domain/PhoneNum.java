package org.hackday.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNum {

  private long phoneSerialNum;
  private String phoneNumber;
  private PhoneType phoneType;
}
