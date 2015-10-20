package com.straw.friend.miipush;

import java.util.ArrayList;
import java.util.List;

import com.xiaomi.xmpush.server.Constants;
import com.xiaomi.xmpush.server.Message;
import com.xiaomi.xmpush.server.Sender;
import com.xiaomi.xmpush.server.TargetedMessage;

public class MiPush {
	public static String MY_PACKAGE_NAME= "com.straw.friend";
	public static String APP_SECRET_KEY = "1Dr3lnmW+rf5wjdM2QwAvA==";
	public static void sendMessages(String title,String description) throws Exception{
		//设置在正式环境下
		Constants.useOfficial();
		//构建消息发送对象
		Sender sender = new Sender(APP_SECRET_KEY);
		List<TargetedMessage> messages = new ArrayList<TargetedMessage>();
		Message message = new Message.Builder()
		.title(title)
		.description(description)
		.payload("this is a friend message!")
		.restrictedPackageName(MY_PACKAGE_NAME)
		.notifyType(1)
		.build();
		sender.broadcastAll(message, 0);
		 
	}

}
