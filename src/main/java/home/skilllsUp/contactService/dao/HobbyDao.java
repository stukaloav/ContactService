package home.skilllsUp.contactService.dao;

import home.skilllsUp.contactService.model.Hobby;

import java.util.Set;

public interface HobbyDao {
    void addHobby(Hobby hobby);
    Set<Hobby> getHobbies();
}
