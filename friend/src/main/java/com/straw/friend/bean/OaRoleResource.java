package com.straw.friend.bean;

public class OaRoleResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_resource.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_resource.role_id
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_resource.resource_id
     *
     * @mbggenerated
     */
    private String resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_resource.id
     *
     * @return the value of oa_role_resource.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_resource.id
     *
     * @param id the value for oa_role_resource.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_resource.role_id
     *
     * @return the value of oa_role_resource.role_id
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_resource.role_id
     *
     * @param roleId the value for oa_role_resource.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_resource.resource_id
     *
     * @return the value of oa_role_resource.resource_id
     *
     * @mbggenerated
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_resource.resource_id
     *
     * @param resourceId the value for oa_role_resource.resource_id
     *
     * @mbggenerated
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }
}