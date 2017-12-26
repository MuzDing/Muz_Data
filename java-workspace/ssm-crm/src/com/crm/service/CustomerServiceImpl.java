package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.CustomerDao;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.utils.Page;

/**
 * 客户管理
 * @author muz
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao; 
	public Page<Customer> selectPageByQueryVo(QueryVo vo){
		Page<Customer> page = new Page<Customer>();
		
		vo.setSize(7);
		if(null!=vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}
			if(null!=vo.getCustName() && !"".equals(vo.getCustName().trim())){
				vo.setCustName(vo.getCustName());
			}
			if(null!=vo.getCustSource() &&!"".equals(vo.getCustSource().trim())){
				vo.setCustSource(vo.getCustSource());
			}
			if(null!=vo.getCustIndustry() &&!"".equals(vo.getCustIndustry().trim())){
				vo.setCustIndustry(vo.getCustIndustry());
			}
			if(null!=vo.getCustLevel() &&!"".equals(vo.getCustLevel().trim())){
				vo.setCustLevel(vo.getCustLevel());
			}
			//总条数
			page.setTotal(customerDao.customerCountByQueryVo(vo));
			page.setRows(customerDao.selectCustomerListByQueryVo(vo));
		}
		
		return page;
	}
	//查询
	@Override
	public Customer selectCustomerById(Integer id) {
		// TODO 自动生成的方法存根
		return customerDao.selectCustomerById(id);
	}
	//修改
	@Override
	public void updateCustomerById(Customer customer) {
		// TODO 自动生成的方法存根
		customerDao.updateCustomerById(customer);
	}
	//删除
	@Override
	public void deleteCustomerById(Integer id) {
		// TODO 自动生成的方法存根
		customerDao.deleteCustomerById(id);
	}
	
}
