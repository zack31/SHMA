package com.zak.services.implementations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zak.dao.interfaces.ITestDaoAppell;

@Component
@Path("/a")
public class TestService {

	@Autowired
	ITestDaoAppell testDaoAppell;

	@GET
	@Path("/b")
	public Response savePayment() {

		String result = testDaoAppell.save();

		return Response.status(200).entity(result).build();

	}

}