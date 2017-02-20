package by.andrew.blinets.video_board.dto;

import java.util.Date;

/**
 * Created by Андрей on 20.02.2017.
 */

public class Advretisement {

    private String Title;
    private long Author_id;
    private long Subcategory_id;
    private String Price;
    private String URL;
    private String Information;
    private Date Add_date;
    private String Rating;

    public Advretisement() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public long getAuthor_id() {
        return Author_id;
    }

    public void setAuthor_id(long author_id) {
        Author_id = author_id;
    }

    public long getSubcategory_id() {
        return Subcategory_id;
    }

    public void setSubcategory_id(long subcategory_id) {
        Subcategory_id = subcategory_id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public Date getAdd_date() {
        return Add_date;
    }

    public void setAdd_date(Date add_date) {
        Add_date = add_date;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}
