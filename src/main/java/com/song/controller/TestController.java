package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songruiyang.method.StringUtils;

@Controller
public class TestController {
	
	
	//��ת�����Խ���
	@RequestMapping("list.do")
	public String tolist(){
		
		return "list";
	}
	
	@RequestMapping("show.do")
	public String show(String str){
		//�����������Ĺ�����
		String ishtml = StringUtils.ishtml(str);
		//������ý��
		System.out.println(ishtml);
		return "list";
	}
}
