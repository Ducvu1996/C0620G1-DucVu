package model;

public class Customer {
    protected Integer id;
    protected String name;
    protected String birthday;
    protected String address;
    protected String image;

    public Customer() {

    }

    public Customer(Integer id, String name, String birthday, String address, String image) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}