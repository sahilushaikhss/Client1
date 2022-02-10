package RestClient.Client.binding;

import lombok.Data;

import java.util.List;

@Data
public class FlightsDetail {
    private List<Flight> flights;
}
