package com.straw.test.drools.bean.dto;

public class FactorialDTO {
	private int n;
	private int v = 1;
	
	public FactorialDTO(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
}
