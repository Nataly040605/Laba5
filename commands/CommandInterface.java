package commands;

import java.util.List;

public interface CommandInterface {
	void execute(List<Object> arguments);
    int getCountOfArguments();
}
