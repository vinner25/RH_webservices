package com.ridehours.vehicle.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.ridehours.domain.model.Vehicle;

@Produces("application/json")
public interface VehicleDataRetrieval {

	
	@GET
	@Path("/fetchbycity/")
	public List<Vehicle> fetchVehiclesByCity(@QueryParam("cityid") int cityId);
	
	
	
	
	
}
