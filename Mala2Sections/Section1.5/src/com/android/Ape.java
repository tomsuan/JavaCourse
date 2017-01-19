package com.android;

class Ape implements Behaviour{

	@Override
	public void jealous() {
		System.out.println("I am a jealous ape");
		
	}

	@Override
	public void anger() {
		System.out.println("I am a angry ape");
		
	}

	@Override
	public void joy() {
		System.out.println("I am a joyous ape");
		
	}
	
}
