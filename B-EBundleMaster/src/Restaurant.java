import java.util.Date;

public class Restaurant {

    private int restID;
    private RestaurantName restName;
    private RestaurantType restType;
    private RestaurantLocation restLocation;


    public Restaurant(int restID,RestaurantName restName,RestaurantType restType,
                      RestaurantLocation restLocation) {
        setRestID(restID);
        setRestName(restName);
        setRestType(restType);
        setRestLocation(restLocation);}

    public RestaurantName getRestName()
    {
        return restName;
    }

    public void setRestName(RestaurantName restName)
    {
        restName = restName;
    }

    public RestaurantType getRestType()
    {
        return restType;
    }

    public void setRestType(RestaurantType restType)
    {
        restType = restType;
    }

    public RestaurantLocation getRestLocation()
    {
        return restLocation;
    }

    public void setRestLocation(RestaurantLocation restLocation)
    {
        restLocation = restLocation;
    }

    public int getRestID()
    {
        return restID;
    }

    public void setRestID(int restID) {restID = restID;}
}
