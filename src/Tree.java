public class Tree implements Seasonable, Comparable {
    protected int height;
    protected Color leavesColor;
    protected Season season;



    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    /***
     * @return the current season of the animal
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }
    /***
     * Changes the tree's season to the next season
     */
    @Override
    public void changeSeason() {
        switch (this.season) {
            case WINTER:
                this.season = Season.SPRING;
                break;
            case SPRING:
                this.season = Season.SUMMER;
                break;
            case SUMMER:
                this.season = Season.FALL;
                break;
            case FALL:
                this.season = Season.WINTER;
                break;
        }
    }


    @Override
    public int compareTo(Object o) {
        Tree tree = (Tree) o;
        if (this.height > tree.height) return 1;
        if (this.height < tree.height) return -1;
        return 0;
    }


    @Override
    public String toString() {
        return "Tree{" + "height=" + height + ", leavesColor=" + leavesColor + ", season=" + season + '}';
    }
}
