package org.hackday.ksr.domain.User;


import lombok.*;

@Getter(AccessLevel.PRIVATE)
@Setter()
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserAccount {


    private String email;
    private String password;

    private String username;
    private String phoneNum;



}
