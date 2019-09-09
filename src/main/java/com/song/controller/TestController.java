package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songruiyang.method.StringUtils;

@Controller
public class TestController {
	
	
	//跳转到测试界面
	@RequestMapping("list.do")
	public String tolist(){
		
		return "list";
	}
	
	@RequestMapping("show.do")
	public String show(String str){
		//调用所依赖的工具类
		String ishtml = StringUtils.ishtml(str);
		//输出所得结果
		System.out.println(ishtml);
		return "list";
	}
}
