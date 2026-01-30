class VolumeOfEarth
{
	public static void main(String args[])
	{
		double radiuskm = 6378;
		double pi = 3.141;
		double volumekm = (4.0/3.0)*pi*radiuskm*radiuskm*radiuskm;
		double radiusMiles = radiuskm*0.621371;
		double volumeMiles = (4.0/3.0)*pi*radiusMiles*radiusMiles*radiusMiles;
		System.out.println("The volume of Earth in cubic Kilometers is" +volumekm);
		System.out.println("The volume of Earth in cubic miles is"+volumeMiles);
	}
}
