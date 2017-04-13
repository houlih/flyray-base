package me.flyray.crm.dao;

import java.util.List;
import java.util.Map;

import me.flyray.crm.model.CustomerBase;

/** 
* @author: bolei
* @date：2017年3月12日 下午5:13:00 
* @description：客户基础信息
*/

public interface CustomerBaseDao {

	CustomerBase queryObject(CustomerBase customerBase);
	
	List<CustomerBase> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CustomerBase customerBase);
	
	void update(CustomerBase customerBase);
	
	void deleteBatch(Long[] customerIds);
	
}
