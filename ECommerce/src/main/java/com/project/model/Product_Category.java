package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class Product_Category {
  
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name="id") 
		private Long id;
		
		@Column(name = "category_name") 
		private String category_name;
		
		public Product_Category() {
			// TODO Auto-generated constructor stub
		}
		public Product_Category(String category_name) {
			super();
			this.category_name = category_name;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getCategory_name() {
			return category_name;
		}


		public void setCategory_name(String category_name) {
			this.category_name = category_name;
		}
		
		
		
	}

