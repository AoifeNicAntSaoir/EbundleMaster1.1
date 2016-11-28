import java.util.*;

/**
 * Created by dylantiklunchan on 21/11/2016.
 */

public class HotelList {

    private List hotels;

    public HotelList(){

        hotels = new LinkedList();
    }

    public void addHotel(int hotelId, String nameOfHotel, String street, String town, String county, String roomType,
                         Calendar checkInDate, Calendar checkOutDate){

        Hotel hotel = new Hotel(hotelId, nameOfHotel, street, town, county, roomType,
                                  checkInDate, checkOutDate);

        hotels.add(hotel);
    }

    public Hotel getHotel(int hotelId){

        for (Iterator i = hotels.iterator(); i.hasNext();){

            Hotel hotel = (Hotel)i.next();
                if(hotel.getHotelId() == (hotelId)) {

                    return hotel;

            }
        }

        return  null;
    }

    public Hotel search(Hotel searchHotel){
        for(Iterator i = hotels.iterator(); i.hasNext(); ){
            Hotel hotel = (Hotel) i.next();
            //ignores HotelId because it is unique.
            String nameOfHotel = searchHotel.getNameOfHotel();
                if((nameOfHotel != null) && (!nameOfHotel.equals("")) &&
                        (!nameOfHotel.equals((hotel.getNameOfHotel()))))
                    continue;

            String street = searchHotel.getStreet();
            if((street != null) && (!street.equals("")) &&
                    (!street.equals((hotel.getStreet()))))
                    continue;

            String town = searchHotel.getTown();
            if((town != null) && (!town.equals("")) &&
                    (!town.equals((hotel.getTown()))))
                continue;

            String county = searchHotel.getCounty();
            if((county != null) && (!county.equals("")) &&
                    (!county.equals((hotel.getCounty()))))
                continue;

            String roomType = searchHotel.getRoomType();
            if((roomType != null) && (!roomType.equals("")) &&
                    (!roomType.equals((hotel.getRoomType()))))
                continue;

            Calendar checkInDate = searchHotel.getCheckInDate();
            if((checkInDate != null) && (!checkInDate.equals("")) &&
                    (!checkInDate.equals((hotel.getCheckInDate()))))
                continue;

            Calendar checkOutDate = searchHotel.getCheckOutDate();
            if((checkOutDate != null) && (!checkOutDate.equals("")) &&
                    (!checkOutDate.equals((hotel.getCheckOutDate()))))
                continue;

            return hotel;

        }

        return null;
    }
}
