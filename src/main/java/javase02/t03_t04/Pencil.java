package javase02.t03_t04;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Pencil extends Stationery {

    private boolean isColored;
    private String graphiteGradingScale;

    public Pencil(String name, int cost, boolean isColored, String graphiteGradingScale) {
        super(name, cost);
        this.isColored = isColored;
        this.graphiteGradingScale = graphiteGradingScale;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    public String getGraphiteGradingScale() {
        return graphiteGradingScale;
    }

    public void setGraphiteGradingScale(String graphiteGradingScale) {
        this.graphiteGradingScale = graphiteGradingScale;
    }

    @Override
    public void printAllFields() {
        System.out.println("\nPencil:");
        System.out.println("name = " + getName());
        System.out.println("cost = " + getCost());
        System.out.println("isColored = " + isColored);
        System.out.println("graphiteGradingScale = " + graphiteGradingScale);
    }
}
