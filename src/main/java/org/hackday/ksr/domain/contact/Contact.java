package org.hackday.ksr.domain.contact;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hackday.ksr.domain.contact.valueObj.Group;
import org.hackday.ksr.domain.contact.valueObj.InGroupInfo;
import org.hackday.ksr.domain.contact.valueObj.PhoneNum;

import java.util.List;



@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "연락처",value = "Contact")
public class Contact {

    @JsonIgnore
    private Long serialNum;


    @ApiModelProperty(value = "이름", dataType = "String",example = "김성렬")
    private String name;

    @ApiModelProperty(value = "폰번호 목록",dataType = "Array")
    private List<PhoneNum> phoneNums;

    @ApiModelProperty(value = "이메일 목록", dataType = "Array" )
    private List<String> emails;


    //그룹이란 네이버 주소록에서 그룹과 같은걔념이다.
    @ApiModelProperty(value = "소속된 그룹(조직)목록", dataType = "Group" )
    private List<Group> group;

    //그룹내 소속정보
    //한 연락처는 여러 그룹에 속할수있다.
    // xx회사차장 이면서 yy학교 동기일수잇다.
    //InGroupINfo 란 네이버 주소록의 회사 소속+ 주소를 합친 걔념이다.
    @ApiModelProperty(value = "소속된 그룹(조직)의 개인정보", dataType = "inGroupInfo" )
    private List<InGroupInfo> inGroupInfos;

    @ApiModelProperty(value = "해쉬 태그 목록", dataType = "Array")
    private List<String> hashTagList;

}
