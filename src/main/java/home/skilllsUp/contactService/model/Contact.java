package home.skilllsUp.contactService.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<Hobby> hobbies;
    private Set<Place> places;
    private Set<Contact> friends;

    public void setHobby(Hobby hobby){
        checkForNull(hobby);
        if (hobbies == null){
            hobbies = new HashSet<Hobby>();
        }
        hobbies.add(hobby);
    }

    public void setPlace(Place place){
        checkForNull(place);
        if (places == null){
            places = new HashSet<Place>();
        }
        places.add(place);
    }

    public void setFirstName(String firstName){
        checkForNull(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        checkForNull(lastName);
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        checkForNull(birthDate);
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public Set<Contact> getFriends() {
        return friends;
    }

    public void setFriend(Contact friend) {
        checkForNull(friend);
        if (friends == null) {
            friends = new HashSet<Contact>();
        }
        friends.add(friend);
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    private <T> void checkForNull(T t){
        if (t == null) {
            throw new IllegalArgumentException("Argument should not be null");
        }
    }
}
