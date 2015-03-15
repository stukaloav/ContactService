package home.skilllsUp.contactService.dao;

import home.skilllsUp.contactService.model.*;

import java.util.Collection;

public interface MessageDao {
    void storeMessage(Message message);
    Collection<Message> getConversation(Contact first, Contact second);
}
