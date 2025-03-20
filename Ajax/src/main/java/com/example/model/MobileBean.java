package com.example.model;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="mb", eager = true)
@ViewScoped
public class MobileBean {
	
	private Map<String, Map<String, String>> data=new HashMap<String, Map<String, String>>();
	private String brand;
	private String model;
	private Map<String, String> allbrands;
	private Map<String, String> allmodels;
	public Map<String, Map<String, String>> getData() {
		return data;
	}
	public void setData(Map<String, Map<String, String>> data) {
		this.data = data;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Map<String, String> getAllbrands() {
		return allbrands;
	}
	public void setAllbrands(Map<String, String> allbrands) {
		this.allbrands = allbrands;
	}
	public Map<String, String> getAllmodels() {
		return allmodels;
	}
	public void setAllmodels(Map<String, String> allmodels) {
		this.allmodels = allmodels;
	}
	public MobileBean() {
		allbrands=new HashMap<String, String>();
		allbrands.put("Samsung", "Samsung");
		allbrands.put("Oppo", "Oppo");
		allbrands.put("Sony", "Sony");
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("Samsung M30", "Samsung M30");
		map.put("Samsung M31", "Samsung M31");
		map.put("Samsung A50", "Samsung A50");
		data.put("Samsung", map);
		
		map=new HashMap<String, String>();
		map.put("oppo A1", "oppo A1");
		map.put("oppo A7", "oppo A7");
		map.put("oppo F15", "oppo F15");
		data.put("Oppo", map);
		
		map=new HashMap<String, String>();
		map.put("Sony xperia xz", "Sony xperia xz");
		map.put("Sony xperia micro", "Sony xperia micro");
		map.put("Sony xperia L4", "Sony xperia L4");
		data.put("Sony", map);
	}
	
	public void onBrandChange() {
		if(brand !=null && !brand.equals(""))
			allmodels=data.get(brand);
		else
			allmodels=new HashMap<String, String>();
	}
	
	public void displayModel() {
		FacesMessage msg;
		if(model !=null && brand !=null)
			msg=new FacesMessage("Selected",model+" of "+brand);
		else
			msg=new FacesMessage(FacesMessage.SEVERITY_ERROR, "invalid", "Model is not Selected..");
	FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	
	
}
