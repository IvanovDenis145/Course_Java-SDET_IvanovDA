public static void main(String[] args) {
/*
    Создание гаража для автобусов
*/
    Garage<Bus> busGarage = new Garage<>();
    Bus bus1 = new Bus("Mercedes", "Sprinter", 20);
    busGarage.addVehicle(bus1);
    busGarage.displayAllVehicles();

/*
    Создание гаража для автомобилей
*/
    Garage<Car> carGarage = new Garage<>();
    Car car1 = new Car("Tesla", "Model S", 4);
    carGarage.addVehicle(car1);
    carGarage.displayAllVehicles();

/*
    Обслуживание автомобиля
*/
    car1.service(car1);

/*
    Обслуживание автобуса
*/
    bus1.service(bus1);

/*
    Реализация функционального интерфейса1
*/
    IsDivisibleBy13 isDivisibleBy13 = (number) -> number % 13 == 0;
    System.out.println(isDivisibleBy13.test(26));
    System.out.println(isDivisibleBy13.test(28));

/*
    Реализация функционального интерфейса2
*/
    Discriminant discriminant = ((a, b, c) -> b * b - 4 * a * c);
    System.out.println(discriminant.test(1.5, 4.3 ,4.8));
}
