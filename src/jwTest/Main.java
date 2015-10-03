package jwTest;

import com.sun.jersey.api.client.*;
import models.*;

public class Main {

	public static void main(String[] args) {
		
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/jwService/data/webservice/retrieveall");
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		
		if(response.getStatus() != 200) {
			throw new RuntimeException("Failed");
		}
		
		String result = response.getEntity(String.class);
		System.out.println(result);
	}

}
