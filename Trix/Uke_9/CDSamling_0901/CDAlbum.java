public class CDAlbum implements Comparable<CDAlbum> {
    String artistNavn;
    String albumNavn;
    int utgivelsesAar;

    public CDAlbum(String artistNavn, String albumNavn, int utgivelsesAar) {
        this.artistNavn = artistNavn;
        this.albumNavn = albumNavn;
        this.utgivelsesAar = utgivelsesAar;
    }

    public String hentArtist() {return artistNavn;}

    public String toString() {return "Artist: " + artistNavn + ". Album: " + albumNavn + ". Utgivelsesår: " + utgivelsesAar;}

    public int compareTo(CDAlbum album) {
        return artistNavn.compareTo(album.artistNavn);
    }
}