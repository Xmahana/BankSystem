
public class Client{

    private int ID;
    private String name;
    private Account account;

    public Client(int ID, String name, double money){
        this.ID = ID;
        this.name = name;
        account = new Account(this, money);
    }

    @Override
    public String toString(){
        return "ID: "+ID+"\nName: "+name+"\nMoney: "+account.getMoney();
    }

}
