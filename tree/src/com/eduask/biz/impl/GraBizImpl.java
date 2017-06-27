package com.eduask.biz.impl;

import java.util.List;

import com.eduask.bean.GraInfo;
import com.eduask.biz.GraBiz;
import com.eduask.db.GetSession;
import com.eduask.mapper.ClassMapper;
import com.eduask.mapper.GraMapper;

public class GraBizImpl implements GraBiz {
	
	GraMapper gm = GetSession.getSession().getMapper(GraMapper.class); 
	@Override
	public List<GraInfo> findAll() {
		return gm.findAll();
	}

}
