package com.straw.friend.dao;

import com.straw.friend.bean.OaRoleResource;

public interface OaRoleResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    int insert(OaRoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    int insertSelective(OaRoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    OaRoleResource selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OaRoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OaRoleResource record);
}