package com.consult.io;


	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	 
	@Path("/ptok")
	public class PtoKService {
		@GET
		@Produces("application/xml")
		public String convertCtoF() {
	 
			Double kg;
			Double pound = 40.0;
			kg = (pound * 0.453592);
	 
			String result = "@Produces(\"application/xml\") Output: \n\nP to Kg Converter Output: \n\n" + kg;
			return "<ptokservice>" + "<pound>" + pound + "</pound>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}
	 
		@Path("{p}")
		@GET
		@Produces("application/xml")
		public String convertCtoFfromInput(@PathParam("p") Double p) {
			Double kg;
			Double pound = p;
			kg = (pound * 0.453592);
	 
			String result = "@Produces(\"application/xml\") Output: \n\nP to Kg Converter Output: \n\n" + kg;
			return "<ptokservice>" + "<pound>" + pound + "</pound>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}	
}
