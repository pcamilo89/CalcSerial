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
    
    public static void clearMsg(){
        msg = "";
    }
}
