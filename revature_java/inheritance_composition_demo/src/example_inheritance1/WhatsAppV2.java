package example_inheritance1;

public class WhatsAppV2 extends WhatsAppV1{

	public void voiceMessages() {
		System.out.println("Voice Message feature of V2");
	}
	
	public void voiceCalls() {
		System.out.println("Voice calling feature of V2");
	}
	
	public WhatsAppV2() {
		System.out.println("V2");
	}
}
