package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.Ticket;
import ru.netology.manager.Manager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RepositoryTest {
    private Repository repo = new Repository();
    private Manager man = new Manager(repo);

    private Ticket firstTicket = new Ticket(1, 2100, "KUF", "EGO", 95);
    private Ticket secondTicket = new Ticket(2, 2110, "DME", "OGZ", 100);
    private Ticket thirdTicket = new Ticket(3, 2099, "KUF", "EGO", 110);
    private Ticket forthTicket = new Ticket(4, 2230, "DME", "OGZ", 90);
    private Ticket fifthTicket = new Ticket(5, 1890, "KUF", "EGO", 95);
    private Ticket sixthTicket = new Ticket(6, 2143, "DME", "OGZ", 85);
    private Ticket seventhTicket = new Ticket(7, 1946, "KUF", "EGO", 95);

    @BeforeEach
    void setUp() {
        man.add(firstTicket);
        man.add(secondTicket);
        man.add(thirdTicket);
        man.add(forthTicket);
        man.add(fifthTicket);
        man.add(sixthTicket);
        man.add(seventhTicket);
    }

    @Test
    void shouldFindById() {
        int expected = 3;
        Ticket actual = repo.findById(3);
        assertEquals(expected, actual.getId());
    }

    @Test
    void shouldFindById1() {
        Ticket[] expected = new Ticket[]{firstTicket, secondTicket, thirdTicket, forthTicket, fifthTicket, sixthTicket, seventhTicket};
        repo.findById(9);
        Ticket[] actual = repo.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldRemoveById() {
        Ticket[] expected = new Ticket[]{firstTicket, secondTicket, thirdTicket, forthTicket, fifthTicket, seventhTicket};
        repo.removeById(6);
        Ticket[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
}