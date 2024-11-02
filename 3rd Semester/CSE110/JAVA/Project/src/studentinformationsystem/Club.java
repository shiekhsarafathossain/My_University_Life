package studentinformationsystem;

import java.io.IOException;

public class Club {

    private String clubName, clubPosition;

    public Club() {
    }

    public Club(String clubName, String clubPosition) throws IOException {
        if (clubName instanceof String && clubPosition instanceof String) {
            this.clubName = clubName;
            this.clubPosition = clubPosition;
        } else {
            throw new IOException("Exception");
        }
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) throws IOException {
        if (clubName instanceof String) {
            this.clubName = clubName;

        } else {
            throw new IOException("Exception");
        }
        // this.clubName = clubName;
    }

    public String getClubPosition() {
        return clubPosition;
    }

    public void setClubPosition(String clubPosition) throws IOException {
        
         if (clubPosition instanceof String) {
            
            this.clubPosition = clubPosition;
        } else {
            throw new IOException("Exception");
        }
        
        //this.clubPosition = clubPosition;
    }
    
    

    public String display() {
        return "Club Name: " + clubName
                + "\nClub Position: " + clubPosition;

    }

}
