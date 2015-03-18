package home.skilllsUp.contactService.model;

public class Hobby{
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        checkForNull(title);
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        checkForNull(description);
        this.description = description;
    }

    public String toString(){
        return title;
    }

    private <T> void checkForNull(T t){
        if (t == null){
            throw new IllegalArgumentException("Argument should not be null");
        }
    }
}
