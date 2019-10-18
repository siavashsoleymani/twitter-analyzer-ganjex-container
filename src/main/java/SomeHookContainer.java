import com.piranframework.ganjex.api.ServiceContext;
import com.piranframework.ganjex.api.ShutdownHook;
import com.piranframework.ganjex.api.StartupHook;

public class SomeHookContainer {
    @StartupHook
    public void start(ServiceContext context){
        System.out.println("starting: " + context.getName());
        System.out.println("starting: " + context.getFileName());
    }

    @ShutdownHook
    public void destroy(ServiceContext context){
        System.out.println("ending: " + context.getName());
        System.out.println("ending: " + context.getFileName());
    }
}
