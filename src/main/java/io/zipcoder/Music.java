package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        // left count initialisation
        int lCount=0;

        // right count initialisation
        int rCount=0;

        //counting from the right
        int k=startIndex;
        while(playList[k]!=selection){
            k++;
            rCount++;
            if(k==playList.length){
                k=0;
            }

        }

        //counting from the left
        int m=startIndex;
        while(playList[m]!=selection){
            m--;
            lCount++;

            if(m<0){
                m=playList.length-1;
            }

        }

        if(lCount<=rCount){
            return lCount;
        }

        return rCount;
    }


}
