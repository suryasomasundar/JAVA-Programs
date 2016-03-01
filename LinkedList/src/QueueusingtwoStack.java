//import java.util.Queue;
import java.util.Stack;


public class QueueusingtwoStack {

	private Stack<Integer> inbox = new Stack<Integer>();
	private Stack<Integer> outbox = new Stack<Integer>();
	
	public void queue(int item){
		inbox.push(item);
	}
	public int deque(){
		if(outbox.isEmpty()){
			while(!inbox.isEmpty()){
				outbox.push(inbox.pop());
				}
		}
		return outbox.pop();
	}
}

