package caseStudy.modell;

public class Contract {
    int numberContract;
    int idBook;
    double deposits;
    double totalPrice;
    int idCustomer;
    public Contract() {
    }
    public Contract(int numberContract, int idBook, double deposits, double totalPrice, int idCustomer) {
        this.numberContract = numberContract;
        this.idBook = idBook;
        this.deposits = deposits;
        this.totalPrice = totalPrice;
        this.idCustomer = idCustomer;
    }
    @Override
    public String toString() {
        return "Contract [numberContract=" + numberContract + ", idBook=" + idBook + ", deposits=" + deposits
                + ", totalPrice=" + totalPrice + ", idCustomer=" + idCustomer + "]";
    }
    public int getNumberContract() {
        return numberContract;
    }
    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }
    public int getIdBook() {
        return idBook;
    }
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
    public double getDeposits() {
        return deposits;
    }
    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public int getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    
}
