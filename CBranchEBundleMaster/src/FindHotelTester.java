import java.util.Calendar;
import java.util.Date;

/**
 * Created by dylantiklunchan on 21/11/2016.
 */
public class FindHotelTester {

    public static void main(String[] args){

        HotelList hotelList = new HotelList();
        intitializeHotelList(hotelList);

        Calendar checkInDate = Calendar.getInstance();
        Calendar checkOutDate = Calendar.getInstance();

        Hotel ErinsHotelChoice = new Hotel(01,NameOfHotel.WEST_HOTEL, "123 Main Street","Dundrum",
                                   "Dublin","Double Room",checkInDate,checkOutDate);

        Hotel hotel = hotelList.search(ErinsHotelChoice);
        if(hotel != null){
            System.out.println(" Found a Hotel that you might be interested " + "\nHotel ID: " + hotel.getHotelId() + "\nHotel Name: " +
             hotel.getNameOfHotel() + "\nStreet: " + hotel.getStreet() + " \nCounty:" + hotel.getCounty()
              + " " + hotel.getCounty() + "\nRoom Type: " + hotel.getRoomType()
               + " \nCheck In Date: " + hotel.getCheckInDate() + "\nCheck Out Date: " + hotel.getCheckOutDate());
        }
        else{
            System.out.println("Sorry no hotel Found");
        }

    }

    private static void intitializeHotelList(HotelList hotelList) {

             Calendar checkInDate = Calendar.getInstance();
             Calendar checkOutDate = Calendar.getInstance();

          hotelList.addHotel(02,NameOfHotel.EAST_HOTEL, "1 Henry Street", "Limerick City","Limerick","Family",checkInDate,checkOutDate);

          hotelList.addHotel(03,NameOfHotel.NORTH_WEST_HOTEL, "1 O'Connell Street", "Limerick City","Limerick","Twin",checkInDate,checkOutDate);

          hotelList.addHotel(04,NameOfHotel.TEMPLE_HOTEL, "The Market Street", "Ennis","Clare","Single",checkInDate,checkOutDate);
    }
}
