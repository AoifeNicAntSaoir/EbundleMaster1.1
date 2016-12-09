/**
 * Created by dylantiklunchan on 21/11/2016.
 */


//superClass
public class Hotel {

    private int hotelId;
    private NameOfHotel nameOfHotel;
    private String street;
    private String town;
    private County county;
    private RoomType roomType;
    private String checkInDate;
    private String checkOutDate;

    public Hotel(int hotelId, NameOfHotel nameOfHotel, String street, String town, County county, RoomType roomType,
                  String checkInDate, String checkOutDate)  {


        this.hotelId = hotelId;
        this.nameOfHotel = nameOfHotel;
        this.street = street;
        this.town = town;
        this.county = county;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }

    public void setHotelId(int hotelId) {
          this.hotelId = hotelId;
     }

    public void setNameOfHotel(NameOfHotel nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getHotelId() {
        return hotelId;
    }

    public NameOfHotel getNameOfHotel() {
        return nameOfHotel;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public County getCounty() {
        return county;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
}
