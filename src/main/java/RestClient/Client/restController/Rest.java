package RestClient.Client.restController;

import RestClient.Client.apiUrl.QuoteApi;
import RestClient.Client.binding.Flight;
import RestClient.Client.binding.FlightsDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @Autowired
    QuoteApi quoteApi;

    @GetMapping("/url")
    public String apiUrl(){
        String quote = quoteApi.invokeRandomApiUrl();
       // String quote = quoteApi.invokeApiUrl();
        return "Success";
    }

    @GetMapping("/url1")
    public FlightsDetail flights() {
        FlightsDetail detail = quoteApi.invokeApiUrl();
        return detail;
    }
}
