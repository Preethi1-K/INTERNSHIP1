class Series{
static String hindiSeries[]={"Kotafactory","Mirzapur","Flames","Rocketboys","Scaredgames","Aspirants","Breathe","Panchayat","Delhicrime","Gullak"};
static String kannadaSeries[]={"Kannadathi","Jeevanachaitra"," Madgubala","SilliLalli","shubhaMangala","Nammaneyavarani","MajaTalkies","Madhubala","Radhakalyana","Mahabaratha"};
static String malayalamMovies[]={"Drishyam","Premam","KumbalangiNights","BangloreDays","Uyare","Maheshinteprathikaaram","SuperDeluxe","Eeda","Theevandi","C Usoon"};
static String englishSeries[]={"Friends","StrangerThings","TheOffice","Game of Thrones","Breaking Bad","The Crown","sherlock","MoneyHeist","Black Mirror","The Mandalorien"};
public static void main(String arg[])
{
	System.out.println("the start of  main method");
	getHindiseries();
	getKannadaseries();
	getMalayalamseries();
	getEnglishseries();
	System.out.println("the end of main method");
}
public static void getHindiseries()
{
	System.out.println("the inside of hindiseries");
	for(String hindi:hindiSeries)
	{
		System.out.println(hindi);
	}
	System.out.println("the end of hindiseries");
}
public static void getKannadaseries()
{
	System.out.println("the inside of kannadaseries");
	for(String kannada:kannadaSeries){
		System.out.println(kannada);
	}
	System.out.println("the end of kannadaseries");
}
public static void getMalayalamseries()
{
	System.out.println("the inside of malayalamseries");
	for(String malayalum:malayalamMovies){
		System.out.println(malayalum);
	}
	System.out.println("the end of malayalum series");
}
public static void getEnglishseries()
{
	System.out.println("the inside of Englishseries");
	for(String english:englishSeries)
	{
		System.out.println(english);
	}
	System.out.println("the end of Englishseries");
}
}

//System.out.println(hindiSeries[0]+" "+hindiSeries[1]+" "+hindiSeries[2]+" "+hindiSeries[3]+" "+hindiSeries[4]+" " +hindiSeries[5]+" "+hindiSeries[6]+" "+hindiSeries[7]+" "+hindiSeries[8]+" "+hindiSeries[9]); 
//System.out.println(kannadaSeries[0]+" "+kannadaSeries[1]+" "+kannadaSeries[2]+" "+kannadaSeries[3]+" "+kannadaSeries[4]+" "+kannadaSeries[5]+" "+kannadaSeries[6]+" "+kannadaSeries[7]+" "+kannadaSeries[8]+" "+kannadaSeries[9]);
//System.out.println(malayalamMovies[0]+" "+malayalamMovies[2]+" "+malayalamMovies[3]+" "+malayalamMovies[4]+" "+malayalamMovies[5]+" "+malayalamMovies[6]+" "+malayalamMovies[7]+" "+malayalamMovies[8]+" "+malayalamMovies[9]);
//System.out.println(englishSeries[0]+" "+englishSeries[1]+" "+englishSeries[2]+" "+englishSeries[3]+" "+englishSeries[4]+" "+englishSeries[5]+" "+englishSeries[6]+" "+englishSeries[7]+" "+englishSeries[8]+" "+englishSeries[9]);
//System.out.println("the number of items of hindiseries:"+hindiSeries.length);
//System.out.println("the number of items of kannadaseries:"+kannadaSeries.length);
//System.out.println("the number of malayalammovies:"+malayalamMovies.length);
//System.out.println("the number of englishseries:"+englishSeries.length);

