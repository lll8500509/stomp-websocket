package com.lnx.stompwebsocket.config;

/*@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity*/
/*public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		 return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
        .inMemoryAuthentication()
        //在内存中分别配置两个用户user1 user2和密码 ，角色是user
        .withUser("user1").password("123").roles("user")
        .and()
        .withUser("user2").password("123").roles("user");
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        ///resources/static/ 目录下的静态资源，spring security不拦截
        web.ignoring().antMatchers("/resources/static/**","/resources/templates/**");
    }
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //设置spring security对 /  和  /login  路径不拦截
                .antMatchers("/", "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //设置spring security的登录页面访问路径为 /login
                .loginPage("/login")
                //登陆成功后转向 /chat 路径
                .defaultSuccessUrl("/index.html")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
}*/
