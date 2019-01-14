package com.lnx.stompwebsocket.model.user.tab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sys_auth", schema = "shirodemo", catalog = "")
public class SysAuth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sys_auth_id")
	private Integer sysAuthId;
	
	@NotNull
	@Column(name = "sys_auth_code")
    private String sysAuthCode; //权限编号
	
	@NotNull
	@Column(name = "sys_auth_name")
    private String sysAuthName; //权限名称
	
	@NotNull
	@Column(name = "sys_auth_url")
    private String sysAuthUrl; //权限请求的url 例如: user/login
	
	@NotNull
	@Column(name = "sys_auth_permission")
    private String sysAuthPermission; //权限的的名称例如 user:login
	
	@NotNull
	@Column(name = "sys_auth_ava")
    private Byte sysAuthAva; //权限是否有效
	
	@NotNull
	@Column(name = "sys_auth_type")
    private Byte sysAuthType; //权限类型。菜单还是按钮
	
	@NotNull
	@Column(name = "sys_auth_des")
    private String sysAuthDes; //权限描述
    
	public Integer getSysAuthId() {
		return sysAuthId;
	}
	public void setSysAuthId(Integer sysAuthId) {
		this.sysAuthId = sysAuthId;
	}
	public String getSysAuthCode() {
		return sysAuthCode;
	}
	public void setSysAuthCode(String sysAuthCode) {
		this.sysAuthCode = sysAuthCode;
	}
	public String getSysAuthName() {
		return sysAuthName;
	}
	public void setSysAuthName(String sysAuthName) {
		this.sysAuthName = sysAuthName;
	}
	public String getSysAuthUrl() {
		return sysAuthUrl;
	}
	public void setSysAuthUrl(String sysAuthUrl) {
		this.sysAuthUrl = sysAuthUrl;
	}
	public String getSysAuthPermission() {
		return sysAuthPermission;
	}
	public void setSysAuthPermission(String sysAuthPermission) {
		this.sysAuthPermission = sysAuthPermission;
	}
	public Byte getSysAuthAva() {
		return sysAuthAva;
	}
	public void setSysAuthAva(Byte sysAuthAva) {
		this.sysAuthAva = sysAuthAva;
	}
	public Byte getSysAuthType() {
		return sysAuthType;
	}
	public void setSysAuthType(Byte sysAuthType) {
		this.sysAuthType = sysAuthType;
	}
	public String getSysAuthDes() {
		return sysAuthDes;
	}
	public void setSysAuthDes(String sysAuthDes) {
		this.sysAuthDes = sysAuthDes;
	}
    
    
}
