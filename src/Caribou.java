public class Caribou extends Animal{

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        if(season == Season.WINTER)
            color = Color.WHITE;
    }

    @Override
    public String toString() {
        if(this.season == Season.WINTER)
            return "Caribou: " + "I am migrating south. " +
               "My weight is: " + weight + " and my color is: " + color;
        if(this.season == Season.SUMMER)
            return "Caribou: " + "I am migrating north. " +
                   "My weight is: " + weight + " and my color is: " + color;
        return "Caribou: "  +
               "My weight is: " + weight + " and my color is: " + color;
    }

    /**
     * Changes the season and also the fields of color and effectOnTheAnimal as a result of the season change
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason())
        {
            case WINTER:
                this.color = Color.WHITE;
                break;
            case SPRING:
                this.color = Color.BROWN;
                break;
            default:
        }
    }
}
