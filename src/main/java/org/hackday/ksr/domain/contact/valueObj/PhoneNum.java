package org.hackday.ksr.domain.contact.valueObj;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "PhoneNum",description = "전화번호VO")
public class PhoneNum {

    @JsonIgnore
    private Long id;

    @ApiModelProperty(value="전화번호 유형",dataType = "String",example = "CELLPHONE"
            ,allowableValues = "HOME,COMPANY,CELLPHONE,FAX,ETC",required = true)
    private PhoneType phoneType;

    @ApiModelProperty(value = "전화번호",dataType = "String",example = "010-7237-6602",required = true)
    private String phoneNumber;

}
