
public class Main{

    public static void main(String[] args) {
        String file = "../docs/clients.txt";
        Bank bank = new Bank(file);
        
        bank.printClients();

    }


}