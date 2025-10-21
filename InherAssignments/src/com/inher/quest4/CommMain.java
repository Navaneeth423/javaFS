package com.inher.quest4;
import java.util.*;

public class CommMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice of Communication: ");
		System.out.println("1.Mail\n2.SMS\n3.Phone\n4.Whatsapp\n5.Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			Communication mail = new MailCommunication();
			mail.sendMessage();
			String[] types = ((MailCommunication) mail).showTypes();
			for(String type : types) {
				System.out.println(type);
			}
			break;
		case 2:
			Communication sms = new SMSCommunication();
			sms.sendMessage();
			((SMSCommunication)sms).messageLength();
			break;
		case 3:
			Communication phone = new PhoneCommunication();
			phone.sendMessage();
			((PhoneCommunication)phone).callService();
			break;
		case 4:
			Communication whatsapp = new WhatsappCommunication();
			whatsapp.sendMessage();
			((WhatsappCommunication)whatsapp).otherFeatures();
			break;
		case 5:
			System.out.println("Exiting Comms Service!");
			break;
		default:
			System.out.println("Invalid Option!!!");
			break;
		}
	}
}
