package home.skilllsUp.contactService.dao;

import home.skilllsUp.contactService.model.*;

import java.util.Collection;

public interface PlaceDao {
    void addPlace(Place place);
    Collection<Contact> getAllContactsForPlace(Place place);
}
