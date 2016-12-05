import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by dylantiklunchan on 21/11/2016.
 */
public class FindHotelTester {

    public static void main(String[] args){

        HotelList hotelList = new HotelList();
        intitializeHotelList(hotelList);

        //Calendar checkInDate = Calendar.getInstance();
        //Calendar checkOutDate = Calendar.getInstance();




        Hotel hotelChoice = new Hotel(1234, NameOfHotel.WEST_BURERRY_HOTEL, "123 Main Street", "Dundrum","Dublin",RoomType.DOUBLE_ROOM,"12/12/2016","27/1/2017");

        Hotel hotel = hotelList.search(hotelChoice);
        if(hotel != null)
        {
            System.out.println("You might like this: \n" + "Hotel ID:" +
                    hotel.getHotelId() + "\n" + "Hotel Name: " +
                    hotel.getNameOfHotel() + "\nStreet: " +
                    hotel.getStreet() + "\nTown: " +
                    hotel.getTown() + "\nCounty: " +
                    hotel.getCounty() + " \nRoom Type: " +
                    hotel.getRoomType()+ " \nCheck In Date: " +
                    hotel.getCheckInDate() +" \nCheck Out Date: " +
                    hotel.getCheckOutDate());

        }
        else
        {
            System.out.println("Sorry customer, We have no hotel for you");
        }
    }

    private static void intitializeHotelList(HotelList hotelList) {

             //Calendar checkInDate = Calendar.getInstance();
             //Calendar checkOutDate = Calendar.getInstance();

          hotelList.addHotel(01, NameOfHotel.WEST_BURERRY_HOTEL, "123 Main Street", "Dundrum","Dublin",RoomType.DOUBLE_ROOM,"12/12/2016","27/1/2017");

          hotelList.addHotel(02,NameOfHotel.HILTON_HOTEL, "1 Henry Street", "Limerick City","Limerick",RoomType.FAMILY_ROOM,"","");

          hotelList.addHotel(03,NameOfHotel.CLARIN_HOTEL, "1 O'Connell Street", "Limerick City","Limerick",RoomType.TWIN_ROOM,"","");

          hotelList.addHotel(04,NameOfHotel.TEMPLE_GATE_HOTEL, "The Market Street", "Ennis","Clare",RoomType.SINGLE_ROOM,"","");
    }
}
