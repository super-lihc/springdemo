package com.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 文件名称： com.demo.discovery.Discovery.java</br>
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
@EnableEurekaServer
public class Discovery {

	public static void main(String[] args) {

		SpringApplication.run(Discovery.class, args);
	}
}
