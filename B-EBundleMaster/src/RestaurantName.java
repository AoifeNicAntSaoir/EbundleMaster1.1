
public enum RestaurantName
{
    LANA,MILANO,LA_PENICHE,TAIKICHI,HAILAN,THAI_PALACE;

    public String toString(){
        switch(this) {
            case LANA:
                return "Lana";
            case MILANO:
                return "Milano";
            case LA_PENICHE:
                return "La Peniche";
            case TAIKICHI:
                return "Takichi";
            case HAILAN:
                return "Hailan";
            case THAI_PALACE:
                return "Thai Palace";
            default:
                return "No Restaurant Available";
        }
    }
}
