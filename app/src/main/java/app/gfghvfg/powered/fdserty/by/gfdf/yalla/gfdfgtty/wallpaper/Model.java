package app.gfghvfg.powered.fdserty.by.gfdf.yalla.gfdfgtty.wallpaper;

public class Model {

    private int id;
    private String originalUrl,mediumUrl;


    public Model() {
    }

    public Model(int id, String originalUrl, String mediumUrl) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.mediumUrl = mediumUrl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }
}
