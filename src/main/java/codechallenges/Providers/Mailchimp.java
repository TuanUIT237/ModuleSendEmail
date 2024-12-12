package codechallenges.Providers;

public class Mailchimp implements  SendEmail{
    private String email1;
    private String text1;

    public Mailchimp(String email1, String text1) {
        this.email1 = email1;
        this.text1 = text1;
    }

    @Override
    public void send()
    {
        System.out.println("Send mailchimp: ");
        System.out.println("Email address: " + email1);
        System.out.print("Message: " + text1);
    }
}
