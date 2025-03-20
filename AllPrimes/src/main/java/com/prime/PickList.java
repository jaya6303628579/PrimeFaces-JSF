package com.prime;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

@ManagedBean(name = "pickListView")
public class PickList {
	
	 private DualListModel<String> cities;

	public DualListModel<String> getCities() {
		return cities;
	}

	public void setCities(DualListModel<String> cities) {
		this.cities = cities;
	}
	public PickList() {
		List<String> citiesSource = new ArrayList<>();
        List<String> citiesTarget = new ArrayList<>();

        citiesSource.add("KADAPA");
        citiesSource.add("PRODDATUR");
        citiesSource.add("VIZAG");
        citiesSource.add("KOLKATA");
        citiesSource.add("HYDERABAD");
        citiesSource.add("BENGALORE");
        citiesSource.add("CHENNAI");

        cities = new DualListModel<>(citiesSource, citiesTarget);
	}
	
	public void onTransfer(TransferEvent event) {
        StringBuilder message = new StringBuilder();
        List<String> transferredItems = new ArrayList<>();
        
        // Get items transferred
        for (Object item : event.getItems()) {
            transferredItems.add(item.toString());
        }
        
        // Determine transfer direction and build message
        if (event.isAdd()) {
            message.append("Added to Selected: ");
        } else if (event.isRemove()) {
            message.append("Removed from Selected: ");
        }
        
        message.append(String.join(", ", transferredItems));
        
        // Add message to Growl
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Transfer Event", message.toString()));
    }
}
