package com.cloud.microblog.scheduler.quartz.dao.mapper;

import com.cloud.microblog.scheduler.quartz.dao.model.QuartzJob;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartzJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated
     */
    int insert(QuartzJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated
     */
    QuartzJob selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated
     */
    List<QuartzJob> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QuartzJob record);
}