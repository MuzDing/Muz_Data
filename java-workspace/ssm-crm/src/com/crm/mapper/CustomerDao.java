package com.crm.mapper;

import java.util.List;

import com.crm.pojo.BaseDict;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.utils.Page;

public interface CustomerDao {

	//总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	//结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	//查询数据BYID
	public Customer selectCustomerById(Integer id);
	//修改
	public void updateCustomerById(Customer customer);
	//修改
	public void deleteCustomerById(Integer id);
}
