public abstract class Animal implements Seasonable ,Comparable {
    public int weight;
    public Color color;
    public Season season;



    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }


    @Override
    public int compareTo(Object o) {
        Animal animal = (Animal) o;
        if (this.weight > animal.weight) return 1;
        if (this.weight < animal.weight) return -1;
        return 0;
    }

    /**
     * @return the current season of the animal
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Changes the animal's season to the next season
     */
    public void changeSeason() {

        switch (this.getCurrentSeason()) {
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
            default:
        }
    }


    @Override
    public String toString() {
        return "Animal{" + "weight=" + weight + ", color=" + color + ", season=" + season + '}';

    }
}
