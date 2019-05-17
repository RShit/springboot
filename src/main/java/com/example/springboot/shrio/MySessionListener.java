package com.example.springboot.shrio;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySessionListener implements SessionListener {
	private static final Logger log = LoggerFactory.getLogger(MySessionListener.class);

	@Override
	public void onStart(Session session) {
		log.debug("Session start ID:{}, timeout:{}", session.getId(), session.getTimeout());
	}

	@Override
	public void onExpiration(Session session) {// 会话过期时触发
		log.debug("Session expiration ID:{}, starttime:{}", session.getId(), session.getStartTimestamp());
		ShiroSessionCache.expire(session.getId());
	}

	@Override
	public void onStop(Session session) {// 退出/会话过期时触发
		log.debug("Session stop ID:{}, starttime:{}", session.getId(), session.getStartTimestamp());
		ShiroSessionCache.expire(session.getId());
	}


}
