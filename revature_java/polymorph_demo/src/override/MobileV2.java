package override;

public class MobileV2 extends MobileV1 {

	
	public void videoCalling() {
		System.out.println("video calling feature of V2");
	}
	
	public void gaming() {
		System.out.println("Gaming feature of V2");
	}
	
	public void browsing() {
		System.out.println("Browsing feature of V2");
	}
	@Override
	public void displayMenu() {
		System.out.println("Menu in V2 upgraded to GRID view");
	}
}
