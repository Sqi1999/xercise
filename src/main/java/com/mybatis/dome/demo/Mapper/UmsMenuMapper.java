package com.mybatis.dome.demo.Mapper;

import com.mybatis.dome.demo.entity.UmsMenu;
import com.mybatis.dome.demo.entity.UmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int countByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int deleteByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int insert(UmsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int insertSelective(UmsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    List<UmsMenu> selectByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    UmsMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int updateByExample(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int updateByPrimaryKeySelective(UmsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbggenerated Thu Jul 15 13:58:41 CST 2021
     */
    int updateByPrimaryKey(UmsMenu record);
}