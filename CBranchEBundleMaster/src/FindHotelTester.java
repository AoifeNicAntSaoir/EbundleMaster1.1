/**
 * Created by dylantiklunchan on 21/11/2016.
 */
public class FindHotelTester {

    public static void main(String[] args){

        HotelList hotelList = new HotelList();
        intitializeHotelList(hotelList);


        Hotel hotelChoice = new Hotel(1, NameOfHotel.WEST_BURERRY_HOTEL, "123 Main Street", "Dundrum",County.CO_DUBLIN,RoomType.DOUBLE_ROOM,"12/12/2016","27/1/2017");

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
        

          hotelList.addHotel(1, NameOfHotel.WEST_BURERRY_HOTEL, "123 Main Street", "Dundrum",County.CO_DUBLIN,RoomType.DOUBLE_ROOM,"12/12/2016","27/1/2017");

          hotelList.addHotel(2,NameOfHotel.HILTON_HOTEL, "1 Henry Street", "Limerick City",County.CO_LIMERICK,RoomType.FAMILY_ROOM,"12/11/2016","20/11/2016");

          hotelList.addHotel(3,NameOfHotel.CLARIN_HOTEL, "1 O'Connell Street", "Limerick City",County.CO_LIMERICK,RoomType.TWIN_ROOM,"13/09/2016","15/09/2016");

          hotelList.addHotel(4,NameOfHotel.TEMPLE_GATE_HOTEL, "The Market Street", "Ennis",County.CO_CLARE,RoomType.SINGLE_ROOM,"17/06/2016","25/06/2016");
    }
}
