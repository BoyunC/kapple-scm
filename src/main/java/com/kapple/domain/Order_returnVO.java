package com.kapple.domain;

import lombok.Data;

@Data
public class Order_returnVO {
	private String order_return;
	private String supple_no;
	private String compo_no;
	private Long quantity;
	private Long price;
	private String remarks;
}