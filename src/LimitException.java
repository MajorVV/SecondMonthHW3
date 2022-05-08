public class LimitException extends  Exception{
//    LimitException(String message, double remainingAmount){
//        getRemainingAmount();
//    }
//
//    private void getRemainingAmount() {
//    }

    public double getRemainingAmmount() {
        return remainingAmmount;
    }

    public void setRemainingAmmount(double remainingAmmount) {
        this.remainingAmmount = remainingAmmount;
    }

    public LimitException(String message, double remainingAmmount) {
        super(message);
        this.remainingAmmount = remainingAmmount;
    }

    private double remainingAmmount;
}
