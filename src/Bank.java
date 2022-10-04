
import java.nio.file.Paths;
import java.util.Scanner;

public class Bank {

    private final int SIZE = 100;
    private Client[] clients;
    private int numberOfClients;
    // private RegisterSistem registerSistem;

    public Bank(String file) {
        clients = new Client[SIZE];
        numberOfClients = 0;
        readData(file);
    }

    public void readData(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            System.out.println("Data recovered");
            while(scanner.hasNextLine() && numberOfClients < SIZE){
                String[] parts = scanner.nextLine().split(",");
                int ID = numberOfClients;
                String name = parts[0];
                double money = Double.valueOf(parts[1]);
                clients[numberOfClients] = new Client(ID, name, money);
                numberOfClients++;
            }
        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

    public void printClients(){
        if(numberOfClients > 0){
            for(int i=0;i<numberOfClients;i++){
                System.out.println(clients[i]);
                System.out.println();
            }
        }
    }
    
    

    public String toString(){
        return "This is a bank";
    }

}