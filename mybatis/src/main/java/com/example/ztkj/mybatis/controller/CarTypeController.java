package com.example.ztkj.mybatis.controller;

import com.example.ztkj.mybatis.model.CarType;
import com.example.ztkj.mybatis.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarTypeController {

    @Autowired
    private CarTypeService carTypeService;

    @RequestMapping(value = "/carType/getById", method = RequestMethod.POST)
    public CarType getById(@RequestBody CarType carType) {
        return carTypeService.getById(carType);
    }
}
