
public class Song {
	private int year;
	private String title,artist,country;
	public Song() {};
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	public void show() {
		System.out.print(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	
	public static void main(String[] args) {
		Song s = new Song(1978 , "������","ABBA","Dancing Queen");
		s.show();
				
	}
}
