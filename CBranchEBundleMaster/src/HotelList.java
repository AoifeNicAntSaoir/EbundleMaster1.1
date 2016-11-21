import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dylantiklunchan on 21/11/2016.
 */

public class HotelList {

    private List hotels;

    public HotelList(){

        hotels = new LinkedList();
    }

    public void addHotel(String hotelId, String nameOfHotel, String street, String town, String county, String roomType,
                         Date checkInDate, Date checkOutDate){

        Hotel hotel = new Hotel(hotelId, nameOfHotel, street, town, county, roomType,
                                  checkInDate, checkOutDate);

        hotels.add(hotel);
    }

    public Hotel getHotel(String hotelId){

        for (Iterator i = hotels.iterator(); i.hasNext();){

            Hotel hotel = (Hotel)i.next();
                if(hotel.getHotelId().equals(hotelId)) {

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

            Date checkInDate = searchHotel.getCheckInDate();
            if((checkInDate != null) && (!checkInDate.equals("")) &&
                    (!checkInDate.equals((hotel.getCheckInDate()))))
                continue;

            Date checkOutDate = searchHotel.getCheckOutDate();
            if((checkOutDate != null) && (!checkOutDate.equals("")) &&
                    (!checkOutDate.equals((hotel.getCheckOutDate()))))
                continue;

            return hotel;

        }

        return null;
    }
}
