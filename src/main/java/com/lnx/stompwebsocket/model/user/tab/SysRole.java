package com.lnx.stompwebsocket.model.user.tab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sys_role", schema = "shirodemo", catalog = "")
public class SysRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sys_role_id")
	private Integer sysRoleId;
	
	@NotNull
	@Column(name = "sys_role_ava")
    private Byte sysRoleAva; //角色是否生效
    
	@Column(name = "sys_role_des")
    private String sysRoleDes;//角色描述
    
	@NotNull
	@Column(name = "sys_role_name")
    private String sysRoleName;//角色名称
    
	public Integer getSysRoleId() {
		return sysRoleId;
	}
	public void setSysRoleId(Integer sysRoleId) {
		this.sysRoleId = sysRoleId;
	}
	public Byte getSysRoleAva() {
		return sysRoleAva;
	}
	public void setSysRoleAva(Byte sysRoleAva) {
		this.sysRoleAva = sysRoleAva;
	}
	public String getSysRoleDes() {
		return sysRoleDes;
	}
	public void setSysRoleDes(String sysRoleDes) {
		this.sysRoleDes = sysRoleDes;
	}
	public String getSysRoleName() {
		return sysRoleName;
	}
	public void setSysRoleName(String sysRoleName) {
		this.sysRoleName = sysRoleName;
	}
    
    
}
