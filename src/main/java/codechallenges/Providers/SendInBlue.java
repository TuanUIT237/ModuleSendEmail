package codechallenges.Providers;

public class SendInBlue implements SendEmail{
    private String email_address;
    private String message;

    public SendInBlue(String email_address, String message) {
        this.email_address = email_address;
        this.message = message;
    }

    @Override
    public void send()
    {
        System.out.println("Send email in blue: ");
        System.out.println("Email address: " + email_address);
        System.out.print("Message: " + message);
    }
}
