package com.adapter.design.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 testClassAdapter();
	}

	
	 private static void testClassAdapter() {
	        SocketAdapter sockAdapter = new SocketAdapterImpl();
	        Volts v3 = getVolt(sockAdapter,3);
	        Volts v12 = getVolt(sockAdapter,12);
	        Volts v120 = getVolt(sockAdapter,120);
	        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
	        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
	        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	    }
	     
	    private static Volts getVolt(SocketAdapter sockAdapter, int i) {
	        switch (i){
	        case 3: return sockAdapter.get3Volt();
	        case 12: return sockAdapter.get12Volt();
	        case 120: return sockAdapter.get120Volt();
	        default: return sockAdapter.get120Volt();
	        }
	    }
}
