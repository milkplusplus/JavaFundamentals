package javase02.t03;

public class Pencil extends Stationery {

    private String color;
    private String graphiteGradingScale;

    public Pencil(String name, int cost, String color, String graphiteGradingScale) {
        super(name, cost);
        this.color = color;
        this.graphiteGradingScale = graphiteGradingScale;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGraphiteGradingScale() {
        return graphiteGradingScale;
    }

    public void setGraphiteGradingScale(String graphiteGradingScale) {
        this.graphiteGradingScale = graphiteGradingScale;
    }
}
