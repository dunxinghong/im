package com.palt.controller;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.palt.config.ImConfig;
import com.palt.service.MainService;

import io.rong.messages.TxtMessage;
import io.rong.messages.VoiceMessage;
import io.rong.models.CodeSuccessResult;
import io.rong.models.TemplateMessage;
import io.rong.models.TokenResult;
import io.rong.util.GsonUtil;


@RequestMapping(value="/im")
@Controller
public class MainController {

	@Autowired
	private ImConfig imConfig;
	
	@Autowired
	private MainService mainService;
	
	@RequestMapping(value="/getToken")
	@ResponseBody
	public TokenResult getToken(String code,String userName,String portraitUri){
		TokenResult userGetTokenResult;
		try {
			userGetTokenResult = imConfig.getRongCloud().user.getToken(code, "username", "http://www.rongcloud.cn/images/logo.png");
			System.out.println("getToken:  " + userGetTokenResult.toString());
			return userGetTokenResult;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@RequestMapping(value="/sendMessage")
	@ResponseBody
	public CodeSuccessResult sendP2PMessage(String from,String to,String content){
		try {
			System.out.println("************************Message********************");
			// 发送单聊消息方法（一个用户向另外一个用户发送消息，单条消息最大 128k。每分钟最多发送 6000 条信息，每次发送用户上限为 1000 人，如：一次发送 1000 人时，示为 1000 条消息。） 
			String[] messagePublishPrivateToUserId = to.split(",");
			TxtMessage messagePublishPrivateVoiceMessage = new TxtMessage(content, "helloExtra");
//			VoiceMessage messagePublishPrivateVoiceMessage = new VoiceMessage(content, "toto", 20L);
			CodeSuccessResult messagePublishPrivateResult = imConfig.getRongCloud().message.publishPrivate(from, messagePublishPrivateToUserId, messagePublishPrivateVoiceMessage, "thisisapush", "{\"pushData\":\"hello\"}", "4", 0, 0, 0, 0);
			System.out.println("publishPrivate:  " + messagePublishPrivateResult.toString());
			return messagePublishPrivateResult;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping(value="/chat")
	public String chat(String phone,String userName,String portraitUri){
		return "imChat";
	}
	
	

}
