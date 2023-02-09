public class Chicago{ // street class
    static Victim innocents[]; // puts in victims vans and alleys
    static WhiteVan kidnappers[];
    static DarkAlley theStreets[];
    public Chicago(int numVictims, int numVans){ // for tester, allows us to input numvic and numvan easily
        innocents = new Victim[numVictims];
        kidnappers = new WhiteVan[numVans];
        theStreets = new DarkAlley[31];
        for(int bala = 0;bala < theStreets.length;bala++){theStreets[bala] = new DarkAlley(bala);} // loops through victims and vans adding them
        for(int bala = 0; bala < kidnappers.length;bala++){kidnappers[bala] = new WhiteVan();}
        for(int bala = 0; bala < innocents.length;bala++){
            innocents[bala] = new Victim();
            (theStreets[innocents[bala].location]).addVictim(innocents[bala]);
        }
        
    }
}
