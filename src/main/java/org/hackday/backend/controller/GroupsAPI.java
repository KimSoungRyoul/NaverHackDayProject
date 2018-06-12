package org.hackday.backend.controller;

import java.util.List;
import org.hackday.backend.domain.Groups;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/{userId}")
public class GroupsAPI {

  @GetMapping("/groups")
  public ResponseEntity<List<Groups>> getGroups(@PathVariable("userId") String userId) {
    ResponseEntity<List<Groups>> entity = null;

    return entity;
  }

  @PutMapping("/groups/{groupName}")
  public ResponseEntity<List<Groups>> putGroups(
      @PathVariable("userId") String userId, @PathVariable("groupName") String groupName) {
    ResponseEntity<List<Groups>> entity = null;

    return entity;
  }

  @PostMapping("/groups")
  public ResponseEntity<String> postGroups(@PathVariable("userId") String userId) {
    ResponseEntity<String> entity = null;

    return entity;
  }

  @DeleteMapping("/groups/{groupName}")
  public ResponseEntity<String> deleteGroups(
      @PathVariable("userId") String userId, @PathVariable("groupName") String groupName) {

    return null;
  }
}
