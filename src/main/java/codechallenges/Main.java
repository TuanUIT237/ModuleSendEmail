package codechallenges;

import codechallenges.Providers.Mailchimp;
import codechallenges.Providers.SendEmail;
import codechallenges.Providers.SendGrid;
import codechallenges.Providers.SendInBlue;

public class Main {
    public static void main(String[] args) {
        SendEmail sendEmail = new Mailchimp("domanhtuan237@gmail.com","Gửi code bài tập code challenges");
        sendEmail.send();
    }
}