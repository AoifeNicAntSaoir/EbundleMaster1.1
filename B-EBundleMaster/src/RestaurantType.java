
public enum RestaurantType
{
    CHINESE,ITALIAN,INDIAN,THAI,JAPANESE,FRENCH,KOREAN;

    public String toString(){
        switch(this) {
            case CHINESE:
                return "Chinese";
            case ITALIAN:
                return "Italian";
            case INDIAN:
                return "Indian";
            case THAI:
                return "Thai";
            case JAPANESE:
                return "Japanese";
            case FRENCH:
                return "French";
            case KOREAN:
                return "Korean";
            default:
                return "No type found";
        }
    }
}
