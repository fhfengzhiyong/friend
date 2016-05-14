package com.straw.friend.dao;

import org.springframework.stereotype.Repository;

import com.straw.friend.bean.OaRoleResourcePrivilege;
@Repository 
public interface OaRoleResourcePrivilegeDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    int insert(OaRoleResourcePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    int insertSelective(OaRoleResourcePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    OaRoleResourcePrivilege selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OaRoleResourcePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_role_resource_privilege
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OaRoleResourcePrivilege record);
}