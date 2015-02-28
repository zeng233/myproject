package com.myspring.dataaccess.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.myspring.commons.BaseIoc;

public class Subscriber extends BaseIoc {
	public static void main(String[] args) {
		Subscriber t = new Subscriber();
		t.addListener();
    }
	
	public void addListener() {
		JedisPool jedisPool = context.getBean("jedisPool", JedisPool.class);
//		JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "10.28.6.152");
		Jedis jedis = jedisPool.getResource();
//		jedis.psubscribe(new KeyExpriedListener(), "__key*__:*");//模式匹配
		jedis.psubscribe(new KeyExpriedListener(), "notify*");//模式匹配
	}
}
