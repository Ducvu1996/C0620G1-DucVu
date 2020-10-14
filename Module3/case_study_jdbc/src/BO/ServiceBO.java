package BO;


import model.RentType;
import model.Service;
import model.ServiceType;

import java.util.List;

public interface ServiceBO {
    List<Service> findAll();
    List<RentType> allRentType();
    List<ServiceType> allServiceType();
    String save(Service service);
}
