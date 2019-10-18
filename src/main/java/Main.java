import com.piranframework.ganjex.api.Ganjex;
import com.piranframework.ganjex.api.GanjexConfiguration;

public class Main {
    public static void main(String[] args) {
        Ganjex.run(new GanjexConfiguration.Builder()
                .libPath("/home/IdeaProjects/ganjexlibs")
                .servicePath("/home/siavash/IdeaProjects/ganjexservices")
                .watcherDelay(1)
                .hooks(new SomeHookContainer())
                .build());

    }
}
