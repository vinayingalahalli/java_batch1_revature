package example_inheritance1;

public class WhatsAppV3 extends WhatsAppV2 {

	public void videoCalls() {
		System.out.println("Video Calling feature of V3");
	}
	
	public void videoStreaming() {
		System.out.println("Stream videos of Youtube from V3 of WhatsApp");
	}
	
	public WhatsAppV3() {
		System.out.println("V3");
	}
}
