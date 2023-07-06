class Tidspunkt implements Comparable<Tidspunkt> {
    public int aar, mnd, dag, time, min, sek;
    private int tidspunktComp;
    
    Tidspunkt(int aar, int mnd, int dag, int time, int min, int sek) {
        this.aar = aar;
        this.mnd = mnd;
        this.dag = dag;
        this.time = time;
        this.min = min;
        this.sek = sek;
        
        
        tidspunktComp = (aar*100000) + (mnd*10000) + (dag*1000) + (time*100) + (min*10) + (sek*1);
    }
    
    public int compareTo(Tidspunkt t) {
        return (tidspunktComp - t.tidspunktComp);
    }

    public Tidspunkt hentTid() {
        return this;
    }
}