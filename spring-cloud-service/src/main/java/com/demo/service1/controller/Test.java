package com.demo.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名称： com.demo.service1.controller.Test.java</br>
 * 初始作者： 李洪超-lihc</br>
 * 创建日期： 2018年5月18日</br>
 * 功能说明： 这里用一句话描述这个类的作用--此句话需删除 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2010-2011 .All rights reserved.<br/>
 */
@RestController
@RequestMapping("/test")
public class Test {

	@Autowired
	private Environment env;

	public Test() {

	}

	@RequestMapping(value = "/getStr")
	public String get(String str) {

		str = env.getProperty("spring.test");
		str += "接收到：\t" + str;
		return str;
	}

}
