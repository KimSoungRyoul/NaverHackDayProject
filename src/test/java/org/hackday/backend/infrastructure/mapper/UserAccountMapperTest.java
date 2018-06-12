package org.hackday.backend.infrastructure.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import org.apache.ibatis.session.SqlSession;
import org.hackday.backend.domain.UserAccount;
import org.hackday.backend.mapper.UserAccountMapper;
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

        accountMapper.insert(
            new UserAccount("sky5367@naver.com", "1234", "nickName1123", null, null, new Date()));

        UserAccount account=accountMapper.selectOne("sky5367@naver.com");

        assertNotNull(account);


    }


}
