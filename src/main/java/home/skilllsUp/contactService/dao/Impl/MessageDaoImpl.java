package home.skilllsUp.contactService.dao.Impl;

import home.skilllsUp.contactService.dao.MessageDao;
import home.skilllsUp.contactService.model.*;

import java.util.LinkedList;
import java.util.List;

public class MessageDaoImpl implements MessageDao{
    private List<Message> messageList;

    @Override
    public void storeMessage(Message message) {
        if (messageList == null){
            messageList = new LinkedList<Message>();
        }
        messageList.add(message);
    }

    @Override
    public List<Message> getConversation(Contact first, Contact second) {
        if (messageList == null){
            return null;
        }
        List<Message> conversation = new LinkedList<Message>();
        for (Message message: messageList){
            if ((message.getFrom().equals(first) && message.getTo().equals(second)) ||
                    (message.getTo().equals(first) && message.getFrom().equals(second))){
                conversation.add(message);
            }
        }
        return conversation;
    }
}
