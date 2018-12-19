package com.offcn.crm.interfacesImpl;

import org.springframework.stereotype.Component;

import com.offcn.crm.interfaces.MathCaculator;
@Component
public class MathCaculatorImpl implements MathCaculator {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void substract(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

}
