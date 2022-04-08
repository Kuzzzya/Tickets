package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.Ticket;
import ru.netology.repository.Repository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private Repository repo = new Repository();
    private Manager man = new Manager(repo);

    private Ticket firstTicket = new Ticket(1, 2100, "KUF", "EGO", 95);
    private Ticket secondTicket = new Ticket(2, 2110, "DME", "OGZ", 100);
    private Ticket thirdTicket = new Ticket(3, 2099, "KUF", "EGO", 110);
    private Ticket forthTicket = new Ticket(4, 2230, "DME", "OGZ", 90);
    private Ticket fifthTicket = new Ticket(5, 1890, "KUF", "EGO", 95);
    private Ticket sixthTicket = new Ticket(6, 2143, "DME", "OGZ", 85);
    private Ticket seventhTicket = new Ticket(7, 1946, "KUF", "EGO", 95);
    private Ticket eighthTicket = new Ticket(8, 2155, "KUF", "EGO", 93);
    private Ticket ninthTicket = new Ticket(9, 1993, "KUF", "EGO", 105);


    @BeforeEach
    void setUp() {
        man.add(firstTicket);
        man.add(secondTicket);
        man.add(thirdTicket);
        man.add(forthTicket);
        man.add(fifthTicket);
        man.add(sixthTicket);
        man.add(seventhTicket);
        man.add(eighthTicket);
        man.add(ninthTicket);
    }

    @Test
    void shouldGetAll() {
        Ticket[] tickets = new Ticket[]{seventhTicket, firstTicket, ninthTicket, eighthTicket, thirdTicket, forthTicket, secondTicket, fifthTicket, secondTicket};
        Ticket[] result = man.findAll("DME", "EGO");
        assertNotEquals(tickets, result);
    }

    @Test
    void shouldSearchCostBy() {
        Ticket[] tickets = new Ticket[]{ninthTicket, firstTicket, thirdTicket, eighthTicket, fifthTicket, seventhTicket};
        Ticket[] result = man.findAll("KUF", "EGO");
        Arrays.sort(tickets);
        assertArrayEquals(tickets, result);
    }


}