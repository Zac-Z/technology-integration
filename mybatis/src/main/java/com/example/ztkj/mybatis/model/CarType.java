/**************************************************************************/
/*                                                                        */
/* Copyright (c) 2017 KYE Company                                       */
/* 跨越速运集团有限公司版权所有                                           */
/*                                                                        */
/* PROPRIETARY RIGHTS of KYE Company are involved in the                */
/* subject matter of this material. All manufacturing, reproduction, use, */
/* and sales rights pertaining to this subject matter are governed by the */
/* license agreement. The recipient of this software implicitly accepts   */
/* the terms of the license.                                              */
/* 本软件文档资料是跨越速运集团有限公司的资产，任何人士阅读和                   */
/* 使用本资料必须获得相应的书面授权，承担保密责任和接受相应的法律约束。                 */
/*                                                                        */
/**************************************************************************/

/**
  * <pre>
  * 作   者：yangshaoqin
  * 创建日期：2019-11-4
  * </pre>
  */

package com.example.ztkj.mybatis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <pre>
 * 车型表实体类
 * 数据库表名称：car_type
 * </pre>
 */
@Data
public class CarType implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 字段名称：车型
     * 
     * 数据库字段信息:car_type INT(10)
     */
    private Long carType;

    /**
     * 字段名称：车型名称
     * 
     * 数据库字段信息:car_type_name VARCHAR(32)
     */
    private String carTypeName;

    /**
     * 字段名称：车长
     * 
     * 数据库字段信息:car_length DOUBLE(7,2)
     */
    private Double carLength;

    /**
     * 字段名称：载重
     * 
     * 数据库字段信息:capacity DECIMAL(7,2)
     */
    private Double capacity;

    /**
     * 字段名称：方数
     * 
     * 数据库字段信息:volume DECIMAL(7,2)
     */
    private Double volume;

    /**
     * 字段名称：车长度 单位：厘米
     * 
     * 数据库字段信息:length INT(10)
     */
    private Long length;
    /**
     * 字段名称：车宽度 单位：厘米
     *
     * 数据库字段信息:width INT(10)
     */
    private Long width;
    /**
     * 字段名称：车高度 单位：厘米
     *
     * 数据库字段信息:height INT(10)
     */
    private Long height;
    /**
     * 字段名称：优先级
     *
     * 数据库字段信息:priority INT(10)
     */
    private Long priority;

    protected String traceId;

    protected String createdBy;

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    protected Timestamp creationDate;

    protected String updatedBy;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    protected Timestamp updationDate;

    protected Long enabledFlag = 1L;
}