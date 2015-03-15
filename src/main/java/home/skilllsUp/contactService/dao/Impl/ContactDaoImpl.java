package home.skilllsUp.contactService.dao.Impl;

import home.skilllsUp.contactService.dao.ContactDao;
import home.skilllsUp.contactService.model.Contact;

import java.util.LinkedList;
import java.util.List;

public class ContactDaoImpl implements ContactDao{

    private List<Contact> contactList;

    @Override
    public void addContact(Contact contact) {
        if (contactList == null){
            contactList = new LinkedList<Contact>();
        }
        contactList.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        if (contactList != null){
            contactList.remove(contact);
        }
    }

    @Override
    public void addFriendship(Contact first, Contact second) {
        first.setFriend(second);
        second.setFriend(first);
    }

    @Override
    public List<Contact> getContactList(){
        return contactList;
    }

    @Override
    public Contact getContactByName(String firstName, String lastName) {
        if (contactList == null){
            return null;
        }
        for (Contact contact: contactList){
            if (contact.getFirstName().equals(firstName) &&
                    contact.getLastName().equals(lastName)){
                return contact;
            }
        }
        return null;
    }
}
