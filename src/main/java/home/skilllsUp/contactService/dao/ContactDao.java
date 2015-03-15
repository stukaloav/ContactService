package home.skilllsUp.contactService.dao;

import home.skilllsUp.contactService.model.Contact;

import java.util.List;

public interface ContactDao {
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    void addFriendship(Contact first, Contact second);
    List<Contact> getContactList();
    Contact getContactByName(String firstName, String lastName);
}
