package flack.commands;

import java.util.ArrayList;
import java.util.List;

import flack.control.Event;

/**
 * Allows for multiple commands to be invoked, one
 * after another.
 * 
 * @author je bailey
 *
 */
public class MultipleCommand implements Command {
	
	private List<Command>list = new ArrayList<Command>();
	
	public boolean add(Command command){
		return list.add(command);
	}
	

	@Override
	public void process(Event event) {
		for (Command command:list){
			command.process(event);
		}
	}

}
