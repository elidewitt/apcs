public class BookV8 {

    private String title;
    private String author;
    private int pages;
    private int chapters;

    // default constructor
    public BookV8() {
        title = "The Lost Hero";
        author = "Rick Riordan";
        pages = 571;
        chapters = 56;
    }
    public BookV8(String _title, String _author, int _pages, int _chapters)
    {
        title = _title;
        author = _author;
        pages = _pages;
        chapters = _chapters;
    }

    public BookV8(String _title, int _pages, int _chapters)
    {
        title = _title;
        author = "Rick Riordan";
        pages = _pages;
        chapters = _chapters;
    }

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

    public void setPages(double _pages)
    {
        pages = (int)_pages;
    }

    public void setChapters(int _chapters)
    {
        chapters = _chapters;
    }

    public void setChapters(double _chapters)
    {
        chapters = (int)_chapters;
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
