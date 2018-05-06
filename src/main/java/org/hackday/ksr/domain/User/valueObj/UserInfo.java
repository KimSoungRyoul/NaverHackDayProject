package org.hackday.ksr.domain.User.valueObj;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hackday.ksr.domain.User.UserAccount;

@Getter(AccessLevel.PRIVATE)
@Setter
public class UserInfo {

    //UserInfo 기본키는 userEmail;
    private UserAccount infoOwner;

    private String nickName;
    //본인 확인 이메일
    private String email;
    private String phoneNum;









}
