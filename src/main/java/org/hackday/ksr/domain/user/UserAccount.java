package org.hackday.ksr.domain.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@ApiModel(description = "회원 계정인증정보")
public class UserAccount {

    @ApiModelProperty(value = "계정의 이메일",dataType = "String",example = "sky5367")
    private String id;

    @JsonIgnore
    private String password;

    @ApiModelProperty(value = "회원가입한날짜",dataType = "Date",example = "2018-04-12 08:13:11")
    private Date signUpDate;




}
