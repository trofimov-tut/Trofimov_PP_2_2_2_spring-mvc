package web.service;

import web.model.Car;

import java.util.List;

public interface Service {
    List<Car> carOnRequest(int count);
}
