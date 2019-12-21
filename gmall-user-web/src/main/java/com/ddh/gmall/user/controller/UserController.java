package com.ddh.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ddh.gmall.bean.UmsMember;
import com.ddh.gmall.bean.UmsMemberReceiveAddress;
import com.ddh.gmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ddh
 * @data: 2019/12/20 19:56
 * @description
 **/
@RestController
@ResponseBody
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("index")
    public String hello() {
        return "index";
    }

    @GetMapping("getAllUser")
    public List<UmsMember> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("getUserAddress")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return userService.getReceiveAddressByMemberId(memberId);
    }
}
