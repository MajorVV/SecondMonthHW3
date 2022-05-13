public class LimitException extends  Exception{

    private double remainingAmmount;
    public double getRemainingAmmount() {
        return remainingAmmount;
    }



    public LimitException(String message, double remainingAmmount) {
        super(message);
        this.remainingAmmount = remainingAmmount;
    }


}
