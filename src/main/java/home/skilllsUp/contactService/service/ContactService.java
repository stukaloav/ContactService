package home.skilllsUp.contactService.service;

import home.skilllsUp.contactService.model.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ContactService {

    void createContact(String firstName, String lastName, LocalDate birthDate);
    void addHobby(String title, String description);
    void addPlace(String title, String description, double longitude, double latitude);
    void addFriendship(Contact first, Contact second);
    Contact getContactByName(String firstName, String lastName);

    Collection<Contact> getFriendList(Contact contact);
    Collection<Message> getConversation(Contact first, Contact second);

    List<Contact> getAllContacts();
    Set<Hobby> getAllHobbies();

    List<Contact> getAllContactsWithHobby(Hobby hobby);
}
