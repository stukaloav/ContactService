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
        checkForNull(title);
        this.title = title;
    }

    public void setLongitude(double longitude) {
        checkForNull(longitude);
        if (longitude < 0){
            throw new IllegalArgumentException("Longitude should not be negative");
        }else if(longitude > 180){
            throw new IllegalArgumentException("Longitude should not be more than 180 degrees");
        }
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        checkForNull(latitude);
        if (latitude < 0){
            throw new IllegalArgumentException("Latitude should not be negative");
        }else if(latitude > 90){
            throw new IllegalArgumentException("Latitude should not be more than 90 degrees");
        }
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        checkForNull(description);
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

    private <T> void checkForNull(T t){
        if (t == null){
            throw new IllegalArgumentException("Argument should not be null");
        }
    }

}
