import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Command")
public class Command {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String prefix;
    private String command;
    private String content;
    
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }




    public Command(String Message) {
        this.prefix = Message.substring(0,1);
        if (prefix.equals("!")){
            if (Message.contains(" ")){
                command = Message.substring(1,Message.indexOf(" "));
                content = Message.substring(Message.indexOf(" "));
                content = content.substring(1);
            }
            else{
                command = Message.substring(1);
            }
        }
        else {
            return;
        }
    }
}
