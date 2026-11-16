import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class DealershipFileManager {

    public Dealership getDealership() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data.csv"))) {
            String line;
            Dealership dealership = null;

            //while line not empty
            while ((line = reader.readLine()) != null) {
                //load csv line to line
                if (line.trim().isEmpty()) {
                    continue; //skip to next line if this one empty
                }

                //parse
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
// D & B Used Cars|111 Old Benbrook Rd|817-555-5555
//name | address | number
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name, address, phone);
                }
//data format in CSV: vin:int |     Year    | make:String | model:String | Vehicle-Type:String | color:String | odometer:int | price:BigDecimal
//                    44901   |     2012    |   Honda     |     Civic    |        car          |     Gray     |    103221    |     6995.00
                if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    BigDecimal price = BigDecimal.valueOf(Long.parseLong(parts[7]));
                    Vehicle myVehicle = new Vehicle(vin, year, make, model);
                    dealership.addVehicle(myVehicle);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
        return null;
    }

    public void saveDealerShip(Dealership dealership) {

    }
}
