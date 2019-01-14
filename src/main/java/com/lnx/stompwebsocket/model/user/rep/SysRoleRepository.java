package com.lnx.stompwebsocket.model.user.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnx.stompwebsocket.model.user.tab.SysRole;

public interface SysRoleRepository extends JpaRepository<SysRole, Integer>{
	/*List<SysRole> findAllBy*/
}
