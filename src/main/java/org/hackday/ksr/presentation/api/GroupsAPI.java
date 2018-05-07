package org.hackday.ksr.presentation.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hackday.ksr.domain.contact.valueObj.Group;
import org.hackday.ksr.presentation.dto.APIStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(description = "그룹 API")
public class GroupsAPI implements V1ApiMapping {


    @ApiOperation(value="그룹 목록을 조회합니다.",produces="application/json",response = Group.class)
    @ApiImplicitParams({

            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
   @GetMapping("/groups/{userId}")
    public ResponseEntity<List<Group>> GETGroups(@PathVariable("userId") String userId) {


        ResponseEntity<List<Group>> entity = null;

        return entity;
    }





    @ApiOperation(value="그룹 을 수정합니다.",produces="application/json",response = Group.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="groupName",dataType="String",
                    value="그룹의 이름입니다.",paramType="path"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PutMapping("/groups/{userId}/{groupName}")
    public ResponseEntity<List<Group>> PUTGroups(@PathVariable("userId") String userId, @PathVariable("groupName") String groupName) {


        ResponseEntity<List<Group>> entity = null;

        return entity;
    }


    @ApiOperation(value="그룹을 생성합니다",produces="application/json",response = Group.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="group",dataType="Group",
                    value="생성하고자하는 그룹 정보 입니다.",paramType="body"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @PostMapping("/groups/{userId}")
    public ResponseEntity<APIStatus> POSTGroups(@PathVariable("userId") String userId) {


        ResponseEntity<APIStatus> entity = null;

        return entity;
    }




    @ApiOperation(value="그룹을 삭제합니다.",produces="application/json",response = Group.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name="groupName",dataType="String",
                    value="삭제하고자하는 그룹의 이름입니다.",paramType="path"),
            @ApiImplicitParam(name="userId",dataType="String",
                    value="회원계정의 Id 입니다.",paramType="path")

    })
    @DeleteMapping("/groups/{userId}/{groupName}")
    public ResponseEntity<APIStatus> DELETEGroups(@PathVariable("userId") String userId, @PathVariable("groupName") String groupName) {

        return null;
    }


}
