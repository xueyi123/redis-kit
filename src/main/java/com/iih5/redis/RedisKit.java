package com.iih5.redis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

public class RedisKit {
	static  String DEFAULT_LABEL ="qQ395w02v7901";
	static Map<String, JedisPool> poolMap = new HashMap<String, JedisPool>();

	public RedisKit(String ip,int port){
		JedisPoolConfig config = new JedisPoolConfig();
		poolMap.put(DEFAULT_LABEL,new JedisPool(config,ip,port,0));
	}
	public RedisKit(String ip,int port,String auth){
		JedisPoolConfig config = new JedisPoolConfig();
		poolMap.put(DEFAULT_LABEL,new JedisPool(config,ip,port,0,auth,0));
	}
	public RedisKit(String label,String ip,int port){
		JedisPoolConfig config = new JedisPoolConfig();
		poolMap.put(label,new JedisPool(config,ip,port,0));
	}
	public RedisKit(String label,String ip,int port,String auth){
		JedisPoolConfig config = new JedisPoolConfig();
		poolMap.put(label,new JedisPool(config,ip,port,0,auth,0));
	}
	/**
	 * 获取默认redis连接池对象
	 * @return
     */
	public static JedisPool getJedisPool(){
		if (poolMap.size()==1){
			JedisPool jedisPool = poolMap.values().iterator().next();
			return jedisPool;
		}else {
			return poolMap.get(DEFAULT_LABEL);
		}
	}
	public static JedisPool getJedisPool(String label){
		return poolMap.get(label);
	}
}
