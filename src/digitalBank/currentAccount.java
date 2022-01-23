package digitalBank;
/**
 * @author : Hejociara do Vale
 * 19/01/2022
 */
public class currentAccount extends account {

    public currentAccount(Client client) {
        super(client);
}

    @Override
    public void printStatement() {
        System.out.println(" *** Current account statement **");
    super.printCommonInformation();
    }
    }

