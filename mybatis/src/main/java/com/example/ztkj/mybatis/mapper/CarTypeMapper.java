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

package com.example.ztkj.mybatis.mapper;


import com.example.ztkj.mybatis.model.CarType;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 * 车型表数据访问接口
 * </pre>
 */

@Repository
public interface CarTypeMapper{
    CarType getById(Long id);
}