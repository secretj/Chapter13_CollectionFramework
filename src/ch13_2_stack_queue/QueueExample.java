package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue =new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKAKAOTALK", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message =messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to +"메일전송");
				break;
			case "sendSMS" :
				System.out.println(message.to +"SMS전송");
				break;
			case "sendKAKAOTALK" :
				System.out.println(message.to +"카카오톡 전송");
				break;
			}
		}
	
	
	}
}
