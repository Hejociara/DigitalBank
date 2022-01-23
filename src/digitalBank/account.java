package digitalBank;
/**
 * Hejociara do Vale
 */
public abstract class account implements iAccount {

    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected int operation;
    private Client client;
    private double Limit;

    public account() {
        this.agency = account.STANDARD_AGENCY;
        this.number = SEQUENCIAL++;
        this.balance = 0;
        this.Limit = 0;
        this.Client = client;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposite(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, iAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposite(value);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getname(){
        return name();
    }
    public void setnam  e(String Name){
        this.Name = Name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public double getLimit() {
        return Limit;
    }

    public void setLimit(double Limit) {
        this.Limit = Limit;

    }
    public int getnumber(){
        return number;
    }
    public void setnumber(int number){
        this.number = number;
    }

    boolean withdraw(double quantity) {
        if (this.balance < quantity)
            return false;
        else {
            this.balance = this.balance - quantity;
            return true;
        }
    }
    void deposite (double quantity){
        this.balance = this.balance + quantity;
    }
    void  insertData(String a, int b, float c, float l){
        this.Client = a;
        this.number = b;
        this.balance = c;
        this.Limit = l;
    }
    protected void printCommonInformation() {
        System.out.println(String.format("Titular: %s", this.client.getName())); //por ser string deve-se pôr %s
        System.out.println(String.format("Agency: %d", this.getAgency())); // decimal %d
        System.out.println(String.format("Number: %d", this.getNumber()));
        System.out.println(String.format("Balance: %.2f", this.getBalance());
    }
    void showBalance (){
        System.out.println("Current Balance: " + this.getBalance());
    }
}