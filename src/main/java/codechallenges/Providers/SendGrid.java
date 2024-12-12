package codechallenges.Providers;

public class SendGrid implements SendEmail{
    private String email;
    private String text;

    public SendGrid(String email, String text) {
        this.email = email;
        this.text = text;
    }
    @Override
    public void send()
    {
        System.out.println("Send email grid: ");
        System.out.println("Email address: " + email);
        System.out.print("Message: " + text);
    }
}
