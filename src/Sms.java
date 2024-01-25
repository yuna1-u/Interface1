public class Sms implements NotificationSender {

    private int number;

    public Sms(int number) {
        this.number = number;
    }

    @Override
    public void sendNotification() {
        System.out.println("Отправка уведомленияя на номер " + getNumber() + " бла бла бла бла...");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
