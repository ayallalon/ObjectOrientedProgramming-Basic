public class FigTree extends Tree{

    FigTree(int height, Season season) {
        super(height, season, null);
        if(season == Season.FALL)
            leavesColor = Color.YELLOW;
        if(season == Season.SPRING)
            leavesColor = Color.GREEN;
    }

    @Override
    public String toString() {
        if(this.season == Season.SUMMER)
             return "Fig tree. " + "I give fruit. "+
               "My height is: " + height + " and my color is: " + leavesColor;
        if(this.season == Season.WINTER)
            return "Fig tree. " +
                   "My height is: " + height + " and I have no leaves" ;
        return "Fig tree. " +
               "My height is: " + height + " and my color is: " + leavesColor;
    }

    /**
     * Changes the season and also the fields of leafColor, height and effectOnTheAnimal as a result of the season change
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.season)
        {
            case WINTER:
                this.height += 20;
                this.leavesColor = null;
                break;
            case SPRING:
                this.height += 30;
                this.leavesColor = Color.GREEN;
                break;
            case SUMMER:
                this.height += 30;
                break;
            case FALL:
                this.height += 20;
                this.leavesColor = Color.YELLOW;
                break;
        }
    }
}
