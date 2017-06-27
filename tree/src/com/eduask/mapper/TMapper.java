package com.eduask.mapper;

import java.util.List;

import com.eduask.bean.TInfo;

public interface TMapper {
	public List<TInfo> findAll();
    public TInfo findById(int tno);
    public List<TInfo> findBy(String str);
    public void add(TInfo ti);
    public void update(TInfo ti);
    public void delete(int tno);
}
