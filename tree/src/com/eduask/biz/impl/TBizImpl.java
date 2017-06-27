package com.eduask.biz.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.eduask.bean.TInfo;
import com.eduask.biz.TBiz;
import com.eduask.db.GetSession;
import com.eduask.mapper.TMapper;

public class TBizImpl implements TBiz {
	private SqlSession session = GetSession.getSession();
	private TMapper tm = session.getMapper(TMapper.class);
	@Override
	public List<TInfo> findAll() {
		return tm.findAll();
	}

	@Override
	public TInfo findById(int tno) {
		return tm.findById(tno);
	}

	@Override
	public List<TInfo> findBy(String str) {
		return tm.findBy(str);
	}

	@Override
	public void add(TInfo ti) {
		tm.add(ti);
		session.commit();
	}

	@Override
	public void update(TInfo ti) {
		tm.update(ti);
		session.commit();
	}

	@Override
	public void delete(int tno) {
		tm.delete(tno);
		session.commit();
	}

}
