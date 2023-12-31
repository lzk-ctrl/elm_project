package com.neusoft.elmboot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.elmboot.po.Business;

@Mapper
public interface BusinessMapper {
	@Select("select * from business where orderTypeId=#{orderTypeId} order by businessId")
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

	@Select("select * from business where businessId=#{businessId}")
	public Business getBusinessById(Integer businessId);
	
	@Select("select * from business where businessName like #{businessName}")
	public List<Business> listBusinessByKey(String businessName);
	
	@Update("update business set rankk=#{rankk} where businessId=#{businessId}")
	public int updateBusiness(Business business);
	@Select("SELECT * FROM business ORDER BY rankk DESC")
	public List<Business> listBusinessByRankkDescending();

}
