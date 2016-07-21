package design.pattern.command;

public class ShutDownCommand extends Command {

	public ShutDownCommand() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ShutDownCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void invokeReceiver(Receiver receiver) {
		// TODO Auto-generated method stub
		receiver.shutdown();
	}

}
