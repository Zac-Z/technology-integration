package com.example.ztkj.mybatis.service;

import com.example.ztkj.mybatis.mapper.CarTypeMapper;
import com.example.ztkj.mybatis.model.CarType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarTypeService {

    @Autowired
    CarTypeMapper carTypeMapper;

    public CarType getById(CarType carType) {
        return carTypeMapper.getById(carType.getId());
    }
}
