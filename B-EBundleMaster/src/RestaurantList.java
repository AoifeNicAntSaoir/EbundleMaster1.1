
import java.util.LinkedList;
import java.util.List;


public class RestaurantList {
    private List<Restaurant> restaurants;

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
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getRestID() == (restID)) {
                return restaurant;
            }
        }
        return null;
    }

    public Restaurant search(Restaurant searchRestaurant) {
        for (Restaurant restaurant : restaurants) {
            RestaurantName restName = searchRestaurant.getRestName();
            if ((restName != null) && (!restName.equals((""))) &&
                    (!restName.equals(restaurant.getRestName())))
                continue;

            RestaurantType restType = searchRestaurant.getRestType();
            if ((restType != null) && (!restType.equals((""))) &&
                    (!restType.equals(restaurant.getRestType())))
                continue;

            RestaurantLocation restLocation = searchRestaurant.getRestLocation();
            if ((restLocation != null) && (!restLocation.equals((""))) &&
                    (!restLocation.equals(restaurant.getRestLocation())))
                continue;
            return restaurant;
        }
        return null;
    }
}
