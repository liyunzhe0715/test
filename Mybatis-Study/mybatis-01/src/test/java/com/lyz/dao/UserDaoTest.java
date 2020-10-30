package com.lyz.dao;

import com.lyz.pojo.User;
import com.lyz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author liyunzhe
 * @create 2020-10-29
 */
public class UserDaoTest {

    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            //方式二：
            List<User> userList1 = sqlSession.selectList("com.lyz.dao.UserDao.getUserList");

            for (User user : userList1) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }



    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(4, "哈哈", "123321");
        int i = mapper.addUser(user);
        if(i>0){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(4, "hehe", "123321");
        int i = mapper.updateUser(user);
        if(i>0){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.deleteUser(4);
        if(i>0){
            System.out.println("删除成功");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
