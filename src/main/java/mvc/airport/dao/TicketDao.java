package mvc.airport.dao;

import mvc.airport.entity.Ticket;
import mvc.airport.util.ConnectionManager;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketDao implements Dao<Long, Ticket> {

    private static final TicketDao INSTANCE = new TicketDao();

    public static final String FIND_ALL_BY_FLIGHT_ID = """
            SELECT *
            FROM ticket
            WHERE flight_id = ?
            """;

    private TicketDao() {
    }

    public static TicketDao getInstance() {
        return INSTANCE;
    }

    public List<Ticket> findAllByFlightId(Long flightId) {
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(FIND_ALL_BY_FLIGHT_ID)) {
            preparedStatement.setObject(1, flightId);

            var resultSet = preparedStatement.executeQuery();
            List<Ticket> tickets = new ArrayList<>();
            while (resultSet.next()) {
                tickets.add(buildTicket(resultSet));
            }

            return tickets;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    private Ticket buildTicket(ResultSet resultSet) throws SQLException {
        return Ticket.builder()
                .id(resultSet.getObject("id", Long.class))
                .passengerNo(resultSet.getObject("passenger_no", String.class))
                .passengerName(resultSet.getObject("passenger_name", String.class))
                .flightId(resultSet.getObject("flight_id", Long.class))
                .seatNo(resultSet.getObject("seat_no", String.class))
                .cost(resultSet.getObject("cost", BigDecimal.class))
                .build();
    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Ticket entity) {

    }

    @Override
    public Ticket save(Ticket entity) {
        return null;
    }
}
