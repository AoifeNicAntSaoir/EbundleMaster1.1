/**
 * Created by dylantiklunchan on 28/11/2016.
 */
public enum NameOfHotel {

    WEST_BURERRY_HOTEL,HILTON_HOTEL,CLARIN_HOTEL,TEMPLE_GATE_HOTEL;
    public String toString(){
        switch(this){
            case WEST_BURERRY_HOTEL:
                return "West Burberry Hotel";

            case HILTON_HOTEL :
                return "Hilton Hotel";

            case CLARIN_HOTEL:
                return "Clarin Hotel";

            case TEMPLE_GATE_HOTEL:
                return "Temple Gate Hotel";

            default:
                return "Unknown Hotel";
        }
    }
}
