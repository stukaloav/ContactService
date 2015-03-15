package home.skilllsUp.contactService.dao.Impl;

import home.skilllsUp.contactService.dao.HobbyDao;
import home.skilllsUp.contactService.dao.PlaceDao;
import home.skilllsUp.contactService.model.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PlaceDaoImpl implements PlaceDao{

    private Set<Place> placeSet;
    private List<Contact> contactList;

    @Override
    public void addPlace(Place place) {
        if (placeSet == null){
            placeSet = new HashSet<Place>();
        }
        placeSet.add(place);
    }

    @Override
    public List<Contact> getAllContactsForPlace(Place place) {
        if (placeSet == null || placeSet == null){
            return null;
        }
        List<Contact> contacts = new LinkedList<Contact>();
        for (Contact contact: contactList){
            for (Place p: contact.getPlaces()){
                if (p.equals(place)){
                    contacts.add(contact);
                }
            }
        }
        return contacts;
    }
}
