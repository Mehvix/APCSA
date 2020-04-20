/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Arrays;

public class Q2_LogMessage {
    private String machineId;
    private String description;

    public Q2_LogMessage(String message){
        int colonIndex = message.indexOf(":");

        machineId = message.substring(0, colonIndex);
        description = message.substring(colonIndex + 1, message.length());  // +1 to not include colon
    }

    public boolean containsWord(String keyword){
        String[] descSplit = description.split(" ");

        for (String s : descSplit) {
            if (s.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

    public String getMachineId(){
        return machineId;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        Q2_LogMessage l1 = new Q2_LogMessage("CLIENT3:security alert – repeated login failures");
        Q2_LogMessage l2 = new Q2_LogMessage("Webserver:disk offline");
        Q2_LogMessage l3 = new Q2_LogMessage("SERVER1:file not found");
        Q2_LogMessage l4 = new Q2_LogMessage("SERVER2:read error on disk DSK1");
        Q2_LogMessage l5 = new Q2_LogMessage("SERVER1:write error on disk DSK2");
        Q2_LogMessage l6 = new Q2_LogMessage("Webserver:error on /dev/disk");

        System.out.println(l3.getDescription());
        System.out.println(l3.containsWord("file"));
    }
}
