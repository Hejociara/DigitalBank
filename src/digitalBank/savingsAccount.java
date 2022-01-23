package digitalBank;

public class savingsAccount extends account{

    public savingsAccount(Client client){
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("*** Statement current account *** ");
       super.printCommonInformation();
    }


}
