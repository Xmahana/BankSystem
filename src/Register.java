public class Register {

    private Transaction transaction;
    private String date;

    public Register() {
        
    }

    public Transaction getTransaction() {
        return transaction;
    }
 
    public String getDate() {
        return date;
    }

    public String toString(){
        return transaction + "\n" + date;
    }
}
