package com.straw.friend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.straw.friend.bean.Circle;
import com.straw.friend.bean.CircleUser;
@Repository 
public interface ICircleUserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    int insert(CircleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    int insertSelective(CircleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    CircleUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CircleUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CircleUser record);

	List<CircleUser> findCircleByUserId(String userId);

	List<CircleUser> findCircleByCircleId(String circleId);

	List<CircleUser> findCircleNoByUserId(String userId);
}