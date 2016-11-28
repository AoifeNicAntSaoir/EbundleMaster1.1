/**
 * Created by dylantiklunchan on 28/11/2016.
 */
public enum RoomType {
    DOUBLE_ROOM, FAMILY_ROOM,TWIN_ROOM,SINGLE_ROOM;
    public String toString(){
        switch(this){
            case DOUBLE_ROOM:
                return "Double Room";

            case FAMILY_ROOM:
                return "Family Room";

            case TWIN_ROOM:
                return "Twin Room";

            case SINGLE_ROOM:
                return "Single Room";

            default:
                return "No Room Type Found";
        }
    }

}
