package home.skilllsUp.contactService.service;

import home.skilllsUp.contactService.model.*;
import home.skilllsUp.contactService.service.Impl.ContactServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("SpringConfig.xml");

        ContactServiceImpl jcs = (ContactServiceImpl) context.getBean("contactService");
        Contact contact1 = (Contact) context.getBean("contact1");
        Contact contact2 = (Contact) context.getBean("contact2");
        Place place1 = (Place) context.getBean("Dnepropetrovsk");
        Message message1 = (Message) context.getBean("message");
        Hobby hobby1 = (Hobby) context.getBean("hobby");

        jcs.createContact(contact1.getFirstName(), contact1.getLastName());
        jcs.createContact(contact2.getFirstName(), contact2.getLastName());
        Contact sasha = jcs.getContactByName(contact1.getFirstName(), contact1.getLastName());
        Contact luba = jcs.getContactByName(contact2.getFirstName(), contact2.getLastName());


        System.out.println(jcs.getAllContacts());
        jcs.addHobby(hobby1.getTitle(), hobby1.getDescription());
        sasha.setHobby(hobby1);
        System.out.println(jcs.getAllHobbies());
        System.out.println(jcs.getAllContactsWithHobby(hobby1));
        jcs.addFriendship(sasha, luba);
        System.out.println(sasha.getFriends());
        System.out.println(luba.getFriends());
        sasha.setPlace(place1);
        System.out.println(sasha.getPlaces());
    }
}