package com.hexaware.hibernate_jan25.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Manufactures {
	    @Id
	    private int id;
	    // One manufactures can produces multiple models of the bike.
	    private  String manufactures_name;
	    @OneToMany(mappedBy ="manufature", cascade=CascadeType.ALL)
	    private List<Model> models = new ArrayList<Model>();
	    
		public Manufactures() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Manufactures(int id, String manufactures_name) {
			super();
			this.id = id;
			this.manufactures_name = manufactures_name;
			
		}
		public Manufactures(int id, String manufactures_name, List<Model> models) {
			super();
			this.id = id;
			this.manufactures_name = manufactures_name;
			this.models = models;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getManufactures_name() {
			return manufactures_name;
		}

		public void setManufactures_name(String manufactures_name) {
			this.manufactures_name = manufactures_name;
		}

		public List<Model> getModels() {
			return models;
		}

		public void setModels(List<Model> models) {
			this.models = models;
		}
		public void addModel(Model mod) {
			this.getModels().add(mod);
		}
		
	    
	    
	    
}
