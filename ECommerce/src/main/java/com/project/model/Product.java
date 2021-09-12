package com.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id") 
	private Long id;
	
	@Column(name = "name") 
    private String name;
	
	@Column(name = "sku") 
	private String sku;
	
	@Column(name = "description") 
	private String description;
	
	@Column(name = "unit_price") 
	private double unit_price;
	
	@Column(name = "image_url") 
	private String image_url;
	
	@Column(name = "active") 
	private byte active;
	
	@Column(name = "units_in_stock") 
	private int units_in_stock;
	
	@Column(name = "date_created") 
	@CreationTimestamp
	private Date date_created;
	
	@Column(name = "last_updated") 
	@UpdateTimestamp
	private Date last_updated;
	

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Product_Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getUnits_in_stock() {
		return units_in_stock;
	}

	public void setUnits_in_stock(int units_in_stock) {
		this.units_in_stock = units_in_stock;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}
	
	public Product_Category getCategory() {
		return category;
	}

	public void setCategory(Product_Category category) {
		this.category = category;
	}

	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String name, String sku, String description, double unit_price, String image_url, byte active,
			int units_in_stock, Date date_created, Date last_updated, Long category_id) {
		super();
		this.id= id;
		this.name = name;
		this.sku = sku;
		this.description = description;
		this.unit_price = unit_price;
		this.image_url = image_url;
		this.active = active;
		this.units_in_stock = units_in_stock;
		this.date_created = date_created;
		this.last_updated = last_updated;
		}
	
	
	
	
	
}
