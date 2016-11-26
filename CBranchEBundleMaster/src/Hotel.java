/**
 * Created by dylantiklunchan on 21/11/2016.
 */

import java.util.Date;

//superClass
public class Hotel {

    private String hotelId;
    private String nameOfHotel;
    private String street;
    private String town;
    private String county;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;

    public Hotel(String hotelId, String nameOfHotel, String street, String town, String county, String roomType,
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

     public void setHotelId(String hotelId) {
          this.hotelId = hotelId;
     }

    public void setNameOfHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getNameOfHotel() {
        return nameOfHotel;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getCounty() {
        return county;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
}
