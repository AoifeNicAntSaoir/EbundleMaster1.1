/**
 * Created by dylantiklunchan on 21/11/2016.
 */

import java.util.Date;

//superClass
public class Hotel {

    String hotelId;
    String nameOfHotel;
    String street;
    String town;
    String county;
    String roomType;
    Date checkInDate;
    Date checkOutDate;

    public Hotel(String hotelId, String nameOfHotel, String street, String town, String county, String roomType,
                  Date checkInDate, Date checkOutDate)  {


        this.hotelId = hotelId;
        this.nameOfHotel = nameOfHotel;
        this.street = street;
        this.town = town;
        this.county = county;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }

     public void setHotelId(String hotelId)
     {
          this.hotelId = hotelId;
     }

    public void setNameOfHotel(String nameOfHotel)
    {
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

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
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

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
