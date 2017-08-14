package javase02.t03;

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
}
