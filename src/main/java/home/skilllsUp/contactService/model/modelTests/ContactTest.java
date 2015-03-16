package home.skilllsUp.contactService.model.modelTests;

import home.skilllsUp.contactService.model.Contact;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testSetFirstName(){
        Contact contact = new Contact();
        String firstName = "First name";
        contact.setFirstName(firstName);
        assertEquals("setFirstName failed", firstName, contact.getFirstName());
    }


}
