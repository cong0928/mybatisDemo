package com.lxc;

import com.lxc.dao.UserMapper;
import com.lxc.pojo.User;
import com.lxc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUser {
    @Test
    public void testUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }


    @Test
    public void TestUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertUser(new User(8,"ggg","456456"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"ddd0","456789"));
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(8);
        sqlSession.commit();
        sqlSession.close();

    }
}
