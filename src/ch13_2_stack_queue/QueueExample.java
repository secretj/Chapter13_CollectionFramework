package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue =new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKAKAOTALK", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			Message message =messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to +"��������");
				break;
			case "sendSMS" :
				System.out.println(message.to +"SMS����");
				break;
			case "sendKAKAOTALK" :
				System.out.println(message.to +"īī���� ����");
				break;
			}
		}
	
	
	}
}
