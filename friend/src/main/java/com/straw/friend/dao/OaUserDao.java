package com.straw.friend.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.straw.friend.bean.OaUser;
@Repository 
public interface OaUserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    int insert(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    int insertSelective(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    OaUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OaUser record);
    
	Set<String> findRoles(String username);
	Set<String> findPermissions(String username);
	OaUser findByUsername(String username);
}