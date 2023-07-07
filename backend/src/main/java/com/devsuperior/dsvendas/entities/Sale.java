package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* essas duas anotaçoês foi pra dizer ao banco que o id será chave estrangeira e tambem auto incrementavel*/
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne /* muitos para um*/
	@JoinColumn(name = "seller_id") /* quando temos uma relação muitos para um ,a chave estrangeira deve ser colocada no lado do muitos*/
	private Seller seller; /* um Sale(venda) tem e deve ter um vendedeor(Seller), Sale é uma classe dependente*/
	
	
	public Sale() {
		
	}


	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}

	
	public Seller getSeller() {
	    return seller;
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	
	

}

