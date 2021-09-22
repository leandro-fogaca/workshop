package com.moufog.workshop.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.moufog.workshop.entities.pk.OrderItemPK;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId  // Usado para id composto
	private OrderItemPK id = new OrderItemPK();
	private Integer quantity;
	private double price;

	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, double price) {
		super();
		id.setOrder(order); // Instanciar o pedido e o produto dentro do item de pedido.
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	// Get e Set para interagir com a classe pedido.
	@JsonIgnore // Evitar o looping
	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder() {
		id.setOrder(getOrder());
	}

	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct() {
		id.setProduct(getProduct());
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

}
