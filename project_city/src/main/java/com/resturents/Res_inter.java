package com.resturents;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Res_inter {
	@WebMethod
	public void insert(int res_no,String res_name,String res_address,String admin);
	@WebMethod
	public void update(int res_no,String name,String address,String admin);
	@WebMethod
	public void delete(int res_no,String admin);
	@WebMethod
	public void DisplayAll();
	@WebMethod
	public void Search_address(String name);
	@WebMethod
	public String hello();
}
