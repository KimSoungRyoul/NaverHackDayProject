package org.hackday.ksr.presentation.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hackday.ksr.domain.contact.Contact;
import org.hackday.ksr.presentation.dto.APIStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "주소록 정리 서비스")
public class ContactServiceAPI implements V1ApiMapping{

    @ApiOperation(value="회원의 중복된 연락처를 분석합니다..",produces="application/json",response = Contact.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @GetMapping("/service/{userId}/contacts/duplicate")
    public ResponseEntity<List<Contact>> GETDuplicateContact(@PathVariable("userId")String userId){



        return null;
    }


    @ApiOperation(value="회원의 유사한 연락처를 분석합니다.",produces="application/json",response = Contact.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @GetMapping("/service/{userId}/contacts/similar")
    public ResponseEntity<List<Contact>> GETSimilarContact(@PathVariable("userId")String userId){



        return null;
    }


    @ApiOperation(value="회원의 중복된 연락처를 통합(수정)합니다",produces="application/json",response = APIStatus.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PutMapping("/service/{userId}/contacts/duplicate")
    public ResponseEntity<APIStatus> PUTDuplicateContact(@PathVariable("userId")String userId){



        return null;
    }


    @ApiOperation(value="회원의 유사한 연락처를 통합(수정)합니다",produces="application/json",response = APIStatus.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PutMapping("/service/{userId}/contacts/similar")
    public ResponseEntity<APIStatus> PUTSimilarContact(){



        return null;
    }

}
