package DAO;


import model.RentType;
import model.Service;
import model.ServiceType;

import java.util.List;

public interface ServiceDAO {
    List<Service> findAll();
    String save(Service service);
    List<RentType> allRentType();
    List<ServiceType> allServiceType();
}
