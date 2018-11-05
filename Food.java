package EmploeeControler;

public class Food {
    private int gheyme=0,khorak=0,kotlet=0,olvie=0,shenisel=0,adaspolo=0,kubide=0,joje=0;

    void lunch(int l){
        switch (l){
            case 1 :gheyme++;
            break;
            case 2 :joje++;
            break;
            case 3 :kubide++;
            break;
            case 4:adaspolo++;
        }


    }
    void dinner(int d){
        switch (d){
            case 1:shenisel++;
            break;
            case 2 :olvie++;
            break;
            case 3 :kotlet++;
            break;
            case 4 : khorak++;

        }

    }
}
