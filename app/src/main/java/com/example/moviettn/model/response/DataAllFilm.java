package com.example.moviettn.model.response;

import com.example.moviettn.model.Category;
import com.example.moviettn.model.Director;
import com.example.moviettn.model.ImageFilm;
import com.example.moviettn.model.ImageTitle;
import com.example.moviettn.model.SeriesFilm;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataAllFilm {
    @SerializedName("image_film")
    @Expose
    private ImageFilm imageFilm;
    @SerializedName("image_title")
    @Expose
    private ImageTitle imageTitle;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("year_production")
    @Expose
    private String yearProduction;
    @SerializedName("country_production")
    @Expose
    private String countryProduction;
    @SerializedName("director")
    @Expose
    private List<Director> director = null;
    @SerializedName("category")
    @Expose
    private List<Category> category = null;
    @SerializedName("seriesFilm")
    @Expose
    private List<SeriesFilm> seriesFilm = null;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("filmLength")
    @Expose
    private String filmLength;
    @SerializedName("ageLimit")
    @Expose
    private Integer ageLimit;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public ImageFilm getImageFilm() {
        return imageFilm;
    }

    public void setImageFilm(ImageFilm imageFilm) {
        this.imageFilm = imageFilm;
    }

    public ImageTitle getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(ImageTitle imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(String yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public List<Director> getDirector() {
        return director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<SeriesFilm> getSeriesFilm() {
        return seriesFilm;
    }

    public void setSeriesFilm(List<SeriesFilm> seriesFilm) {
        this.seriesFilm = seriesFilm;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }
}
