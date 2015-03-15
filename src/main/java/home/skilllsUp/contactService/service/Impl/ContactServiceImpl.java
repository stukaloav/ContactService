package home.skilllsUp.contactService.service.Impl;

import home.skilllsUp.contactService.dao.*;
import home.skilllsUp.contactService.model.*;
import home.skilllsUp.contactService.service.ContactService;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ContactServiceImpl implements ContactService{
    private HobbyDao hobbyDao;
    private ContactDao contactDao;
    private MessageDao messageDao;
    private PlaceDao placeDao;


    @Override
    public void createContact(String firstName, String lastName, LocalDate birthDate) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setBirthDate(birthDate);
        contactDao.addContact(contact);
    }

    @Override
    public void addHobby(String title, String description) {
        Hobby hobby = new Hobby();
        hobby.setTitle(title);
        hobby.setDescription(description);
        hobbyDao.addHobby(hobby);
    }

    @Override
    public void addPlace(String title, String description, double longitude, double latitude) {
        Place place = new Place();
        place.setTitle(title);
        place.setDescription(description);
        place.setLongitude(longitude);
        place.setLatitude(latitude);
        placeDao.addPlace(place);
    }

    @Override
    public void addFriendship(Contact first, Contact second) {
        contactDao.addFriendship(first, second);
    }

    @Override
    public Collection<Contact> getFriendList(Contact contact) {
        return contact.getFriends();
    }

    @Override
    public Collection<Message> getConversation(Contact first, Contact second) {
        return messageDao.getConversation(first, second);
    }

    public HobbyDao getHobbyDao() {
        return hobbyDao;
    }

    public void setHobbyDao(HobbyDao hobbyDao) {
        this.hobbyDao = hobbyDao;
    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public MessageDao getMessageDao() {
        return messageDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public PlaceDao getPlaceDao() {
        return placeDao;
    }

    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    @Override
    public List<Contact> getAllContacts(){
        return contactDao.getContactList();
    }

    @Override
    public Set<Hobby> getAllHobbies() {
        return hobbyDao.getHobbies();
    }


    @Override
    public List<Contact> getAllContactsWithHobby(Hobby hobby) {
        List<Contact> contactList = contactDao.getContactList();
        if (contactList == null){
            return null;
        }
        List<Contact> contactsWithHobby = new LinkedList<Contact>();
        for (Contact contact: contactList){
            if (contact.getHobbies() != null){
                if (contact.getHobbies().contains(hobby)){
                    contactsWithHobby.add(contact);
                }
            }
        }
        return contactsWithHobby;
    }

    @Override
    public Contact getContactByName(String firstName, String lastName) {
        return contactDao.getContactByName(firstName, lastName);
    }
}
