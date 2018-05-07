package org.hackday.ksr.presentation.dto;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ApiModel(value = "APIStatus",description = "API 요청 성공실패여부 정보 ")
public class APIStatus {

    @ApiModelProperty(value = "상태코드",dataType = "String",allowableValues = "SUCCESS,FAIL,NOPERMISSION",example = "NOPERMISSION")
    private StatusCode statusCode;

    @ApiModelProperty(value = "상태 설명 메시지",dataType = "String",example = "치잇 결계인가? 권한이 없어서 접근할수 없군..")
    private String message;



    public static APIStatus getNoPersission(String message){
        return new APIStatus(StatusCode.NOPERMISSION,message);
    }

    public static APIStatus getSUCCESS(String message){
        return new APIStatus(StatusCode.SUCCESS,message);
    }


    public static APIStatus getFAIL(String message){
        return new APIStatus(StatusCode.FAIL,message);

    }


}
