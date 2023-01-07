package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(int count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Бумер", "Черный", 2003));
            carList.add(new Car("Чайка", "Белая", 1970));
            carList.add(new Car("Мерин", "Серый", 2019));
            carList.add(new Car("Чайзер", "Мокрый асфальт", 2000));
            carList.add(new Car("Матиз", "Красненький", 2010));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
