package BO;

import DAO.ServiceDAO;
import DAO.ServiceDAOIplm;

import model.RentType;
import model.Service;
import model.ServiceType;

import java.util.List;

public class ServiceBOIplm implements ServiceBO {
    ServiceDAO serviceDAO = new ServiceDAOIplm();
    @Override
    public List<Service> findAll() {
        return this.serviceDAO.findAll();
    }

    @Override
    public List<RentType> allRentType() {
        return this.serviceDAO.allRentType();
    }

    @Override
    public List<ServiceType> allServiceType() {
        return this.serviceDAO.allServiceType();
    }

    @Override
    public String save(Service service) {
        return this.serviceDAO.save(service);
    }
}
