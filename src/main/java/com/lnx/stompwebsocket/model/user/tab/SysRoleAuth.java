package com.lnx.stompwebsocket.model.user.tab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sys_role_auth", schema = "shirodemo", catalog = "")
public class SysRoleAuth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull
	@Column(name = "role_id")
	private int roleId;
	
	@NotNull
	@Column(name = "auth_id")
	private int AuthId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getAuthId() {
		return AuthId;
	}

	public void setAuthId(int authId) {
		AuthId = authId;
	}
	
	
}
