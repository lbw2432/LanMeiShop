package com.lanmei.aop.dao.mapper;

import com.lanmei.aop.dao.model.TimeMeasurement;
import java.util.List;

public interface TimeMeasurementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_measurement
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer measurementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_measurement
     *
     * @mbggenerated
     */
    int insert(TimeMeasurement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_measurement
     *
     * @mbggenerated
     */
    TimeMeasurement selectByPrimaryKey(Integer measurementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_measurement
     *
     * @mbggenerated
     */
    List<TimeMeasurement> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_measurement
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TimeMeasurement record);

    TimeMeasurement selectAllByMethod(String method);
}