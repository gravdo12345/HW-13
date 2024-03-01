package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TicketCrudService {

    private final SessionFactory sessionFactory;

    public TicketCrudService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveTicket(Ticket ticket) {
        if (ticket == null || ticket.getClient() == null || ticket.getFromPlanet() == null || ticket.getToPlanet() == null) {
            throw new IllegalArgumentException("Ticket, client, fromPlanet, and toPlanet must not be null");
        }
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
        }
    }

    public Ticket getTicketById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Ticket.class, id);
        }
    }

    public List<Ticket> getAllTickets() {
        try (Session session = sessionFactory.openSession()) {
            Query<Ticket> query = session.createQuery("from Ticket", Ticket.class);
            return query.list();
        }
    }

    public void deleteTicket(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(ticket);
            transaction.commit();
        }
    }
}
