package com.lnx.stompwebsocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnx.stompwebsocket.model.user.rep.SysUserRepository;

@Service
public class SysUserService {
	@Autowired
	SysUserRepository sysUserRepository;
}
