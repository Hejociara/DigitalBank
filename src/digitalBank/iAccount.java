package digitalBank;

public interface iAccount {

    void withdraw(double value);
    void deposite (double value);
    void transfer(double value, iAccount destinationAccount);
void printStatement();
}
