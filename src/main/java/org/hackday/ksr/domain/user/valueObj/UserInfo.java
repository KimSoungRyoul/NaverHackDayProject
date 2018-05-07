package org.hackday.ksr.domain.user.valueObj;


import lombok.*;
import org.hackday.ksr.domain.user.UserAccount;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserInfo {

    //UserInfo 기본키는 userEmail;
    private UserAccount infoOwner;

    private String nickName;
    //본인 확인 이메일
    private String email;
    private String phoneNum;









}
