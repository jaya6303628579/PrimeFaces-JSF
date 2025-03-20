package com.example.app;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.CompanyDao;
import com.example.model.Company;

public class APP {

	public static void main(String[] args) {
		
		//Company c=new Company("WIPRO", "HYD");
		CompanyDao companyDao=new CompanyDao();
		Company company=new Company();
		
//		companyDao.insert(c);
//		System.out.println("data inserted successfully");
//		System.out.println(c);
		
//		CompanyDao companyDao=new CompanyDao();
//		Company company=companyDao.getone(1);
//		System.out.println(company);
		
		/***
		 *   using criteria builder API
		List<Company> allCompany=companyDao.getAll();
		allCompany.forEach(System.out::println);
***/
		
		/***
		 * GETTING ONLY ONE RECORD USING THE CRITERIA BUILDER
			company=companyDao.getOne(1);
			System.out.println(company);
		 * 
		 */
		/**
		 * ADDING MULTIPLE DATA AT A TIME
		 * 
		List<Company> list=new ArrayList<>();
		Company c1=new Company("TCS", "Bengalore");
		Company c2=new Company("TCS", "HYD");
		Company c3=new Company("Shvintech", "HYD");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for(Company c:list) {
			companyDao.insert(c);
		}
		companyDao.close();
		**/
		
		/**
		 * GETTING ONLY REQUIRED COLUMNS USING CRITERIA BUILDER API
		 * 
		List<Object[]> allCompany=companyDao.getOnlyColums();
		for(Object [] obj:allCompany) {
			String cname =(String)obj[0];
			String caddress=(String)obj[1];
			System.out.println("NAME ="+cname+", ADDRESS = "+caddress);
		}
		**/
		/***
		 * FILTERING BY ADDRESS USING CRITERIA BUILDER API
		 * 
		List<Company> filterData=companyDao.getFilterByAddress("vizag");
		filterData.forEach(System.out::println);
	**/
		
		/**
		 * FILTERING BY COMPANY NAME AND ADDRESS USING CRITERIA BUILDER API AND OPERTOR
		List<Company> filterByAnd =companyDao.getFilterByCompAndAddress("TCS", "vizag");
		filterByAnd.forEach(System.out::println);
		
		**/
		/**
		 * FILTERING BY COMPANY NAME AND ADDRESS USING CRITERIA BUILDER API AND OPERTOR
		List<Company> filterByOr=companyDao.getFilterbyOrAddress("vizag", "HYD");
		filterByOr.forEach(System.out::println);
		**/
		
		/**
		 * 
		 * UPDATING THE DATA BY USING THE CRITERIA BUILDER 
		 * 
		companyDao.update(6, "KOLKATA");
		System.out.println("sucessfully updated");
		**/
		
		/**
		 * 
		companyDao.delete(3);
		System.out.println("DATA IS SUCESSFULLY DELETED");
		List<Company> allCompany=companyDao.getAll();
		allCompany.forEach(System.out::println);
		**/
		
		
		/***
		 * GETTING ALL THE DATA IN A DESCENDING ORDER USING CRITERIA BUILDER
		 * 
		List<Company> descOrder=companyDao.getDescOrder();
		descOrder.forEach(System.out::println);
		***/
		
		/**
		 * GETTING ALL THE DATA IN A ASECENDING ORDER USING CRITERIA BUILDER
		 * 
		List<Company> ascOrder=companyDao.getAscOrder();
		ascOrder.forEach(System.out::println);
		
		**/
		
		List<Company> filterlike=companyDao.filterByLike();
		filterlike.forEach(System.out::println);
		
	}


}
