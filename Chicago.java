public class Chicago{
    static Victim innocents[];
    static WhiteVan kidnappers[];
    static DarkAlley theStreets[];
    public Chicago(int numVictims, int numVans){
        innocents = new Victim[numVictims];
        kidnappers = new WhiteVan[numVans];
        theStreets = new DarkAlley[31];
        for(int bala = 0;bala < theStreets.length;bala++){theStreets[bala] = new DarkAlley(bala);}
        for(int bala = 0; bala < kidnappers.length;bala++){kidnappers[bala] = new WhiteVan();}
        for(int bala = 0; bala < innocents.length;bala++){
            innocents[bala] = new Victim();
            (theStreets[innocents[bala].location]).addVictim(innocents[bala]);
        }
        
    }
}
