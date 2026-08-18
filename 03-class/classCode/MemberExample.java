package classCode;

public class MemberExample {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        System.out.printf("%s %s %s %d", user1.name, user1.id, user1.password, user1.age);
    }
    
}
