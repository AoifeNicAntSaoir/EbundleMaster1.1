import java.util.Date;

public class Restaurant
{

    private int restID;
    private String restName;
    private RestaurantType restType;
    private RestaurantLocation restLocation;


    public Restaurant(int restID,String restName,RestaurantType restType,
                      RestaurantLocation restLocation)
    {
        setRestID(restID);
        setRestName(restName);
        setRestType(restType);
        setRestLocation(restLocation);

    }

    public String getRestName()
    {
        return restName;
    }

    public void setRestName(String restName)
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

    public void setRestID(int restID)
    {
        restID = restID;
    }
}
