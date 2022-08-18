package hello.core.singleton;

public class SingletonService {
    //1. static 영역 -> 객체를 하나만 생성
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회 허용
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private -> new 키워드로 객체 생성 x
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
