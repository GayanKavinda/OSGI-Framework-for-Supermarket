package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Publisher_Hotel Start");
		ServicePublish_HotelMain publishService = new ServicePublish_HotelMainImpl();	//
		publishServiceRegistration = context.registerService(ServicePublish_HotelMain.class.getName(), publishService, null);
		
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher_Hotel Stop");
		publishServiceRegistration.unregister();
	}

}



