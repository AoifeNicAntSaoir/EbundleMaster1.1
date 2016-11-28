/**
 * Created by dylantiklunchan on 28/11/2016.
 */
public enum NameOfHotel {

     WEST_HOTEL,EAST_HOTEL,NORTH_WEST_HOTEL,TEMPLE_HOTEL;
    public String toString(){
        switch(this){
            case WEST_HOTEL:
                return "West Hotel";

            case EAST_HOTEL :
                return "East Hotel";

            case NORTH_WEST_HOTEL:
                return "North West Hotel";

            case TEMPLE_HOTEL:
                return "Temple Hotel";

            default:
                return "Unknown Hotel";
        }
    }
}
