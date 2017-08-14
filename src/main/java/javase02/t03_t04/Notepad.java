package javase02.t03_t04;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Notepad extends Stationery {

    private int countOfPages;
    private String pageColour;

    public Notepad(String name, int cost, int countOfPages, String pageColour) {
        super(name, cost);
        this.countOfPages = countOfPages;
        this.pageColour = pageColour;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getPageColour() {
        return pageColour;
    }

    public void setPageColour(String pageColour) {
        this.pageColour = pageColour;
    }

    @Override
    public void printAllFields() {
        System.out.println("\nNotepad:");
        System.out.println("name = " + getName());
        System.out.println("cost = " + getCost());
        System.out.println("countOfPages = " + countOfPages);
        System.out.println("pageColour = " + pageColour);
    }
}
