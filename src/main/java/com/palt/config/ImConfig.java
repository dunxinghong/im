package com.palt.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import io.rong.RongCloud;

@Configuration
public class ImConfig  implements InitializingBean{

	@Value("${im.appkey}")
	private String appkey;
	@Value("${im.secret}")
	private String secret;
	
	private RongCloud rongCloud;
	
	

	public RongCloud getRongCloud() {
		return rongCloud;
	}

	public void setRongCloud(RongCloud rongCloud) {
		this.rongCloud = rongCloud;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		 rongCloud = RongCloud.getInstance(this.getAppkey(), this.getSecret());
	}
	
	
}
