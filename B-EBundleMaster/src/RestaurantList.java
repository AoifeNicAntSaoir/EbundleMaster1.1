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

    public void addRestaurant(int restID,RestaurantName restName,RestaurantType restType,
                              RestaurantLocation restLocation) {
        Restaurant restaurant = new Restaurant(restID,restName,restType,restLocation);

        restaurants.add(restaurant);
    }

    public Restaurant getRestaurant(int restID) {
        for(Iterator i = restaurants.iterator();i.hasNext();)
        {
            Restaurant restaurant = (Restaurant)i.next();
            if(restaurant.getRestID() == (restID))
            {
                return restaurant;
            }
        }
        return null;
    }

    public Restaurant search(Restaurant searchRestaurant) {
        for(Iterator i = restaurants.iterator();i.hasNext();) {
            Restaurant restaurant = (Restaurant)i.next();

            RestaurantName restName = searchRestaurant.getRestName();
            if((restName!= null) && (!restName.equals((""))) &&
                    (!restName.equals(restaurant.getRestName())))
                continue;

            RestaurantType restType = searchRestaurant.getRestType();
            if((restType != null) && (!restType.equals((""))) &&
                    (!restType.equals(restaurant.getRestType())))
                continue;

            RestaurantLocation restLocation = searchRestaurant.getRestLocation();
            if((restLocation != null) && (!restLocation.equals((""))) &&
                    (!restLocation.equals(restaurant.getRestLocation())))
                continue;
        }
        return null;
    }
}
