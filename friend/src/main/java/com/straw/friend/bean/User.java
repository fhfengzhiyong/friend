package com.straw.friend.bean;

import java.util.Date;
import java.util.UUID;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Id
     *
     * @mbggenerated
     */
    private String id = UUID.randomUUID().toString();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Deviceid
     *
     * @mbggenerated
     */
    private String deviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createDate
     *
     * @mbggenerated
     */
    private Date createdate = new Date();
    private String imageurl;
    

    public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Id
     *
     * @return the value of user.Id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Id
     *
     * @param id the value for user.Id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Name
     *
     * @return the value of user.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Name
     *
     * @param name the value for user.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Deviceid
     *
     * @return the value of user.Deviceid
     *
     * @mbggenerated
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Deviceid
     *
     * @param deviceid the value for user.Deviceid
     *
     * @mbggenerated
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createDate
     *
     * @return the value of user.createDate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.createDate
     *
     * @param createdate the value for user.createDate
     *
     * @mbggenerated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}