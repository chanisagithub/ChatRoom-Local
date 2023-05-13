/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

/**
 *
 * @author chani
 */
public class ChatRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ChatObservable chatobservable=new ChatObservable();
        
        chatobservable.addChatObserver(new chatWindow("Nimal",chatobservable));
        chatobservable.addChatObserver(new chatWindow("Kamal",chatobservable));
    
    
    }   
}
