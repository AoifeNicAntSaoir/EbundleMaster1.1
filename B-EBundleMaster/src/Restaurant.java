import java.util.Date;

public class Restaurant
{

    private String restID;
    private String restName;
    private String restType;
    private String restLocation;
    private Date bookingDate;

    public Restaurant(String restID,String restName,String restType,
                      String restLocation, Date bookingDate)
    {
        setRestID(restID);
        setRestName(restName);
        setRestType(restType);
        setRestLocation(restLocation);
        setBookingDate(bookingDate);
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        RestName = restName;
    }

    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        restType = restType;
    }

    public String getRestLocation() {
        return restLocation;
    }

    public void setRestLocation(String restLocation) {
        restLocation = restLocation;
    }

    public String getRestID() {
        return restID;
    }

    public void setRestID(String restID) {
        restID = restID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }



}
