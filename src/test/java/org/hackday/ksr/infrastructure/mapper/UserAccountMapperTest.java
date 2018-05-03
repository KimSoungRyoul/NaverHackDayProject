package org.hackday.ksr.infrastructure.mapper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


import org.apache.ibatis.session.SqlSession;
import org.hackday.ksr.domain.User.UserAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Transactional
public class UserAccountMapperTest {

    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private UserAccountMapper accountMapper;


    @Test
    public void testSqlSessionIsNull(){

        assertNotNull(sqlSession);


    }

    @Test
    public void testInsert_Select(){

        accountMapper.insert(new UserAccount("sky5367@naver.com","1234","김성렬","010-7237-6602"));

        UserAccount account=accountMapper.selectOne("sky5367@naver.com");

        assertNotNull(account);


    }


}
