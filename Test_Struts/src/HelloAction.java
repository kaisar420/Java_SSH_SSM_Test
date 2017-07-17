import com.opensymphony.xwork2.Action;

/**
 * Created by root on 17-7-17.
 */
public class HelloAction {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String execute(){
        message ="Hello IM iparhan";
        System.out.println("SUCCESS");
        return Action.SUCCESS;
    }
}
