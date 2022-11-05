public class BookV3 {

    private String title = "The Lost Hero";
    private String author = "Rick Riordan";
    private int pages = 571;
    private int chapters = 56;

    // default constructor
    public BookV3() {}

    public void setTitle(String _title)
    {
        title = _title;
    }

    public void setAuthor(String _author)
    {
        author = _author;
    }

    public void setPages(int _pages)
    {
        pages = _pages;
    }

    public void setChapters(int _chapters)
    {
        chapters = _chapters;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getChapters()
    {
        return chapters;
    }

    public double pagesPerChapter()
    {
        return (double)pages/chapters;
    }

    public int difference()
    {
        return pages - chapters;
    }
}
