package android.example.earth;

public class News {
    private String SectionName;
    private String newsDesc;
    private String date;
    private String url;
    private String author;

    public News(String SectionName, String newsDesc, String date, String url, String author) {
        this.SectionName = SectionName;
        this.newsDesc = newsDesc;
        this.date = date;
        this.url = url;
        this.author = author;
    }

    public String getSectionName() {
        return SectionName;
    }


    public String getNewsDesc() {
        return newsDesc;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor(){
        return author;
    }
}
