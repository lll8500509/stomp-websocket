package com.lnx.stompwebsocket.shiro;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.lnx.stompwebsocket.model.user.tab.SysAuth;
import com.lnx.stompwebsocket.model.user.tab.SysRole;
import com.lnx.stompwebsocket.model.user.tab.SysUser;
import com.lnx.stompwebsocket.service.SysAuthService;
import com.lnx.stompwebsocket.service.SysRoleService;
import com.lnx.stompwebsocket.service.SysUserService;

public class ShiroRealm extends AuthorizingRealm{

	@Resource
    private SysUserService sysUserService;
    @Resource
    private SysRoleService sysRoleService;
    @Resource
    private SysAuthService authService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		 System.out.println("--------权限配置-------");
	      /*  SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	        SysUser user = (SysUser) principals.getPrimaryPrincipal();
	        try {
	            //注入角色(查询所有的角色注入控制器）
	            List<SysRole> list = sysRoleService.selectRoleByUser(user.getUserId());
	            for (SysRole role: list){
	                authorizationInfo.addRole(role.getSysRoleName());
	            }
	            //注入角色所有权限（查询用户所有的权限注入控制器）
	            List<SysAuth> sysAuths = authService.queryByUserId(user.getUserId());
	            for(SysAuth sysAuth:sysAuths){
	                authorizationInfo.addStringPermission(sysAuth.getSysAuthPermission());
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return authorizationInfo;*/
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
