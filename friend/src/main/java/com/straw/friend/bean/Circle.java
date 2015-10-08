package com.straw.friend.bean;

import java.util.UUID;

public class Circle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle.Id
     *
     * @mbggenerated
     */
    private String id = UUID.randomUUID().toString();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle.account
     *
     * @mbggenerated
     */
    private Integer account ;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle.creater
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle.password
     *
     * @mbggenerated
     */
    private String password;
    private String content;
    

    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle.Id
     *
     * @return the value of circle.Id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle.Id
     *
     * @param id the value for circle.Id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle.account
     *
     * @return the value of circle.account
     *
     * @mbggenerated
     */
    public Integer getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle.account
     *
     * @param account the value for circle.account
     *
     * @mbggenerated
     */
    public void setAccount(Integer account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle.name
     *
     * @return the value of circle.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle.name
     *
     * @param name the value for circle.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle.creater
     *
     * @return the value of circle.creater
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle.creater
     *
     * @param creater the value for circle.creater
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle.password
     *
     * @return the value of circle.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle.password
     *
     * @param password the value for circle.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}