package com.raycloud.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HOU  代码注释这里在这里
 * @since 2020-04-15
 * 所有生成的文件都需要Ctrl+Shiflt+l  格式化
 */
@RestController
@RequestMapping("/test")
public class TbUserController{

    public String HelloWorld(){
        return "HelloWorld";
    }

}


