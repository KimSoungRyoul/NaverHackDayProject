package org.hackday.ksr.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hackday.ksr.domain.contact.Contact;
import org.hackday.ksr.presentation.dto.APIStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;


@Api(value = "연락처 Api 입니다",description="연락처 API",consumes = "application/json")
@RestController
public class ContactsAPI implements V1ApiMapping {


    @ApiOperation(value="회원의 연락처 목록을 불러옵니다.",produces = "application/json",response = Contact.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="hashTag",dataType="String",
                    value="해쉬태그를 기반으로 조회합니다",paramType="query"),
            @ApiImplicitParam(name="groupName",dataType="String",
                    value="그룹이름을 기반으로 조회합니다.",paramType="query"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @GetMapping("/{userId}/contacts")
    public ResponseEntity<List<Contact>> GETContacts(@PathVariable("userId")String userId){

        List<Contact> contacts=new LinkedList<>();
        Contact contact=new Contact();
        contacts.add(contact);


        ResponseEntity entity=new ResponseEntity(contacts,HttpStatus.OK);





        return entity;
    }


    @ApiOperation(value="회원의 연락처 목록을 불러옵니다.",produces="application/json",response = APIStatus.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="contact",dataType="Contact",
                    value="등록하고자하는 연락처 정보 입니다.",paramType="body"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PostMapping("/{userId}/contacts")
    public ResponseEntity<APIStatus> POSTContacts(@PathVariable("userId")String userId){

        ResponseEntity<APIStatus> entity=new ResponseEntity<>(APIStatus.getSUCCESS("정상적인 요청"),HttpStatus.CREATED);



        return entity;

    }



    @ApiOperation(value="회원의 연락처를 수정합니다.",produces="application/json",response = APIStatus.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="contact",dataType="Contact",
                    value="등록하고자하는 연락처 정보 입니다.",paramType="body"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PutMapping("/{userId}/contacts/{contactId}")
    public ResponseEntity<APIStatus> PUTContact(@PathVariable("userId")String usrerId,@PathVariable("contactId")String contactId){



        return null;
    }


    @ApiOperation(value="회원의 연락처 목록을 불러옵니다.",produces="application/json",response = APIStatus.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="contactId",dataType="String",
                    value="삭제하고 연락처 Id 입니다.",paramType="path"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @DeleteMapping("/{userId}/contacts/{contactId}")
    public ResponseEntity<APIStatus> DELETEContact(@PathVariable("userId")String userId,@PathVariable("contactId")String contactId) {

        return null;
    }
}
