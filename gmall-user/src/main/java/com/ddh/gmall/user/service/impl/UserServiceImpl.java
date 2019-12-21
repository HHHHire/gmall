package com.ddh.gmall.user.service.impl;

import com.ddh.gmall.bean.UmsMember;
import com.ddh.gmall.bean.UmsMemberReceiveAddress;
import com.ddh.gmall.service.UserService;
import com.ddh.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.ddh.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ddh
 * @data: 2019/12/17 20:38
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper) {
        this.userMapper = userMapper;
        this.umsMemberReceiveAddressMapper = umsMemberReceiveAddressMapper;
    }

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

//        Example example = new Example(UmsMemberReceiveAddress.class);
//        example.createCriteria().andEqualTo("memberId", memberId);
//        return umsMemberReceiveAddressMapper.selectByExample(example);
    }
}
