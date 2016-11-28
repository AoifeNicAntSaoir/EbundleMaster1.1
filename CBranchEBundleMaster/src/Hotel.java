/**
 * Created by dylantiklunchan on 21/11/2016.
 */

import java.util.Calendar;

//superClass
public class Hotel {

    private int hotelId;
    private String nameOfHotel;
    private String street;
    private String town;
    private String county;
    private String roomType;
    private Calendar checkInDate;
    private Calendar checkOutDate;

    public Hotel(int hotelId, String nameOfHotel, String street, String town, String county, String roomType,
                  Calendar checkInDate, Calendar checkOutDate)  {


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

    public void setCheckInDate(Calendar checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Calendar checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getHotelId() {
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

    public Calendar getCheckInDate() {
        return checkInDate;
    }

    public Calendar getCheckOutDate() {
        return checkOutDate;
    }
}
