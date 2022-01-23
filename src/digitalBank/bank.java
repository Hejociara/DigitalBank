package digitalBank;

import java.util.List;

public class bank {
    private String name;
    private List<account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<account>accounts) {
        this.accounts = accounts;

    }
}
