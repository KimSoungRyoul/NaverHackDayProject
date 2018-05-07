package org.hackday.ksr.domain.contact.valueObj;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hackday.ksr.domain.user.UserAccount;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Group",description = "그룹,조직 또는 폴더를 의미한다.")
public class Group {


    //기본키
    @JsonIgnore
    private Long groupId;


    // groupName+ groupOwner.email  (복합키)는  고유해야한다 .
    @ApiModelProperty(value = "그룹명",dataType = "String",example = "네이버",required = true)
    private String groupName;

    @ApiModelProperty(value = "생성순서",dataType = "Long",example = "3",required = true)
    private Long regNum;

    //@ApiModelProperty(value = "그룹을 소유 계정",dataType = "UserAccount")
    @JsonIgnore
    private UserAccount groupOwner;



}
