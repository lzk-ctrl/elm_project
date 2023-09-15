package com.neusoft.elmboot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.elmboot.po.User;

@Mapper
public interface UserMapper {
	@Select("select * from user where userId=#{userId} and password=#{password}")
	public User getUserByIdByPass(User user);
	@Select("select * from user where userId=#{userId}")
	public User getUserByid(String userId);
	@Select("select count(*) from user where userId=#{userId}")
	public int getUserById(String userId);

	@Insert("insert into user values(#{userId},#{password},#{userName},#{userSex},null,1,0,0)")
	public int saveUser(User user);
	@Update("update user set password=#{password},userName=#{userName},userSex=#{userSex},points=#{points},count=#{count} where userId=#{userId}")
	public int updateUser(User user);
	
	
}