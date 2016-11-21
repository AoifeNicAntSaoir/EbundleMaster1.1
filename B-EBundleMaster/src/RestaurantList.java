import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class RestaurantList
{
    private List restaurants;

    public RestaurantList()
    {
        restaurants = new LinkedList();
    }

    public void addRestaurant(String restID,String restName,String restType,
                              String restLocation)
    {
        Restaurant restaurant = new Restaurant(restID,restName,restType,restLocation);

        restaurants.add(restaurant);
    }

    public Restaurant getRestaurant(String restID)
    {
        for(Iterator i = restaurants.iterator();i.hasNext();)
        {
            Restaurant restaurant = (Restaurant)i.next();
            if(restaurant.getRestID().equals(restID))
            {
                return restaurant;
            }
        }
        return null;
    }

    public Restaurant search(Restaurant searchRestaurant)
    {
        for(Iterator i = restaurants.iterator();i.hasNext();)
        {
            Restaurant restaurant = (Restaurant)i.next();

            String restName = searchRestaurant.getRestName();
            if((restName!= null) && (!restName.equals((""))) &&
                    (!restName.equals(restaurant.getRestName())))
                continue;

            String restType = searchRestaurant.getRestType();
            if((restType != null) && (!restType.equals((""))) &&
                    (!restType.equals(restaurant.getRestType())))
                continue;

            String restLocation = searchRestaurant.getRestLocation();
            if((restLocation != null) && (!restLocation.equals((""))) &&
                    (!restLocation.equals(restaurant.getRestLocation())))
                continue;
        }
        return null;
    }


}
