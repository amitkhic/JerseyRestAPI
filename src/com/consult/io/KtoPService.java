package com.consult.io;

	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.Response;
	import org.json.JSONException;
	import org.json.JSONObject;
	 
	@Path("/ktop")
	public class KtoPService {
	 
		  @GET
		  @Produces("application/json")
		  public Response convertFtoC() throws JSONException {
	 
			JSONObject jsonObject = new JSONObject();
			Double kg = 98.0;
			Double pound;
			pound = (kg * 2.20462) ; 
			jsonObject.put("Kg Value", kg); 
			jsonObject.put("Pound Value", pound);
	 
			String result = "@Produces(\"application/json\") Output: \n\nK to P Converter Output: \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		  }
	 
		  @Path("{kg}")
		  @GET
		  @Produces("application/json")
		  public Response convertFtoCfromInput(@PathParam("kg") float kg) throws JSONException {
	 
			JSONObject jsonObject = new JSONObject();
			double pound;
			pound =  (kg * 2.20462); 
			jsonObject.put("Kg Value", kg); 
			jsonObject.put("Pound Value", pound);
	 
			String result = "@Produces(\"application/json\") Output: \n\nK to P Converter Output: \n\n" + jsonObject;
			return Response.status(200).entity(result).build();
		  }
	
}
