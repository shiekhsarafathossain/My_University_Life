package problem1;

class NegativeValueException extends Exception {

    NegativeValueException(String str) {
        super(str);
    }

}

class ACC<T> {

    private T accInfo;
    private double withdraw;
    private double deposite;

    ACC() {

    }

    public ACC(T accInfo, double withdraw, double deposite) throws NegativeValueException{
        this.accInfo = accInfo;
        if(withdraw >0){
            this.withdraw = withdraw;
        }
        else{
            NegativeValueException e1 = new NegativeValueException("Error");
            throw e1;
        }
        if(deposite >0){
            this.deposite = deposite;
        }
        else{
            NegativeValueException e2 = new NegativeValueException("Error");
            throw e2;
        }
        //this.deposite = deposite;
    }

    public T getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(T accInfo) {
        this.accInfo = accInfo;
    }

    public void getWithdraw(int ttt) throws NegativeValueException {
        if (ttt < 0) {
            NegativeValueException e1 = new NegativeValueException("Error");
            throw e1;
        }
        else
            this.withdraw = ttt;

    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposite() {
        return deposite;
    }

    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }

    @Override
    public String toString() {
        String str = "Account Info: "+accInfo+"\n"+withdraw;
        return str;
    }
}

class Account {

    public static void main(String[] args)  {
        
        try {
            ACC <String> a1 = new ACC("333",5,6);
            System.out.println(a1.toString());
            
        } catch (NegativeValueException e1) {
            System.out.println(e1);
        }

    }
}
