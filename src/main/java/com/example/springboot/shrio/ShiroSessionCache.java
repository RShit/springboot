package com.example.springboot.shrio;

import com.example.springboot.entity.SysUser;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.shiro.session.Session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ShiroSessionCache {
	static Cache<Serializable, String> cache = CacheBuilder.newBuilder().expireAfterAccess(2, TimeUnit.HOURS).build();
	
	public static void login(Session session, SysUser user) {
		StringBuilder buf = new StringBuilder();
		buf
		.append(user.getUserId())
		.append("_")
		.append(user.getUserName())
		.append(":")
		.append(user.getFullName());
		
		cache.put(session.getId(), buf.toString());
	}
	
	public static void logout(Serializable sessionId){
		cache.invalidate(sessionId);
	}
	
	public static void expire(Serializable sessionId){
		cache.invalidate(sessionId);
	}
	
	public static String refresh(Serializable sessionId){
		return cache.getIfPresent(sessionId);
	}
	
	public static long size(){
		return cache.size();
	}
	
	public static List<String> getActive(){
		List<String> list = new ArrayList<>();
		list.addAll(cache.asMap().values());
		return list;
	}
	
}
