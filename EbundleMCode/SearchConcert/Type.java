/**
 * Created by Aoife Sayers on 27/11/2016.
 */
public enum Type {

    CONCERT, SPORTS, ARTSnTHEATRE, COMEDY;
    public String toString() {
        switch (this){
            case CONCERT:
                return "Concert";
            case SPORTS:
                return "Sports";
            case ARTSnTHEATRE:
                return "Arts & Theatre";
            case COMEDY:
                return "Concert";
        }
    }
}
