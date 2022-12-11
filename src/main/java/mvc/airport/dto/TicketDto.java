package mvc.airport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class TicketDto {

    Long id;
    Long flightId;
    String seatNo;

}
