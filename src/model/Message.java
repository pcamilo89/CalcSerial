package model;

public class Message {
    private static String msg = "";

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        Message.msg = msg;
    }
    
    public static void fillMsg(char c){        
        msg = msg + c;        
    }
    
    public static char getLastChar(){
        if(msg.length() > 0)
            return msg.charAt(msg.length()-1);
        return 'q';
    }
    
    public static void clearMsg(){
        msg = "";
    }
}
