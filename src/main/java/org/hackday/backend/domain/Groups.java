package org.hackday.backend.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groups {

  private long groupId;

  // groupName+ groupOwner.email  (복합키)는  고유해야한다 .
  private String groupName;

  private String groupOwnerId;

  private List<Contact> contactList;
}
