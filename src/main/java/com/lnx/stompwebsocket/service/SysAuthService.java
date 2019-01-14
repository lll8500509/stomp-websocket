package com.lnx.stompwebsocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnx.stompwebsocket.model.user.rep.SysAuthRepository;

@Service
public class SysAuthService {
	@Autowired
	SysAuthRepository sysAuthRepository;
}
