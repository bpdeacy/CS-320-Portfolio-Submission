import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        assertEquals(contact, service.getContact("1001"));
    }

    @Test
    void testAddDuplicateContactId() {
        Contact contact1 = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        Contact contact2 = new Contact(
                "1001",
                "John",
                "Smith",
                "0987654321",
                "456 Oak Street");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    void testAddNullContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(null);
        });
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);
        service.deleteContact("1001");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("1001");
        });
    }

    @Test
    void testDeleteMissingContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("9999");
        });
    }

    @Test
    void testUpdateFirstName() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);
        service.updateFirstName("1001", "Brian");

        assertEquals("Brian", service.getContact("1001").getFirstName());
    }

    @Test
    void testUpdateLastName() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);
        service.updateLastName("1001", "Smith");

        assertEquals("Smith", service.getContact("1001").getLastName());
    }

    @Test
    void testUpdatePhone() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);
        service.updatePhone("1001", "0987654321");

        assertEquals("0987654321", service.getContact("1001").getPhone());
    }

    @Test
    void testUpdateAddress() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);
        service.updateAddress("1001", "456 Oak Street");

        assertEquals("456 Oak Street", service.getContact("1001").getAddress());
    }

    @Test
    void testUpdateMissingContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("9999", "John");
        });
    }

    @Test
    void testInvalidUpdatedFirstName() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("1001", "BryanBryanB");
        });
    }

    @Test
    void testInvalidUpdatedPhone() {
        Contact contact = new Contact(
                "1001",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        service.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updatePhone("1001", "12345");
        });
    }
}