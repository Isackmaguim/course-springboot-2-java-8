package com.isaias.course.entities.enums;

public enum OrderStatus {
	
	WAITTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	
	private int code;
	
	// Criando o construtor
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	// Ocodigo vai pecorrer todos os valores do OrderStatus e tornar o valor correspondente ao codigo
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid OrderStatus code -- codigo ivalido!");
	}

}
