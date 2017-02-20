package by.andrew.blinets.video_board.model;

/**
 * Created by Андрей on 17.02.2017.
 */

public class Categories {

    private long Id_category;
    private String Name_category;
    private int sort_id;


    public Categories() {
    }

    public long getId_category() {
        return Id_category;
    }

    public void setId_category(long id_category) {
        Id_category = id_category;
    }

    public String getName_category() {
        return Name_category;
    }

    public void setName_category(String name_category) {
        Name_category = name_category;
    }

    public int getSort_id() {
        return sort_id;
    }

    public void setSort_id(int sort_id) {
        this.sort_id = sort_id;
    }
}
