import java.util.Date;

public class Restaurant
{

    private String restID;
    private String restName;
    private String restType;
    private String restLocation;


    public Restaurant(String restID,String restName,String restType,
                      String restLocation)
    {
        setRestID(restID);
        setRestName(restName);
        setRestType(restType);
        setRestLocation(restLocation);

    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        restName = restName;
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
}
