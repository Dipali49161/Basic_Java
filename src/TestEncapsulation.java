class Account {
    private long acc_no;
    private String name;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

class TestEncapsulation {
    public static void main(String args[]) {
        Account acc = new Account();
        // acc.getAcc_no(1123456677888);
        acc.setAcc_no(7768);
        acc.setName("dipali bhabad");
        acc.setAmount(45000000f);
        System.out.println(acc.getAcc_no() + "\t" + acc.getName() + "\t" + acc.getAmount());
    }
}

