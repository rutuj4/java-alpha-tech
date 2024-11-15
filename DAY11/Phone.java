interface ICamera  {
	void captureImage();
}

interface IScreenShot extends ICamera {
	void screenShot();
}

interface IRecordVideo extends ICamera {
	void startRecording();
	void stopRecording();
}



class Gallery implements ICamera, IScreenShot {
	
	@Override	
	public void captureImage(){
		System.out.println("Capturing Image..");
	}

	@Override	
	public void screenShot(){
		System.out.println("Taking screenshot..");
	}

		
	public void startRecording(){
		System.out.println("Start Recording Video..");
	}

		
	public void stopRecording(){
		System.out.println("Stop Recording Video..");
	}
	
}


public class Phone{
	public static void main(String []args) {
		Gallery samsung = new Gallery();
		samsung.captureImage();
		samsung.screenShot();
		samsung.startRecording();
		samsung.stopRecording();
	}
}