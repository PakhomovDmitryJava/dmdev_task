package mvc.airport.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FlightDto {

    Long id;
    String description;

}
