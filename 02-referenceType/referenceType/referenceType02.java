package referenceType;

public class referenceType02 {
    public static void main(String[] args) {
        String hobby = "여행"; // "여행" 이라는 데이터를 가진 객체가 생성됨.
        hobby = null; // "여행" 객체의 위치를 아는 변수가 아무도 없기에 "여행" 객체는 Garbage Collector에 의해 삭제됨.

        String name1 = "홍길동";
        String name2 = "홍길동";
        System.out.println(name1 == name2); // String 객체의 경우 필드값이 동일하면 동일한 객체를 참조하도록 설계되어 있음. (객체를 공유하도록)

        String name3 = new String("홍길동");
        String name4 = new String("홍길동");
        System.out.println(name3 == name4); // new 명령어를 통해 새로운 객체를 아예 생성해버렸기에 객체를 공유하지 않음.

        boolean result = name3.equals(name4); // 문자열 값 즉, 데이터 필드만 비교하는 메소드
        System.out.println(result);

        String subject = "자바 프로그래밍";
        char charValue = subject.charAt(3); // 특정 index값 추출하는 메소드
        int length = subject.length(); // 문자열의 길이 추출하는 메소드
        System.out.println(charValue);
        System.out.println(length);

        String newStr = subject.replace("자바", "JAVA");
        System.out.println(newStr);

        String firstStr = subject.substring(0,2);
        System.out.println(firstStr);

        int index = subject.indexOf("프로그래밍");
        System.out.println(index);



    }
    
}
