package com.myspring.dataaccess.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.myspring.commons.BaseIoc;

public class JedisTest extends BaseIoc {
	private static final String REDIS_PRE = "test:pub:obj:";
	
	public static void main(String[] args) {
		JedisTest t = new JedisTest();
		t.setObect();
	}
	
	public void setObect() {
		JedisPool jedisPool = context.getBean("jedisPool", JedisPool.class);
		Jedis jedis = jedisPool.getResource();
		//http://stackoverflow.com/questions/26406303/redis-key-expire-notification-with-jedis
		//http://blog.csdn.net/chaijunkun/article/details/27361453
		//redis的发布订阅不能持久化
		jedis.publish("notify", "umq");//必须使用publish命令？TODO
        jedis.expire("notify", 30);
//		jedis.publish("test_1", "发布订阅");
		
//		jedis.publish("hello_foo", "bar123");  
//		jedis.publish("hello_test", "hello watson");  
	}
}
