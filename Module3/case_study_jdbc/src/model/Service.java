package model;

public class Service {
    private Integer service_id;
    private String service_name;
    private Integer service_area;
    private Double service_cost;
    private Integer service_max_people;
    private String standard_room;
    private String description_other_convenience;
    private Double pool_area;
    private Integer number_of_floors;
    private int rent_type_id;
    private int service_type_id;
    private String rent_type_name;
    private String service_type_name;

    public Service() {
    }

    public Service(String service_name, Integer service_area, Double service_cost, Integer service_max_people, String standard_room, String description_other_convenience, Double pool_area, Integer number_of_floors, int rent_type_id, int service_type_id) {
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.number_of_floors = number_of_floors;
        this.rent_type_id = rent_type_id;
        this.service_type_id = service_type_id;
    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(int rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public int getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(int service_type_id) {
        this.service_type_id = service_type_id;
    }

    public Service(Integer service_id, String service_name, Double service_cost, Integer number_of_floors, String rent_type_name, String service_type_name) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_cost = service_cost;
        this.number_of_floors = number_of_floors;
        this.rent_type_name = rent_type_name;
        this.service_type_name = service_type_name;
    }

    public Service(Integer service_id, String service_name) {
        this.service_id = service_id;
        this.service_name = service_name;
    }

    public Service(Integer service_id, String service_name, Integer service_area, Double service_cost, Integer service_max_people, String standard_room, String description_other_convenience, Double pool_area, Integer number_of_floors, String rent_type_name, String service_type_name) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.number_of_floors = number_of_floors;
        this.rent_type_name = rent_type_name;
        this.service_type_name  = service_type_name;
    }

    public Service(String service_name, Integer service_area, Double service_cost, Integer service_max_people, String standard_room, String description_other_convenience, Double pool_area, Integer number_of_floors, String rent_type_name, String service_type_name) {
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.number_of_floors = number_of_floors;
        this.rent_type_name = rent_type_name;
        this.service_type_name = service_type_name;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public Integer getService_area() {
        return service_area;
    }

    public void setService_area(Integer service_area) {
        this.service_area = service_area;
    }

    public Double getService_cost() {
        return service_cost;
    }

    public void setService_cost(Double service_cost) {
        this.service_cost = service_cost;
    }

    public Integer getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(Integer service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public Double getPool_area() {
        return pool_area;
    }

    public void setPool_area(Double pool_area) {
        this.pool_area = pool_area;
    }

    public Integer getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(Integer number_of_floors) {
        this.number_of_floors = number_of_floors;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public String getService_type_name() {
        return service_type_name;
    }

    public void setService_type_name(String service_type_name) {
        this.service_type_name = service_type_name;
    }
}
