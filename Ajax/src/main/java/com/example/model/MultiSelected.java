package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name="m", eager = true)
@ViewScoped
public class MultiSelected {
	private List<SelectItem> items;
	private String selection;
	
	public MultiSelected() {
		items=new ArrayList<SelectItem>();
		SelectItemGroup mobile= new SelectItemGroup("Mobile");
		SelectItemGroup tv=new SelectItemGroup("TV");
		
		SelectItemGroup samsungmbl=new SelectItemGroup("SamSung");
		SelectItemGroup oppombl=new SelectItemGroup("Oppo");
		
		SelectItem lgtv=new SelectItem("LG");
		
		
		SelectItem samsungmbl1=new SelectItem("M30");
		SelectItem samsungmbl2=new SelectItem("M31");
		SelectItem samsungmbl3=new SelectItem("M32");
		samsungmbl.setSelectItems(new SelectItem[] {samsungmbl1, samsungmbl2, samsungmbl3});
		
		SelectItem oppombl1=new SelectItem("oppo mbl1");
		SelectItem oppombl2=new SelectItem("oppo mbl12");
		SelectItem oppombl3=new SelectItem("oppo mbl13");
		oppombl.setSelectItems(new SelectItem[] {oppombl1, oppombl2, oppombl3});
		
		mobile.setSelectItems(new SelectItem[] {samsungmbl,oppombl});
		tv.setSelectItems(new SelectItem[] {lgtv});

		items.add(mobile);
		items.add(tv);
	}
	
	public List<SelectItem> getItems() {
		return items;
	}
	public void setItems(List<SelectItem> items) {
		this.items = items;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		System.out.println(selection);
		this.selection = selection;
	}
	
	
	
	
	
}
