package RestClient.Client.apiUrl;

import RestClient.Client.binding.Flight;
import RestClient.Client.binding.FlightsDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class QuoteApi
{

public String invokeRandomApiUrl(){
        String url="http://mu.mulesoft-training.com/essentials/united/flights";

        RestTemplate rt=new RestTemplate();
        ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
        int statusCode = responseEntity.getStatusCodeValue();

        if (statusCode == 200) {
        String body = responseEntity.getBody();
        return body;
        }
        return null;
        }

public FlightsDetail invokeApiUrl(){
        String url1="http://mu.mulesoft-training.com/essentials/united/flights/";

        RestTemplate rt=new RestTemplate();
        ResponseEntity<FlightsDetail> responseEntity = rt.getForEntity(url1, FlightsDetail.class);

        FlightsDetail body = responseEntity.getBody();

        List<Flight> flights = body.getFlights();

        flights.forEach(fly -> System.out.println(fly));
        return body;
        }
}