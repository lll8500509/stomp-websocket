package com.lnx.stompwebsocket.model.user.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnx.stompwebsocket.model.user.tab.SysRoleAuth;

public interface SysRoleAuthRepository extends JpaRepository<SysRoleAuth, Integer>{
	
}
