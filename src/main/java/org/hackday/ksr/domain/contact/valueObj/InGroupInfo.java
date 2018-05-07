package org.hackday.ksr.domain.contact.valueObj;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "InGroupInfo",description = "소속된 그룹의 개인정보")
public class InGroupInfo {

    @JsonIgnore
    private Long inGroupInfoId;

    //해당 그룹(조직) 내 소속 부서
    @ApiModelProperty(value = "해당 그룹(조직)내 소속부서",dataType = "String",example = "웍스모바일팀",required = true)
    private String departmentInGroup;

    //해당 그룹(조직) 내 소속 직책
    @ApiModelProperty(value = "해당 그룹(조직)내 소속직책",dataType = "String",example = "웍스모바일 최고위원장")
    private String positionInGroup;

    //해당 그룹(조직) 내 주소 ex)회사면 회사주소 , 가족이면 가족주소
    @ApiModelProperty(value = "해당 그룹(조직)의 주소 ",dataType = "String",example = "분당시 그어디냐동 그초록건물 1903호")
    private String addressInGroup;
}
