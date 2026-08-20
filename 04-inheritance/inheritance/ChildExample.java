package inheritance;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1(); // 부모의 메소드는 전부 상속되므로 자식 클래스에도 method1이 존재한다고 생각 가능.
        parent.method2(); // 오버라이딩 된 함수 호출됨.
        // parent.method3() 는 호출 불가능
    }
}
