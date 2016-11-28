
public enum RestaurantLocation
{
    CLARE,CORK,DUBLIN,GALWAY,KERRY,LIMERICK;

    public String toString(){
        switch(this) {
            case CLARE:
                return "Clare";
            case CORK:
                return "Cork";
            case DUBLIN:
                return "Dublin";
            case GALWAY:
                return "Galway";
            case KERRY:
                return "Kerry";
            case LIMERICK:
                return "Limerick";
            default:
                return "No Location found";
        }
    }
}
