package com.ustglobal.object_class;

public class Product {
	int id;
	String name;
	String type;
	double cost;
	String bread;
	
	
	public Product(int id, String name, String type, double cost, String bread) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.bread = bread;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", bread=" + bread + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bread == null) ? 0 : bread.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Product other = (Product) obj;
		if (bread == null) {
			if (other.bread != null)
				return false;
		} else if (!bread.equals(other.bread))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	

}
