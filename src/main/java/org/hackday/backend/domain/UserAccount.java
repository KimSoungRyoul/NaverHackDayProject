package org.hackday.backend.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {

  private String userId;
  private String password;
  private String nickName;
  private String email;
  private String phoneNum;
  private Date signUpDate;
}
