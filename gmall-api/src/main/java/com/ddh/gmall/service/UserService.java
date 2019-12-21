package com.ddh.gmall.service;

import com.ddh.gmall.bean.UmsMember;
import com.ddh.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author: ddh
 * @data: 2019/12/17 20:37
 * @description
 **/
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
