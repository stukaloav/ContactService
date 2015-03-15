package home.skilllsUp.contactService.dao.Impl;

import home.skilllsUp.contactService.dao.HobbyDao;
import home.skilllsUp.contactService.model.Hobby;

import java.util.HashSet;
import java.util.Set;

public class HobbyDaoImpl implements HobbyDao{
    private Set<Hobby> hobbySet;

    @Override
    public void addHobby(Hobby hobby) {
        if (hobbySet == null){
            hobbySet = new HashSet<Hobby>();
        }
        hobbySet.add(hobby);
    }

    @Override
    public Set<Hobby> getHobbies() {
        return hobbySet;
    }

}
