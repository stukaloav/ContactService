package home.skilllsUp.contactService.model;

public class Place {
    private String title;
    private double longitude;
    private double latitude;
    private String description;

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        StringBuilder strB = new StringBuilder();
        strB.append(title + " ").
                append("[" + longitude).
                append(", " + latitude + "]");
        return strB.toString();
    }
}
