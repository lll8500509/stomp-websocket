package com.lnx.stompwebsocket.model.user.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnx.stompwebsocket.model.user.tab.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser,Integer>{

}
