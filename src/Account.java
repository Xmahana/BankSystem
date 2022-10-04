
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

    public void addMoney(double amount){
        this.money += amount;
    }

    public boolean removeMoney(double amount){
        if(this.money >= amount){
            this.money -= amount;
            return true;
        }else{
            return false;
        }
    }

}
