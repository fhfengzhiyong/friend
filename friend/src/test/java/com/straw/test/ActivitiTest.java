package com.straw.test;

import javax.annotation.Resource;



import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring/spring-*.xml",}) 
public class ActivitiTest {/*
	@Resource
	RepositoryService repositoryService ;
	*//**
	 * 测试activiti 环境增加了一个流程图
	 *//*
	public void testc(){
		String deploymentId = repositoryService
				.createDeployment()
				.addClasspathResource("bpmn/hello.bpmn")
				.deploy()
				.getId();
		System.out.println(deploymentId);
	}
*/}
