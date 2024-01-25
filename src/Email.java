public class Email implements NotificationSender {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println("Отпарвка уведомление на почту " + getEmail() + " бла бла бла бла..");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
