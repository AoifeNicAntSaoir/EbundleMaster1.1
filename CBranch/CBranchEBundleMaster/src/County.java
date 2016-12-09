/**
 * Created by dylantiklunchan on 06/12/2016.
 */
public enum County {
    CO_DUBLIN,CO_CLARE,CO_KERRY,CO_GALWAY,CO_LIMERICK,CO_CORK;
    public String toString(){
        switch(this){
            case CO_DUBLIN:
                return "Co.Dublin";
            case CO_CLARE:
                return "Co.Clare";

            case CO_KERRY:
                return "Co.Kerry";

            case CO_GALWAY:
                return "Co.Galway";

            case CO_LIMERICK:
                return "Co.Limerick";

            case CO_CORK:
                return "Co.Cork";

            default:
                return "No County found";
        }
    }
}
