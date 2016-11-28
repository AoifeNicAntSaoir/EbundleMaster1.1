
public class FindRestaurantTester {
    public static void main(String args[]) {
        RestaurantList restaurantList = new RestaurantList();
        initialiseRestaurant(restaurantList);

        Restaurant customerRequest = new Restaurant(1,RestaurantName.LANA,
                RestaurantType.CHINESE,RestaurantLocation.KERRY);

        Restaurant restaurant = restaurantList.search(customerRequest);

        if(restaurant != null) {
            System.out.println("Restaurant found: " +
                    restaurant.getRestName() + " " + restaurant.getRestType() + " " +
                    restaurant.getRestLocation());}
        else {
            System.out.println("Restaurant not avaliable");}
    }

    private static void initialiseRestaurant(RestaurantList restaurantList) {
        restaurantList.addRestaurant(1,RestaurantName.LANA,
                RestaurantType.CHINESE,RestaurantLocation.KERRY);
        restaurantList.addRestaurant(2,RestaurantName.MILANO,
                RestaurantType.ITALIAN,RestaurantLocation.LIMERICK);
        restaurantList.addRestaurant(3,RestaurantName.LA_PENICHE,
                RestaurantType.FRENCH,RestaurantLocation.DUBLIN);
        restaurantList.addRestaurant(4,RestaurantName.THAI_PALACE,
                RestaurantType.THAI,RestaurantLocation.CLARE);

    }
}
