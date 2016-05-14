package com.straw.test.drools;

public class TestHello {/*
	@Test
      public void t(){ 
		 // 获取Drools6提供的所有服务的入口对象
		 //org.drools.compiler.kie.builder.impl.KieServicesImpl
    	  KieServices kieServices = KieServices.Factory.get();
    	// 这个容器类相当于Drools的运行库，此处会指定从classpath中读取需要的规则资源来构建它
    	  KieContainer kContainer = kieServices.newKieClasspathContainer();
    	// 创建session一定先是要读取并编译规则资源到规则库中才行，需要在resources路径下（这里是test父路径下）
  		// 提供一个META-INF文件夹，包含一个kmodule文件（可以是最简配置的）
    	  StatelessKieSession kSession = kContainer.newStatelessKieSession();
    	  kSession.execute(new Object());
    	  }
		@Test
		 public void t1() {
				KieServices kieService = KieServices.Factory.get();
			    KieContainer kieContainer =   kieService.newKieClasspathContainer();
			    StatelessKieSession ksession = kieContainer.newStatelessKieSession();
			    LeaveFormDTO leaveFormDTO = new LeaveFormDTO();
				leaveFormDTO.setGender(GenderType.MALE);
				leaveFormDTO.setLeaveType(LeaveType.MATERNITY);
				Hello hello = new Hello();
				leaveFormDTO.setMessage("jek");
				leaveFormDTO.setHello(hello);
				ksession.execute(leaveFormDTO);
				assertFalse(leaveFormDTO.isAgree());
				assertEquals("男人不能请产假的",leaveFormDTO.getMessage());
				System.out.println(leaveFormDTO.getMessage());
		 }
		@Test
	     public void t2(){
	     KieServices kieService = KieServices.Factory.get();
	    	 KieContainer kieContainer = kieService.newKieClasspathContainer();
	         KieSession kieSessino =  kieContainer.newKieSession();
	         kieSessino.insert(new FactorialDTO(5));
	         kieSessino.fireAllRules();
	     }
		@Test
		public void t3(){
			   KieServices kieService = KieServices.Factory.get();
			    KieContainer  kcontainer = kieService.newKieClasspathContainer();
			  KieSession ksession =  kcontainer.newKieSession();
				ksession.insert(new Person("aaa"));
				ksession.insert(new Person("bbb"));
				ksession.fireAllRules();
				ksession.dispose();
		}
*/}
