import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task1.FacebookUser;
import com.example.task1.FacebookUserAdapter;
import com.example.task1.MessageSender;
import com.example.task1.TwitterUser;
import com.example.task1.TwitterUserAdapter;
import com.example.task1.User;




public class Task1Tests {
    @Test
    public void testAllArguments() {
      FacebookUser facebookUser = new FacebookUser("bob", 1, "Ukraine");
      TwitterUser twitterUser = new TwitterUser("tip", 0, "Ukraine");
      TwitterUser twitterUser1 = new TwitterUser("tip2", 0, "Ukraine");
      FacebookUserAdapter facebookUserAdapter = new FacebookUserAdapter(facebookUser);
      TwitterUserAdapter twitterUserAdapter = new TwitterUserAdapter(twitterUser);
      TwitterUserAdapter twitterUserAdapter1 = new TwitterUserAdapter(twitterUser1);
      MessageSender messageSender = new MessageSender();
      messageSender.add_user(facebookUserAdapter);
      messageSender.add_user(twitterUserAdapter);
      Assertions.assertEquals(messageSender.send("HI", twitterUserAdapter, "Ukraine"),"Country or activity time error");
      Assertions.assertEquals(messageSender.send("HI", facebookUserAdapter, "Ukraine"),"Sent succesfully to bob");
      Assertions.assertEquals(messageSender.send("HI", twitterUserAdapter1, "Ukraine"),"No such user");
       }
     @Test
    public void testFewArguments() {
        }

}