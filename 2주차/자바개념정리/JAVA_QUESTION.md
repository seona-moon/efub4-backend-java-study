# 자바 핵심 개념 정리 2
<details>
<summary>JAVA의 접근 제어자의 종류와 특징에 대해 설명해주세요.</summary>
<div markdown="1">
접근 제어자는 클래스, 변수, 메서드 등에 대한 다른 클래스에서의 접근수준을 선언하는 지시어입니다.<br>

### public:
- 어떤 클래스에서든 접근할 수 있습니다.
- 가장 넓은 범위의 접근성을 제공합니다.

### protected:
- 같은 패키지 내의 다른 클래스 또는 다른 패키지에 있는 자식 클래스에서 접근할 수 있습니다.

### default (접근 제어자를 생략했을 때):
- 같은 패키지 내의 클래스들만 접근할 수 있습니다.
- 어떤 접근 제어자도 명시하지 않으면 자동으로 `default` 접근성이 적용됩니다.

### private:
- 오직 같은 클래스 내에서만 접근할 수 있습니다.
- 가장 제한적인 접근성을 제공하며, 클래스의 세부 구현을 숨기는 데 사용됩니다.
- 클래스 외부에서는 접근할 수 없으므로 데이터의 무결성을 보장하는데 유용합니다.

</div>
</details>
<br>

<details>
<summary>OOP의 5대 원칙 (SOLID)에 대해 설명해주세요.</summary>
<div markdown="1">

### SRP: 단일 책임 원칙 (Single Responsibility Principle)
- 한 클래스는 하나의 책임만 가져야한다.
- 하나의 책임이란? -> '변경이 있을 때 파급 효과'에 대한 것이 기준

### OCP: 개방-폐쇄 원칙 (Open/Closed Principle)
- 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.

### LSP: 리스코프 치환 원칙 (Liskov Substitution Principle)
- 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
- 즉, 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 함.

### ISP : 인터페이스 분리 원칙 (Interface segregation principle)
- 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다. 
- e.g., 자동차 인터페이스가 운전 인터페이스와 정비 인터페이스로 나뉘어져 있을 때 정비쪽에 변경이 필요하면 운전은 건드리지 않고 정비만 변경하면 된다.

### DIP : 의존관계 역전 원칙 (Dependency inversion principle)
- 추상화에 의존하지, 구체화에 의존하면 안 된다.
- 구현 클래스에 의존하지 말고, 인터페이스에 의존해야한다.
</div>
</details>
<br>

<details>
<summary>non-static 멤버와 static 멤버의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
- 인스턴스의 유무: Non-static 멤버는 클래스의 인스턴스가 필요하지만, static 멤버는 인스턴스 없이 사용할 수 있습니다.
- 메모리 공간: Non-static 멤버는 각 인스턴스마다 별도의 메모리 공간을 차지하는 반면, static 멤버는 클래스 당 한 번만 메모리 공간을 차지하고 모든 인스턴스가 이를 공유합니다.
- 용도: Non-static 멤버는 인스턴스마다 다른 값을 가질 때 사용하고, static 멤버는 인스턴스 간에 공유되어야 하는 값을 관리하거나 인스턴스 생성 없이 호출되어야 하는 메소드에 사용됩니다.

```java
public class Car {
    // non-static 멤버 변수: 각 Car 인스턴스의 고유 정보
    private String model;
    private int year;

    // static 멤버 변수: 모든 Car 인스턴스에 공유되는 정보
    private static int numberOfCars = 0;

    // 생성자
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        // Car 인스턴스가 생성될 때마다 카운트 증가
        numberOfCars++;
    }

    // non-static 메소드: 인스턴스 데이터에 접근
    public void displayInfo() {
        System.out.println("Car model: " + model + ", Year: " + year);
    }

    // static 메소드: static 변수에 접근
    public static void displayTotalCars() {
        System.out.println("Total number of cars: " + numberOfCars);
    }

    // Main 메소드를 포함하는 Car 클래스
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 2020);
        Car car2 = new Car("Ford Mustang", 2022);

        // 인스턴스 메소드 호출
        car1.displayInfo();
        car2.displayInfo();

        // static 메소드 호출: 클래스 이름을 통해 직접 접근
        Car.displayTotalCars();
    }
}
```

</div>
</details>
<br>

<details>
<summary>클래스, 객체, 인스턴스의 차이에 대해 설명해주세요.</summary>
<div markdown="1">

### 클래스(Class)
클래스는 객체를 생성하기 위한 템플릿 또는 설계도입니다. 클래스는 객체의 상태를 나타내는 필드(변수)와 객체의 행위를 정의하는 메서드(함수)를 포함합니다. 클래스는 객체의 구조와 행위를 정의하지만, 실제 데이터는 가지고 있지 않습니다. 예를 들어, '자동차' 클래스는 자동차의 속성(색상, 브랜드 등)과 기능(가속하기, 정지하기 등)을 정의할 수 있습니다.
<br>

### 객체(Object)
객체는 클래스에 정의된 속성과 동작을 실제 메모리 상에 할당하여 실체화된 것입니다. 즉, 클래스를 기반으로 생성된 실체를 의미합니다. 객체는 소프트웨어 세계에서 실제 생활의 객체를 모델링한 것으로, 실제로 메모리에 할당되어 실제 값을 가지고 있으며, 정의된 행위를 수행할 수 있습니다.
<br>

### 인스턴스(Instance)
인스턴스는 객체와 매우 유사한 개념입니다. 보통, 특정 클래스로부터 생성된 객체를 그 클래스의 인스턴스라고 합니다. 즉, 인스턴스는 메모리에 할당된 객체를 특정 클래스의 관점에서 바라본 용어입니다. 예를 들어, '자동차' 클래스로부터 생성된 '내 자동차' 객체는 '자동차' 클래스의 인스턴스입니다.
</div>
</details>
<br>

<details>
<summary>⭐️ 프로세스, 스레드, 멀티프로세스, 멀티스레드에 대해 설명해주세요.</summary>
<div markdown="1">

### 프로세스
- 실행 중인 프로그램.(프로세서=CPU)
- 독립적인 메모리 할당

### 스레드
- 프로세스 내에서 실행되는 실행 흐름으로, 메모리(스택은 x)를 공유할 수 있음.

### 멀티프로세스
- 여러 프로세스가 동시에 실행되는 환경, 각각 독립된 자원 사용.
- 프로세스 간 통신과 컨텍스트 스위칭으로 인한 오버헤드 위험성
- 오버헤드(overhead): 어떤 작업을 수행하기 위해 필요하지만, 직접적으로 작업의 결과를 생성하지 않는 데 사용되는 자원이나 시간

### 멀티스레드
- 하나의 프로세스에서 여러 스레드가 동시에 실행되는 환경, 자원 공유로 효율성 증가. but 동기화 문제로 인한 복잡성과 데이터 일관성에 대한 문제를 관리 요구
</div>
</details>
<br>