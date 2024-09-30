public class Bus extends Vehicle implements Combustion{
    private int seats;
    private boolean allFuel;

    public Bus(String brand, String model, int seats) {
        super(brand, model);
        this.seats = seats;
        allFuel = false;
    }

    @Override
    public void fullTank() {
        allFuel = true;
        System.out.println("Бак автобуса полностью заправлен");
    }

    @Override
    public void Readiness() {
        if(allFuel){
            System.out.println("Автобус готов к работе");
        }
        else{
            System.out.println("Автобус не готов к работе");
        }
    }
    public void displaySeats() {
        System.out.println("Число мест : " + seats);
    }
}
