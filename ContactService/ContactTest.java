import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContact() {
        Contact contact = new Contact(
                "1234567890",
                "Bryan",
                "Deacy",
                "1234567890",
                "123 Main Street");

        assertEquals("1234567890", contact.getContactId());
        assertEquals("Bryan", contact.getFirstName());
        assertEquals("Deacy", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345678901",
                    "Bryan",
                    "Deacy",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "Bryan",
                    "Deacy",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "BryanBryanB",
                    "Deacy",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    null,
                    "Deacy",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "DeacyDeacyD",
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    null,
                    "1234567890",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    "123456789",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    "12345678901",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneContainsLetters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    "12345abcde",
                    "123 Main Street");
        });
    }

    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    null,
                    "123 Main Street");
        });
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    "1234567890",
                    "1234567890123456789012345678901");
        });
    }

    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Bryan",
                    "Deacy",
                    "1234567890",
                    null);
        });
    }
}