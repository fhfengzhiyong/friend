package com.straw.friend.common.concurrent;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 基于链表实现的阻塞队列
 * @author fengzy
 * 2016年5月14日
 */
public class LinkedBlockingQueueTest {
	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();
		linkedBlockingQueue.add(1);
	}
}
