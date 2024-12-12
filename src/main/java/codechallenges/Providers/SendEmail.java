package codechallenges.Providers;

public interface SendEmail {
    default void send()
    {
        System.out.println("Send email default");
    }
}
