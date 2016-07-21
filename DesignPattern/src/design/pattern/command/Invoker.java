package design.pattern.command;

public class Invoker {
	
	private Command command;
	
	public Invoker(){
		
	}
	
	public Invoker(Command command){
		this.command=command;
	}
	
	public void excuteCommand(){
		if(command!=null)
			excuteCommand(command);
	}
	
	public void excuteCommand(Command command){
		command.excute();
	}
	
	public static void main(String[] args) {
		Receiver receiver=new Receiver();
		Command command=new ShutDownCommand(receiver);
		Invoker invoker=new Invoker();
		invoker.excuteCommand(command);
	}
	
}
