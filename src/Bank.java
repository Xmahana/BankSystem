import java.nio.file.Paths;
import java.util.Scanner;

public class Bank{

    
    private final int size = 100;
    private Client[] clients;
    private int numberOfClients;
    // private RegisterSistem registerSistem;

    public Bank(){
        clients = new Client[size];
        numberOfClients = 0;
        readData();
    }

    public void readData(){
        try (Scanner scanner = new Scanner(Paths.get("../docs/clients.txt"))) {
            System.out.println("Data recovered");
        } catch (Exception e) {
            System.err.println("File not found");
        }
    }


}