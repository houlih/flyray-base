package me.flyray.crm.dao;

import java.util.List;
import java.util.Map;

import me.flyray.crm.model.CustomerBase;
import me.flyray.crm.model.MerchantBase;

/** 
* @author: bolei
* @date：2017年4月6日 下午10:28:29 
* @description：商户基础信息
*/

public interface MerchantBaseDao {

	MerchantBase queryObject(MerchantBase merchantBase);
	
	List<MerchantBase> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MerchantBase merchantBase);
	
	void update(MerchantBase merchantBase);
	
	void deleteBatch(Long[] customerIds);
	
}
