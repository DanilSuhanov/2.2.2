package web.DAO;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDAOImp implements CarDAO{
    private List<Car> cars = new ArrayList<>();

    public CarDAOImp() {
        cars.add(new Car(555, "model1", 300000));
        cars.add(new Car(666, "model2", 1000000));
        cars.add(new Car(777, "model3", 600000));
        cars.add(new Car(888, "model4", 100000));
        cars.add(new Car(999, "model5", 200000));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
