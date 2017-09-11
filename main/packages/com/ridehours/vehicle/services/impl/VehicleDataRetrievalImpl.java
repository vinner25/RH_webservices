package com.ridehours.vehicle.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.ridehours.domain.model.Vehicle;
import com.ridehours.vehicle.services.VehicleDataRetrieval;

public class VehicleDataRetrievalImpl implements VehicleDataRetrieval{

	@Override
	public List<Vehicle> fetchVehiclesByCity(int cityId) {
		
		System.out.println("Here "+cityId);
		Vehicle vehicle = new Vehicle();
		vehicle.setCity_id(1);
		vehicle.setVehicle_id(1);
		vehicle.setPickup_center_id(23);
		vehicle.setMake("Royal Enfield");
		vehicle.setModel("Classic 350");
		
		
		
		return new ArrayList<Vehicle>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{add(vehicle);}};
	}

}
