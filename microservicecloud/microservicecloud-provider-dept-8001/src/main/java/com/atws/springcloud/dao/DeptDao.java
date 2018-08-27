package com.atws.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atws.springcloud.entities.Dept;


@Mapper
public interface DeptDao {
	
	  public boolean addDept(Dept dept);
	  
//	  public Dept findById(Long id);
	  public Dept findById(@Param("id")Long id);
	 
	  public List<Dept> findAll();
	  
}
