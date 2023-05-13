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
public class ChatObservable {
    
    List<ChatObserver> chatOberserverList=new List<>();
    
    public void addChatObserver(ChatObserver chatObserver){
        chatOberserverList.add(chatObserver);
    }
    public void removeChatObserver(ChatObserver chatObserver){
        chatOberserverList.remove(chatObserver);
    }
    public void notifyChatObservers(String message){
        for(int i=0; i<chatOberserverList.size(); i++) {
            ChatObserver chatObserver=chatOberserverList.get(i);
            chatObserver.update(message);
        }
    }
}
