package com.eduask.biz.impl;

import java.util.List;

import com.eduask.bean.StuInfo;
import com.eduask.biz.StuBiz;
import com.eduask.db.GetSession;
import com.eduask.mapper.StuMapper;

public class StuBizImpl implements StuBiz {
    private StuMapper sm = GetSession.getSession().getMapper(StuMapper.class);
	@Override
	public List<StuInfo> findAll() {
		return sm.findAll();
	}

}
