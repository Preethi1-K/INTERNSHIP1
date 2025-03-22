class Speaker{
static String brand="pTron";
static int speakerMaximumoutputPower=10; 
static int frequencyResponse=20000;
static String connectivityTechnology="Bluetooth";
static String audioOutputMode="Stereo";
public static void main(String arg[])
{
	System.out.println("the brand of speaker is "+brand);
	System.out.println("the max power of speaker is"+speakerMaximumoutputPower);
	System.out.println("the frequency response of speaker is"+frequencyResponse);
	System.out.println("the technology os speaker is"+connectivityTechnology);
	System.out.println("the audio output mode of speaker is"+audioOutputMode);
	update();
	System.out.println("the brand of speaker is "+brand);
	System.out.println("the max power of speaker is"+speakerMaximumoutputPower);
	System.out.println("the frequency response of speaker is"+frequencyResponse);
	System.out.println("the technology os speaker is"+connectivityTechnology);
	System.out.println("the audio output mode of speaker is"+audioOutputMode);

}
public static void update()
{
	brand="Tron";
	speakerMaximumoutputPower=100; 
	frequencyResponse=30000;
	connectivityTechnology="Bluetooth";
	audioOutputMode="static";
}
}