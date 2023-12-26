import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task2.AuthorizationAdapter;
import com.example.task2.DataBaseAdapter;
import com.example.task2.ReportBuilder;
import com.example.task2.Авторизація;
import com.example.task2.БазаДаних;

public class Task2Tests {
     @Test
    public void testAllArguments() {
    DataBaseAdapter baseAdapter = new DataBaseAdapter();
    AuthorizationAdapter authorizationAdapter = new AuthorizationAdapter();
    if (authorizationAdapter.authorize(baseAdapter)) {
        ReportBuilder br = new ReportBuilder(baseAdapter);
    }
    }
    @Test
    public void testMethods() {
    DataBaseAdapter baseAdapter = new DataBaseAdapter();
    AuthorizationAdapter authorizationAdapter = new AuthorizationAdapter();
    Авторизація авторизація = new Авторизація();
    БазаДаних базаДаних = new БазаДаних();
    Assertions.assertEquals(авторизація.авторизуватися(базаДаних), authorizationAdapter.authorize(baseAdapter));
    Assertions.assertEquals(базаДаних.отриматиСтатистичніДані(), baseAdapter.getStatisticData());
    }
}
