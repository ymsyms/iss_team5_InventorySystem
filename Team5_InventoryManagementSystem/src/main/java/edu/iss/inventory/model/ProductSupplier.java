package edu.iss.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ProductSupplierId.class)
@Table(name = "productsupplier")
public class ProductSupplier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "partNo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String partNo;
	@Id
	@Column(name = "supplierId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String supplierId;
	@Column(name = "unitPrice")
	private double unitPrice;
	@Column(name = "minimumReorderQty")
	private int minimumReorderQty;

	public ProductSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductSupplier(String partNo, String supplierId, double unitPrice, int minimumReorderQty) {
		super();
		this.partNo = partNo;
		this.supplierId = supplierId;
		this.unitPrice = unitPrice;
		this.minimumReorderQty = minimumReorderQty;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getMinimumReorderQty() {
		return minimumReorderQty;
	}

	public void setMinimumReorderQty(int minimumReorderQty) {
		this.minimumReorderQty = minimumReorderQty;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partNo == null) ? 0 : partNo.hashCode());
		result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductSupplier other = (ProductSupplier) obj;
		if (partNo == null) {
			if (other.partNo != null)
				return false;
		} else if (!partNo.equals(other.partNo))
			return false;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		return true;
	}

	
	
	

	

}
