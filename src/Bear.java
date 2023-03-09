public class Bear extends Animal{

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
    }


    @Override
    public String toString() {
        if(this.getCurrentSeason()==Season.WINTER)
             return "Bear. " + "I am sleeping. "+
               "My weight is: " + weight + " and my color is: " + color;
        return "Bear. " +
               "My weight is: " + weight + " and my color is: " + color;
    }

    /**
     * Changes the season and also the fields of color and weight as a result of the season change
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.season) {
            case WINTER:
                this.weight = (int) Math.round((this.weight * 0.8));
                break;
            case SPRING:
                this.weight =  Math.round((int)(this.weight * 0.75));
                break;
            case SUMMER:
                this.weight = Math.round((int)(this.weight * 1.33333));
            case FALL:
                this.weight = Math.round((int)(this.weight * 1.25));;
                break;
            default:
        }
    }


}
