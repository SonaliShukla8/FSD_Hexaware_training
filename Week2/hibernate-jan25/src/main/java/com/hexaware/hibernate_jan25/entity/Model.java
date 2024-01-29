package com.hexaware.hibernate_jan25.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Model {
	    @Id
	    private int model_id;
	    private String name;
	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "manufacture_id")
	    private Manufactures manufacture;
	    
		public Model() {
			super();
			// TODO Auto-generated constructor stub
		}
		

		public Model(int model_id, String name) {
			super();
			this.model_id = model_id;
			this.name = name;
			
		}
		public Model(int model_id, String name, Manufactures manufacture) {
			super();
			this.model_id = model_id;
			this.name = name;
			this.manufacture = manufacture;
		}

		public int getModel_id() {
			return model_id;
		}

		public void setModel_id(int model_id) {
			this.model_id = model_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Manufactures getManufacture() {
			return manufacture;
		}

		public void setManufacture(Manufactures manufacture) {
			this.manufacture = manufacture;
		}
		
		
	    
	    
}
