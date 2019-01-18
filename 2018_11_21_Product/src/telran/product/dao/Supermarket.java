package telran.product.dao;

import telran.product.data.*;

public class Supermarket {
	
	private Product[] products;
	private int size;
		
	
	public Supermarket(int capacity) {
		products = new Product[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public boolean addProduct(Product product) {
		if(size<products.length) {
			products[size]=product;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean removeProduct (long barCode) {
		for (int i = 0; i < size; i++) {
			if(products[i].equals(barCode)) {
				products[i]=products[size-1];
				size--;
				return true;
			}
		}
		return false;
	}
	
	public Product findByBarCode(long barCode) {
		for (int i = 0; i < size; i++) {
			if(barCode==products[i].getBarCode()) {
				return products[i];
			}
		}
		return null;
	}
	
	public Product[] findByCategory(String category, int numberOfItems) {
		Product[] p2 = new Product[numberOfItems];
		int size1=0;
		for (int i = 0; i < size; i++) {
			if(products[i].getCategory()==category && size<numberOfItems) {
				p2[size1]=products[i];
				size1++;
		}
	}
		return p2;
	}
	
	
	public Product[] findByBrand (String brand, int numberOfItems) {
		Product[] p3 = new Product[numberOfItems];
		int size1=0;
		for (int i = 0; i < size; i++) {
			if(products[i].getCategory()==brand && size<numberOfItems) {
				p3[size1]=products[i];
				size1++;
		}
	}
		return p3;
	}
	

}
