package com.lnx.stompwebsocket.model.user.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnx.stompwebsocket.model.user.tab.SysAuth;

public interface SysAuthRepository extends JpaRepository<SysAuth, Integer>{

}
