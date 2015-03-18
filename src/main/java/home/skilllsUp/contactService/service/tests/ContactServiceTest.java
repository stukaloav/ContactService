package home.skilllsUp.contactService.service.tests;

import home.skilllsUp.contactService.dao.*;
import home.skilllsUp.contactService.model.*;
import home.skilllsUp.contactService.service.ContactService;
import home.skilllsUp.contactService.service.Impl.ContactServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {

    @Mock
    private HobbyDao hobbyDao;
    @Mock
    private ContactDao contactDao;
    @Mock
    private MessageDao messageDao;
    @Mock
    private PlaceDao placeDao;


    @InjectMocks
    ContactService contactService = new ContactServiceImpl();


    @Test
    public void createContactTest(){
        contactService.createContact("first name", "last name");
        verify(contactDao).addContact((Contact) anyObject());
    }

    @Test
    public void addHobbyTest(){
        contactService.addHobby("title", "description");
        verify(hobbyDao).addHobby((Hobby) anyObject());
    }

    @Test
    public void addPlaceTest(){
        contactService.addPlace("title", "description", 0.5, 1.25);
        verify(placeDao).addPlace((Place) anyObject());
    }

    @Test
    public void addFriendshipTest(){
        contactService.addFriendship((Contact) anyObject(), (Contact) anyObject());
        verify(contactDao).addFriendship((Contact) anyObject(), (Contact) anyObject());
    }

    public void getContactByNameTest(String firstName, String lastName){
    }

    public void getFriendListTest(Contact contact){

    }

    public void getConversationTest(Contact first, Contact second){

    }

    public void getAllContactsTest(){

    }

    public void getAllHobbiesTest(){

    }

    public void getAllContactsWithHobbyTest(Hobby hobby){

    }
}
