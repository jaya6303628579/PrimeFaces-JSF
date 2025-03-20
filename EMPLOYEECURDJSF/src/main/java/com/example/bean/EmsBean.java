package com.example.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import com.example.dao.EmsDAO;
import com.example.model.Ems;

@ManagedBean(name="emsbean", eager = true)
@SessionScoped
public class EmsBean {
	 private EmsDAO emsDAO = new EmsDAO();
	    private List<Ems> emsList;
		private Ems ems=new Ems();
	    public Ems getEms() {
			return ems;
		}

		public void setEms(Ems ems) {
			this.ems = ems;
		}

	
	    
	    public List<Ems> getEmsList() {
	        if (emsList == null) {
	            emsList = emsDAO.getAll();
	        }
	        return emsList;
	    }

	    public void save() {
	        emsDAO.saveEms(ems);
	        ems = new Ems();
	        emsList = emsDAO.getAll(); // Refresh list
	    }
	    
	    public void delete(Ems ems) {
	        emsDAO.delete(ems);
	        emsList = emsDAO.getAll(); // Refresh list
	    }

	    public String edit(Ems ems) {
	        this.ems = ems;
	        
	        System.out.println("ems id "+ems);
	        return "update?faces-redirect=true";
	    }
	    
	    public String update() {
	    	emsDAO.update(ems);
	    	return "index?faces-redirect=true";
	    }

}
