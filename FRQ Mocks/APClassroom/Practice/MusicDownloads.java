/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }

    public DownloadInfo getDownloadInfo(String title){
        for (DownloadInfo downloadInfo : downloadList) {
            if (downloadInfo.getTitle().equals(title)) {
                return downloadInfo;
            }
        }
        return null;
    }

    public void updateDownloads(List<String> titles){
        for (String title : titles) {
            if (getDownloadInfo(title) == null) downloadList.add(new DownloadInfo(title));
            else getDownloadInfo(title).incrementTimesDownloaded();
        }
    }
}
