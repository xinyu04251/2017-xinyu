package com.eduask.biz.impl;

import java.util.List;

import com.eduask.bean.ClassInfo;
import com.eduask.biz.ClassBiz;
import com.eduask.db.GetSession;
import com.eduask.mapper.ClassMapper;

public class ClassBizImpl implements ClassBiz {

	ClassMapper cm = GetSession.getSession().getMapper(ClassMapper.class);
	@Override
	public List<ClassInfo> findAll() {

		return cm.findAll();
	}

}
