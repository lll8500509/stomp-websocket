package com.lnx.stompwebsocket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnx.stompwebsocket.model.user.rep.SysRoleRepository;
import com.lnx.stompwebsocket.model.user.rep.SysUserRoleRepository;
import com.lnx.stompwebsocket.model.user.tab.SysRole;

@Service
public class SysRoleService {
	@Autowired
	SysRoleRepository sysRoleRepository;
	
	@Autowired
	SysUserRoleRepository sysUserRoleRepository;
	
	public List<SysRole> getRoleByUserId(int userId){
		return null;
		/*sysUserRoleRepository.
		sysRoleRepository.
		return null;*/
	}
}
