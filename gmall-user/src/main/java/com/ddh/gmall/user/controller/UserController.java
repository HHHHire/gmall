package com.ddh.gmall.user.controller;

import com.ddh.gmall.bean.UmsMember;
import com.ddh.gmall.bean.UmsMemberReceiveAddress;
import com.ddh.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ddh
 * @data: 2019/12/17 20:36
 * @description
 **/
@RestController
@ResponseBody
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

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
