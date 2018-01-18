package com.palt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;



@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	// Spring会自动寻找同样类型的具体类注入，这里就是JwtUserDetailsServiceImpl了
	@Autowired 
	private UserDetailsService userDetailsService; 
	@Autowired 
	public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception { 
		authenticationManagerBuilder // 设置UserDetailsService 
		.userDetailsService(this.userDetailsService); // 使用BCrypt进行密码的hash 
		//.passwordEncoder(passwordEncoder()); 
	} // 装载BCrypt密码编码器 

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity // 由于使用的是JWT，我们这里不需要csrf 
		.csrf().disable() // 基于token，所以不需要session 
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and() .authorizeRequests() //
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll() // 允许对于网站静态资源的无授权访问 
		.antMatchers( HttpMethod.GET, "/**" ).permitAll() // 对于获取token的rest api要允许匿名访问 
		.antMatchers("/**").permitAll() // 除上面外的所有请求全部需要鉴权认证 
		.anyRequest().authenticated(); // 禁用缓存 
		httpSecurity.headers().cacheControl();
		httpSecurity.headers().frameOptions().disable();
	}
	

    /**
     * 设置用户密码的加密方式为MD5加密
     * @return
     */
    @Bean
    public Md5PasswordEncoder passwordEncoder() {
        return new Md5PasswordEncoder();

    }
    
}
