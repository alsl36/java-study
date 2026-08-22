package interfaceCode;

public class SmartTelevision implements RemoteControl2, Searchable {
    public void turnOn() {
        System.out.println("tv를 켭니다.");
    }
    public void turnOff() {
        System.out.println("tv를 끕니다.");
    }
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}