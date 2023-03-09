public class OliveTree extends Tree{

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }


    @Override
    public String toString() {
        if(this.season == Season.FALL)
            return "Olive tree. " + "I give fruit. "+
                   "My height is: " + height + " and my color is: " + leavesColor;
        return "Olive tree. " +
               "My height is: " + height + " and my color is: " + leavesColor;
    }

    /**
     * Changes the season and also the fields of height and effectOnTheAnimal as a result of the season change
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.season)
        {
            case WINTER:
            case FALL:
                this.height += 5;
                break;
            case SPRING:
            case SUMMER:
                this.height += 10;
                break;
        }
    }
}
