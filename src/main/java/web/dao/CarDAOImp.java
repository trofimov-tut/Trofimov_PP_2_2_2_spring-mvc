package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add( new Car(1, "Mersedes"));
        cars.add( new Car(2, "Porshe"));
        cars.add( new Car(3, "BMW"));
        cars.add( new Car(4, "Yaguar"));
        cars.add( new Car(5, "Volvo"));
    }

    @Override
    public List<Car> carOnRequest(int count){
        if (count <= 0) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
