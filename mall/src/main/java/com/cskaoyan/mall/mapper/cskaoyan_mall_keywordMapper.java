package main.java.com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.cskaoyan_mall_keyword;
import com.cskaoyan.mall.bean.cskaoyan_mall_keywordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface cskaoyan_mall_keywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    long countByExample(cskaoyan_mall_keywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int deleteByExample(cskaoyan_mall_keywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int insert(cskaoyan_mall_keyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int insertSelective(cskaoyan_mall_keyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    List<cskaoyan_mall_keyword> selectByExample(cskaoyan_mall_keywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    cskaoyan_mall_keyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") cskaoyan_mall_keyword record, @Param("example") cskaoyan_mall_keywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByExample(@Param("record") cskaoyan_mall_keyword record, @Param("example") cskaoyan_mall_keywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByPrimaryKeySelective(cskaoyan_mall_keyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_keyword
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByPrimaryKey(cskaoyan_mall_keyword record);
}
