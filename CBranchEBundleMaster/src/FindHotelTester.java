/**
 * Created by dylantiklunchan on 21/11/2016.
 */
public class FindHotelTester {

    public static void main(String[] args){

        HotelList hotelList = new HotelList();
        intitializeHotelList(hotelList);

        Hotel myHotel = new Hotel("01","West Hotel", "123 Main Street","Dundrum",
                                   "Dublin","Double Room","01-04-2016","10-04-2016");

        Hotel hotel = hotelList.search(myHotel);
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

          hotelList.addHotel("02","East Hotel", "1 Henry Street", "Limerick City","Limerick","Family","01-06-2016","05-06-2016");

          hotelList.addHotel("03","NorthWest Hotel", "1 O'Connell Street", "Limerick City","Limerick","Twin","11-08-2016","17-08-2016");
    }
}
