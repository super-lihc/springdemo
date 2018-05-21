package com.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名称： com.demo.service1.Service1.java</br>
 * 初始作者： 李洪超-lihc</br>
 * 创建日期： 2018年5月18日</br>
 * 功能说明： 这里用一句话描述这个类的作用--此句话需删除 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2010-2011 .All rights reserved.<br/>
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1 {

	public Service1() {

	}

	public static void main(String[] args) {

		SpringApplication.run(Service1.class, args);
	}
}
