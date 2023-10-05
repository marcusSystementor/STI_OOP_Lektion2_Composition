public class Car extends Vehicle{

    // Car är ett fordon, Vehicle
    
    private String brand;
    private boolean oilOrNot;
    // Car har en motor, engine.
    Engine engine;
    


    // Konstructorn, allt här körs direkt när objektet skapas. Ett nytt objekt av engine skapas.
    public Car (String brand) {
        // Konstruktorn vi får från Vehicle när vi kör extends.
        super(brand);

      engine = new Engine();
    }

    public void startCar() {
        
        System.out.println("Starts engine from Car class");
        engine.engineStarted(); // Kallar på metoden engineStarted i engine.
    }

}
