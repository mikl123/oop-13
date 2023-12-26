import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task2.AuthorizationAdapter;
import com.example.task2.DataBaseAdapter;
import com.example.task2.ReportBuilder;
import com.example.task3.DataRetriver;

public class Task3Tests {
    @Test
    public void testAllArguments() throws IOException {
    DataRetriver dataRetriver = new DataRetriver();
    Assertions.assertEquals(dataRetriver.brendfetch_data("Spotify.com").getName(), "Spotify"); 
    Assertions.assertEquals(dataRetriver.brendfetch_data("Spotify.com").getDescription(), "Spotify is all the music you’ll ever need."); 
    Assertions.assertEquals(dataRetriver.brendfetch_data("Spotify.com").getLogo(), "[{\"formats\":[{\"size\":6918,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idEZjJ4z_r.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":15184,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idc38-1wKu.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":240}],\"theme\":\"light\",\"type\":\"logo\",\"tags\":[]},{\"formats\":[{\"size\":6918,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idCv-OrMiy.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":19462,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idkAyigbW-.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":240}],\"theme\":\"dark\",\"type\":\"logo\",\"tags\":[]},{\"formats\":[{\"size\":1940,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idDGKt5UIT.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":22824,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idwYhZOYtm.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":800}],\"theme\":\"light\",\"type\":\"symbol\",\"tags\":[]},{\"formats\":[{\"size\":1940,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idnZiPe__8.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":36062,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idyE-PQqf2.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":800}],\"theme\":\"dark\",\"type\":\"symbol\",\"tags\":[]},{\"formats\":[{\"size\":13384,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idT9LYHrc_.jpeg\",\"background\":null,\"format\":\"jpeg\",\"width\":400,\"height\":400}],\"theme\":\"dark\",\"type\":\"icon\",\"tags\":[]},{\"formats\":[{\"size\":6915,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idv3Fj71K2.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":18936,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idaz_uyGtD.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":240}],\"theme\":null,\"type\":\"other\",\"tags\":[]},{\"formats\":[{\"size\":1940,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idXI5sPVCZ.svg\",\"background\":\"transparent\",\"format\":\"svg\"},{\"size\":34772,\"src\":\"https://asset.brandfetch.io/id20mQyGeY/idJz40EzJL.png\",\"background\":\"transparent\",\"format\":\"png\",\"width\":800,\"height\":800}],\"theme\":null,\"type\":\"other\",\"tags\":[]}]");    }
}
