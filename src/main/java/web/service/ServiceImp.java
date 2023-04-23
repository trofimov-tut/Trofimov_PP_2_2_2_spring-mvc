package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAOImp;
import web.model.Car;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{
    
    @Autowired
    private CarDAOImp carDAO;
    
    @Override
    public List<Car> carOnRequest(int count) {
        return carDAO.carOnRequest(count);
    }
}
