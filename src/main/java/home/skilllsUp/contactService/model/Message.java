package home.skilllsUp.contactService.model;

import java.time.LocalDate;

public class Message {private LocalDate date;
    private Contact from;
    private Contact to;
    private String content;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public String toString(){
        StringBuilder strB = new StringBuilder();
        strB.append("message: " + content + "\n");
        strB.append("from: " + from + ", ");
        strB.append("to: " + to + " " + date);
        return strB.toString();
    }
}
