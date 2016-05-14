package com.straw.test;

/*@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })*/
public class TestMyBatis {/*
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService = null;
	@Resource
	private ICircleService circleService = null;
	@Resource
	private ICircleUserService circleUserService = null;
	@Resource
	private ILocationService locationService = null;
	@Resource
	private IJokeService jokeService = null;

	@Test
	public void test1() {
		// User user = userService.getUserById("1");
		// User user = userService.getUserByDeviceId("0002");
		User user = new User();
		String deviceid = "003";
		String name = "小姐";
		user.setDeviceid(deviceid);
		user.setName(name);
		//int i = this.userService.insertSelective(user);
		//logger.info(JSON.toJSONString(i));
	}

	@Test
	public void test2() {
		// User user = userService.getUserById("1");
		User user = userService.getUserByDeviceId("002");
		// User user = new User();
		String deviceid = "002";
		String name = "小姐";
		// user.setDeviceid(deviceid);
		// user.setName(name);
		// int i = this.userService.insertSelective(user);
		logger.info(JSON.toJSONString(user));
	}

	@Test
	public void t3() {
		Circle circle = new Circle();
		circle.setCreater("1");
		circle.setName("朋友");
		circle.setAccount(2);
		int i = circleService.insert(circle);
		logger.info(i);
	}

	@Test
	public void t4() {
		Location location = new Location();
		location.setUserid("123");
		location.setX("" + 1);
		location.setY("2");
		int i = locationService.add(location);
		logger.info(i);
	}

	@Test
	public void t5() {
		Joke joke = new Joke();
		joke.setTitle("1");
		joke.setContent("sss");
		int i = jokeService.add(joke);
		logger.info(i);
	}

	@Test
	public void t6() {
		String id = "638b245c-f265-44d4-b665-999a82fc5155";
//		int i = jokeService.deleteById(id);
		Joke joke = jokeService.findById(id);
		joke.setContent("xiaowu");
		int i = jokeService.updateByPrimaryKey(joke);
		logger.info(i);
	}
	@Test
	public void t7() {
		String id = "638b245c-f265-44d4-b665-999a82fc5155";
//		int i = jokeService.deleteById(id);
		List<Joke> joke = jokeService.findList();
		logger.info(JSON.toJSONString(joke));
	}
	@Test
	public void t8() {
		String id = "638b245c-f265-44d4-b665-999a82fc5155";
//		int i = jokeService.deleteById(id);
		int i = jokeService.deleteById(id);	
		logger.info(JSON.toJSONString(i));
		
	}
	@Test
	public void t9(){
		String deviceId = "1";
		List<CircleUser> circleUserList = this.circleUserService
				.findCircleByUserId(deviceId);
		logger.info(JSON.toJSONString(circleUserList));
	}
	@Test
    public void t10(){
    	String circleId = "0cc739b8-bf79-4c74-9906-be223c208d41";
    	List<CircleUser> findCircleByCircleId = circleUserService.findCircleByCircleId(circleId);
    	System.out.println(JSON.toJSON(findCircleByCircleId));
    }
	@Test
	public void t11(){
		String userId = "00000000-5cda-790a-ffff-fffff81af9d0";
		Location findByUserId = locationService.findByUserId(userId);
		System.out.println(JSON.toJSON(findByUserId));
		
	}
	@Test
	public void t12(){
		String a = "1";
		String p = "123";
		int e = circleService.selectCircleByIdPd(a,p);
		System.out.println(e);
	}

	@Test
   public void test13(){
		try {
			MiPush.sendMessages("我是","真的是我");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

*/}
