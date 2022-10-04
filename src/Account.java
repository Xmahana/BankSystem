
public class Account {
    
    private Client owner;
    private double money;

    public Account(Client owner, double money){
        this.owner = owner;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public Client getOwner() {
        return owner;
    }

}
