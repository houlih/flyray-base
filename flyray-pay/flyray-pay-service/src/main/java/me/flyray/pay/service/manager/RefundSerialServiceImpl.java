package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.RefundSerialService;
import me.flyray.pay.dao.RefundSerialDao;
import me.flyray.pay.model.RefundSerial;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:54:36 
* @description：退款流水 
*/

@Service("refundSerialService")
public class RefundSerialServiceImpl implements RefundSerialService{

	@Autowired
	private RefundSerialDao refundSerialDao;
	
	@Override
	public List<RefundSerial> queryList(Map<String, Object> map) {
		return refundSerialDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return refundSerialDao.queryTotal(map);
	}

	@Override
	public void save(RefundSerial refundSerial) {
		refundSerialDao.save(refundSerial);
	}

	@Override
	public void update(RefundSerial refundSerial) {
		refundSerialDao.update(refundSerial);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}