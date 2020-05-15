/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class DownloadInfo {
    private String title;
    private int count;

    public DownloadInfo(String title){
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public  void incrementTimesDownloaded(){
        count ++;
    }
}
