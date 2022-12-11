package mvc.airport.dao;

import mvc.airport.entity.Flight;
import mvc.airport.entity.FlightStatus;
import mvc.airport.util.ConnectionManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightDao implements Dao<Long, Flight> {

    private static final FlightDao INSTANCE = new FlightDao();

    private static final String FIND_ALL = """
            SELECT *
            FROM flight
            """;

    private FlightDao() {
    }

    public static FlightDao getInstance() {
        return INSTANCE;
    }

    @Override
    public List<Flight> findAll() {
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(FIND_ALL)) {
            var resultSet = preparedStatement.executeQuery();
            List<Flight> flights = new ArrayList<>();
            while (resultSet.next()) {
                flights.add(buildFlight(resultSet));
            }

            return flights;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Flight entity) {

    }

    @Override
    public Flight save(Flight entity) {
        return null;
    }

    private Flight buildFlight(ResultSet resultSet) throws SQLException {
        return Flight.builder()
                .id(resultSet.getObject("id", Long.class))
                .flightNo(resultSet.getObject("flight_no", String.class))
                .departureDate(resultSet.getObject("departure_date", Timestamp.class).toLocalDateTime())
                .departureAirportCode(resultSet.getObject("departure_airport_code", String.class))
                .arrivalDate(resultSet.getObject("arrival_date", Timestamp.class).toLocalDateTime())
                .arrivalAirportCode(resultSet.getObject("arrival_airport_code", String.class))
                .aircraftId(resultSet.getObject("aircraft_id", Integer.class))
                .status(FlightStatus.valueOf(resultSet.getObject("status", String.class)))
                .build();
    }


}
