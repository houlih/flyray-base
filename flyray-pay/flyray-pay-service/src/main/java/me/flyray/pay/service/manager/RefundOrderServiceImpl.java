package me.flyray.pay.service.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.RefundOrderService;
import me.flyray.pay.dao.RefundOrderDao;
import me.flyray.pay.model.RefundOrder;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:54:13 
* @description：退款订单 
*/

@Service("refundOrderService")
public class RefundOrderServiceImpl implements RefundOrderService{

	@Autowired
	private RefundOrderDao refundOrderDao;
	
	@Override
	public List<RefundOrder> queryList(Map<String, Object> map) {
		return refundOrderDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return refundOrderDao.queryTotal(map);
	}

	@Override
	public void save(RefundOrder refundOrder) {
		refundOrderDao.save(refundOrder);
	}

	@Override
	public void update(RefundOrder refundOrder) {
		refundOrderDao.update(refundOrder);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}